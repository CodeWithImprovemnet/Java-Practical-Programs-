
// 1) Program to demonstrate Constant Variable
public class ConstantVariableDemo {
    public static void main(String[] args) {
        final int MAX_VALUE = 100;
        // MAX_VALUE = 200;  // This will give a compile-time error because MAX_VALUE is a constant variable.

        System.out.println("The maximum value is " + MAX_VALUE);
    }
}
