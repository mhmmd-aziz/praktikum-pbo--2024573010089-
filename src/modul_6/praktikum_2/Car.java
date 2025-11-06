package modul_6.praktikum_2;

public class Car extends Vehicle {
    // Variabel privat untuk menyimpan jumlah pintu
    private int numberOfDoors;

    // Konstruktor untuk menginisialisasi objek Car
    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed); // Memanggil konstruktor dari superclass (Vehicle)
        this.numberOfDoors = numberOfDoors;
    }

    // Override metode start dari Vehicle
    @Override
    public void start() {
        super.start(); // Memanggil versi start dari superclass
        System.out.println("Car engine is running smoothly");
    }

    // Override metode displayInfo dari Vehicle
    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil versi displayInfo dari superclass
        System.out.println("Number of doors: " + numberOfDoors);
    }

    // Metode khusus untuk Car
    public void honk() {
        System.out.println("Beep beep!");
    }
}
