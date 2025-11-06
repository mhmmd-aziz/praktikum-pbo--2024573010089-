package modul_6.praktikum_3;

public class Cat extends Mammal {
    // Variabel privat untuk menunjukkan apakah kucing adalah kucing rumahan
    private boolean isIndoor;

    // Konstruktor untuk menginisialisasi nama, warna bulu, dan status indoor
    public Cat(String name, String furColor, boolean isIndoor) {
        super(name, furColor); // Memanggil konstruktor dari superclass (Mammal)
        this.isIndoor = isIndoor;
    }

    // Metode khusus untuk Cat
    public void meow() {
        System.out.println(name + " is meowing: Meow Meow!");
    }

    // Override metode eat dari Animal
    @Override
    public void eat() {
        System.out.println(name + " the cat is eating cat food.");
    }
}