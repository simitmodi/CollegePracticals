// Parent class
class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand); // Calls the parent class constructor
        this.model = model;
    }

    void displayModel() {
        System.out.println("Model: " + model);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla");
        myCar.displayBrand(); // Calls method from parent class
        myCar.displayModel(); // Calls method from child class
    }
}