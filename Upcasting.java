// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Upcasting {
    public static void main(String[] args) {

        // Upcasting
        Animal a = new Dog();  // Parent reference, Child object

        a.sound();  // Calls Dog's sound()
    }
}
