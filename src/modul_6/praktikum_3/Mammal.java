package modul_6.praktikum_3;

public class Mammal extends Animal {
    // Variabel protected untuk warna bulu
    protected String furColor;

    // Konstruktor untuk menginisialisasi nama dan warna bulu
    public Mammal(String name, String furColor) {
        super(name); // Memanggil konstruktor dari superclass (Animal)
        this.furColor = furColor;
    }

    // Metode khusus untuk Mammal
    public void giveBirth() {
        System.out.println(name + " is giving birth to live young.");
    }
}