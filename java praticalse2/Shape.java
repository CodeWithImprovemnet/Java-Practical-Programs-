
// 17) Program to demonstrate Abstract method and Abstract Class.

// Abstract class
abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract method
    public abstract double getArea();

    // Non-abstract method
    public void display() {
        System.out.println("This shape is " + color);
    }
}

// Subclass
class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Implementing the abstract method
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

 class AbstractDemo {
    public static void main(String[] args) {
        // Creating a Circle object
        Circle myCircle = new Circle("red", 3.0);

        // Calling methods on the Circle object
        myCircle.display();
        System.out.println("The area of the circle is " + myCircle.getArea());
    }
}
