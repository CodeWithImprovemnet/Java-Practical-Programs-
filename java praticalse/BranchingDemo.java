
// 3) Program to demonstrate branching statement in java

public class BranchingDemo {
    public static void main(String[] args) {
        int num = 5;

        // if-else statement
        if (num > 0) {
            System.out.println(num + " is a positive number");
        } else {
            System.out.println(num + " is a negative number");
        }

        // switch statement
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Number is not 1, 2 or 3");
        }

        // break statement
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
