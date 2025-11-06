package modul_6.praktikum_3;

public class InheritanceTypeTest {
    public static void main(String[] args) {
        // Multilevel inheritance test
        Dog dog = new Dog("Buddy", "Brown", "Golden Retriever");
        dog.giveBirth(); // Dari Animal
        dog.eat();       // Dari Mammal (di-override oleh Dog)
        dog.bark();      // Dari Dog

        System.out.println();

        // Hierarchical inheritance test
        Cat cat = new Cat("Whiskers", "White", true);
        cat.giveBirth(); // Dari Animal
        cat.eat();       // Dari Mammal (di-override oleh Cat)
        cat.meow();      // Dari Cat

        System.out.println();

        // Polymorphism dengan hierarchical inheritance
        Animal[] animals = {
                new Dog("Max", "Black", "Labrador"),
                new Cat("Luna", "Gray", false)
        };

        for (Animal animal : animals) {
            animal.eat(); // Memanggil versi method sesuai tipe objek sebenarnya
        }
    }
}
