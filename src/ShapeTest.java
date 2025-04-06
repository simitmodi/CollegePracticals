abstract class Shape {
    protected double base, height;
    Shape(double base, double height) {
        this.base = base; this.height = height;
    }
    abstract double area();
}

class Triangle extends Shape {
    Triangle(double base, double height) {
        super(base, height);
    }
    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    Rectangle(double base, double height) {
        super(base, height);
    }
    @Override
    double area() {
        return base * height;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = { new Triangle(10, 5), new Rectangle(10, 5) };
        for (Shape s : shapes)
            System.out.println(s.getClass().getSimpleName() + " Area: " + s.area());
    }
}