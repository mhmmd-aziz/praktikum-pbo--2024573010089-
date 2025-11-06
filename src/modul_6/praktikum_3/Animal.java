package modul_6.praktikum_3;

public class Animal {
    // Variabel protected dapat diakses oleh subclass
    protected String name;

    // Konstruktor untuk menginisialisasi objek Animal
    public Animal(String name) {
        this.name = name;
    }

    // Metode untuk menunjukkan bahwa hewan sedang makan
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Metode untuk menunjukkan bahwa hewan sedang tidur
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}