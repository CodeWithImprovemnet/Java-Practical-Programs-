
// 7) Program to demonstrate method overloading in java 

public class MathUtils {
    // method that takes two integers and returns their sum
    public static int add(int a, int b) {
        return a + b;
    }

    // method that takes three integers and returns their sum
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // method that takes two doubles and returns their sum
    public static double add(double a, double b) {
        return a + b;
    }
}

 class MathUtilsDemo {
    public static void main(String[] args) {
        int result1 = MathUtils.add(5, 7);
        System.out.println("5 + 7 = " + result1);

        int result2 = MathUtils.add(2, 4, 6);
        System.out.println("2 + 4 + 6 = " + result2);

        double result3 = MathUtils.add(3.5, 4.2);
        System.out.println("3.5 + 4.2 = " + result3);
    }
}
