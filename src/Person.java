public class Person {
    String name;
    int age;
    double salary;

    public Person() {
        name = "";
        age = 0;
        salary = 0.0;
    }

    public static void main(String[] args) {
        Person person1 = new Person();

        person1.name = "John Doe";
        person1.age = 30;
        person1.salary = 50000.0;

        System.out.println("Person Details:");
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);
        System.out.println("Salary: $" + person1.salary);
    }
}
