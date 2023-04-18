
// 21) Program to demonstrate interface in java

// Define an interface named "Shape"
interface Shape {
    double getArea(); // Declare an abstract method to get the area of the shape
}

// Define a class named "Circle" that implements the "Shape" interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Define a class named "Rectangle" that implements the "Shape" interface
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

// Define a class named "Main" to test our "Circle" and "Rectangle" classes
 class Main {
    public static void main(String[] args) {
        // Create a new Circle object and compute its area
        Circle circle = new Circle(5);
        double circleArea = circle.getArea();
        System.out.println("Circle area: " + circleArea);

        // Create a new Rectangle object and compute its area
        Rectangle rectangle = new Rectangle(10, 20);
        double rectangleArea = rectangle.getArea();
        System.out.println("Rectangle area: " + rectangleArea);
    }
}
