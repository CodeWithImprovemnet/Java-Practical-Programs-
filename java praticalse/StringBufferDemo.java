
// 15) Program to demonstrate String Buffer and it's method in java 

public class StringBufferDemo {
    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        // Appending to the StringBuffer
        sb.append(" world");
        System.out.println(sb);

        // Inserting into the StringBuffer
        sb.insert(5, ", ");
        System.out.println(sb);

        // Deleting from the StringBuffer
        sb.delete(5, 7);
        System.out.println(sb);

        // Replacing characters in the StringBuffer
        sb.replace(5, 10, "Java");
        System.out.println(sb);

        // Converting StringBuffer to String
        String s = sb.toString();
        System.out.println(s);
    }
}
