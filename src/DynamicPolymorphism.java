// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass overriding the sound() method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamicPolymorphism {
    public static void main(String[] args) {
        // Parent class reference pointing to child class objects
        Animal myAnimal = new Animal(); // Parent class object
        Animal myDog = new Dog();       // Child class object (Dog)
        Animal myCat = new Cat();      // Child class object (Cat)

        myAnimal.sound(); // Calls Animal's sound()
        myDog.sound();    // Calls Dog's overridden sound()
        myCat.sound();    // Calls Cat's overridden sound()
    }
}