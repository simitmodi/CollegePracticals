class Grandparent {
    void showGrandparent() {
        System.out.println("This is the Grandparent class.");
    }
}

// Intermediate class
class Parent extends Grandparent {
    void showParent() {
        System.out.println("This is the Parent class.");
    }
}

// Child class
class Child extends Parent {
    void showChild() {
        System.out.println("This is the Child class.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child myChild = new Child();
        myChild.showGrandparent(); // Calls method from Grandparent
        myChild.showParent();     // Calls method from Parent
        myChild.showChild();      // Calls method from Child
    }
}
