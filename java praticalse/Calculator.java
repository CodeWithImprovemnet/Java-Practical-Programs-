
//  6) Program to demonstrate method parameter in java

public class Calculator {
    // method that takes two integer parameters and returns their sum
    public static int add(int a, int b) {
        return a + b;
    }

    // method that takes two double parameters and returns their average
    public static double average(double x, double y) {
        return (x + y) / 2;
    }

    // method that takes an array parameter and returns its sum
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
 class CalculatorDemo {
    public static void main(String[] args) {
        int result1 = Calculator.add(5, 7);
        System.out.println("5 + 7 = " + result1);

        double result2 = Calculator.average(3.5, 4.2);
        System.out.println("The average of 3.5 and 4.2 is " + result2);

        int[] arr = { 2, 4, 6, 8, 10 };
        int result3 = Calculator.sumArray(arr);
        System.out.println("The sum of the array is " + result3);
    }
}
