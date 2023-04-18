
// 4) Program to demonstrate Looping statement in java

public class LoopingDemo {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + (i + 1));
        }

        // while loop
        int j = 0;
        while (j < 5) {
            System.out.println("Iteration " + (j + 1));
            j++;
        }

        // do-while loop
        int k = 0;
        do {
            System.out.println("Iteration " + (k + 1));
            k++;
        } while (k < 5);
    }
}
