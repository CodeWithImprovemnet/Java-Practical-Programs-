
// 9) Program to demonstrate static member in java

public class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
class CounterDemo {
    public static void main(String[] args) {
        // Create four Counter objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();

        // Print the value of the static member using the class name
        System.out.println("Number of objects created: " + Counter.getCount());
    }
}
