abstract class Vegetable {
    protected String color;
    Vegetable(String color) { this.color = color; }
    @Override public String toString() {
        return getClass().getSimpleName() + " [Color: " + color + "]";
    }
}
class Potato extends Vegetable {
    Potato(String color) {
        super(color);
    }
}
class Brinjal extends Vegetable {
    Brinjal(String color) {
        super(color);
    }
}
class Tomato extends Vegetable {
    Tomato(String color) {
        super(color);
    }
}
public class VegetableTest {
    public static void main(String[] args) {
        Vegetable[] veggies = {
                new Potato("Brown"),
                new Brinjal("Purple"),
                new Tomato("Red")
        };
        for (Vegetable v : veggies) System.out.println(v);
    }
}