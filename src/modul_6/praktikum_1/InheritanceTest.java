package modul_6.praktikum_1;

public class InheritanceTest {
    public static void main(String[] args) {
        // Membuat objek Student
        Student student = new Student("Alice", 20, "S12345");

        // Memanggil method dari superclass (Person)
        student.displayInfo();

        // Memanggil method dari subclass (Student)
        student.study();

        // Memanggil method yang di-override dari Student
        student.greet();

        // Polymorphism: objek Student diperlakukan sebagai Person
        Person person = new Student("Bob", 22, "S67890");
        person.greet(); // Tetap memanggil versi yang di-override di Student
    }
}