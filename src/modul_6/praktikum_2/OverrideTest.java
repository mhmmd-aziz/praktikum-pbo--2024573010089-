package modul_6.praktikum_2;

public class OverrideTest {
    public static void main(String[] args) {
        // Membuat objek Car dan memanggil metode-metodenya
        Car car = new Car("Toyota", 180, 4);

        // Memanggil method yang di-override dari Vehicle
        car.start();
        car.displayInfo();

        // Memanggil method khusus milik Car
        car.honk();

        // Demonstrasi polymorphism: objek Car disimpan sebagai Vehicle
        Vehicle vehicle = new Car("Honda", 200, 2);

        // Tetap memanggil versi method yang di-override di Car
        vehicle.start();
        vehicle.displayInfo();
    }
}