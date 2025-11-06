package modul_6.praktikum_2;

public class Vehicle {
    // Variabel protected dapat diakses oleh subclass
    protected String brand;
    protected int speed;

    // Konstruktor untuk menginisialisasi objek Vehicle
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Metode untuk menampilkan pesan saat kendaraan mulai berjalan
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    // Metode untuk menampilkan informasi kendaraan
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}