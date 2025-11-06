package modul_6.praktikum_3;

public class Dog extends Mammal {
    // Variabel privat untuk menyimpan ras anjing
    private String breed;

    // Konstruktor untuk menginisialisasi nama, warna bulu, dan ras
    public Dog(String name, String furColor, String breed) {
        super(name, furColor); // Memanggil konstruktor dari superclass (Mammal)
        this.breed = breed;
    }

    // Metode khusus untuk Dog
    public void bark() {
        System.out.println(name + " is barking: Woof woof!");
    }

    // Override metode eat dari Animal
    @Override
    public void eat() {
        System.out.println(name + " the dog is eating dog food.");
    }
}
