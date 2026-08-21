// Abstract class defining the blueprint
abstract class Shape {
    protected String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method: No body, must be implemented by subclasses
    public abstract double area();

    // Concrete method: Shared functionality
    public void displayColor() {
        System.out.println("Shape color: " + color);
    }
}

// Concrete subclass: Circle
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Implementing the abstract method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass: Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method
    @Override
    public double area() {
        return length * width;
    }
}

// Main class to test abstraction
public class AbstractionUsingAbstractClass {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        circle.displayColor();
        System.out.println("Circle Area: " + circle.area());

        rectangle.displayColor();
        System.out.println("Rectangle Area: " + rectangle.area());
    }
}   