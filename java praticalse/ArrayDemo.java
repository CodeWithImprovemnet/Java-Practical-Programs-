
// 13) Program to demonstrate Array and It's types in java 

public class ArrayDemo {
    public static void main(String[] args) {
        // Primitive array
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Object array
        String[] names = new String[3];
        names[0] = "Shantanu";
        names[1] = "Bhakti";
        names[2] = "Supriya";
        for (String name : names) {
            System.out.println(name);
        }
    }
}
