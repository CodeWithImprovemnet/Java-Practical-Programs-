
// 8) Program to demonstrate constructor in java

public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor with three parameters
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
 class CarDemo {
    public static void main(String[] args) {
        // Create a car object using the constructor
        Car myCar = new Car("Honda", "Civic", 2021);

        // Use the getter methods to print out the car information
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
    }
}
