
// 2) Program to demonstrate scope of Variable in java

public class VariableScopeDemo {
    // Variable declared at the class level
    private static int globalVar = 10;

    public static void main(String[] args) {
        // Variable declared at the method level
        int localVar = 20;

        {
            // Variable declared at the block level
            int blockVar = 30;
            System.out.println("Inside block: blockVar = " + blockVar);
        }

        System.out.println("Inside method: localVar = " + localVar);
        System.out.println("Inside method: globalVar = " + globalVar);

        // Trying to access blockVar outside its scope will give a compile-time error
        // System.out.println("Outside block: blockVar = " + blockVar);
    }
}
