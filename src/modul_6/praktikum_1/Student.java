package modul_6.praktikum_1;

public class Student extends Person {
    // Variabel privat untuk menyimpan ID mahasiswa
    private String studentId;

    // Konstruktor untuk menginisialisasi objek Student
    public Student(String name, int age, String studentId) {
        super(name, age); // Memanggil konstruktor dari superclass (Person)
        this.studentId = studentId;
    }

    // Metode untuk menunjukkan bahwa mahasiswa sedang belajar
    public void study() {
        System.out.println(name + " is studying.");
    }

    // Override metode greet dari kelas Person
    @Override
    public void greet() {
        System.out.println("Hello, I am a student named " + name);
    }
}
