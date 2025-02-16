class Employee {
    int empCode;
    String name;
    String designation;
    double basicPay;

    public Employee(int empCode, String name, String designation, double basicPay) {
        this.empCode = empCode;
        this.name = name;
        this.designation = designation;
        this.basicPay = basicPay;
    }

    public void calculation() {
        double hra = 0.10 * basicPay;
        double da = 0.45 * basicPay;
        double totalPay = basicPay + hra + da;

        System.out.println("Employee Code: " + empCode);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Pay: " + totalPay);
        System.out.println();
        System.out.println();
        System.out.println();
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        // Creating three Employee objects
        Employee emp1 = new Employee(101, "Simit Modi", "Software Engineer", 50000);
        Employee emp2 = new Employee(102, "Rahul Agrawal", "Manager", 75000);
        Employee emp3 = new Employee(103, "Prem Chopra", "HR", 45000);

        emp1.calculation();
        emp2.calculation();
        emp3.calculation();
    }
}
