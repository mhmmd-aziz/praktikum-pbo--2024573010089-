package modul_6.praktikum_1;

public class Person {
    // Deklarasi variabel instance dengan akses protected
    protected String name;
    protected int age;

    // Konstruktor untuk menginisialisasi objek Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Metode untuk menampilkan informasi nama dan usia
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Metode untuk menampilkan pesan sapaan
    public void greet() {
        System.out.println("Hello, I am a person.");
    }
}
