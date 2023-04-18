
// 14) string class and its method 

public class StringDemo {
    public static void main(String[] args) {
        // Creating strings
        String s1 = "Hello";
        String s2 = new String("shantanu");

        // Concatenating strings
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        // Comparing strings
        String s4 = "hello";
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));

        // Searching strings
        System.out.println(s3.contains("shantanu"));
        System.out.println(s3.indexOf("shantanu"));

        // Manipulating strings
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s3.replace("shantanu", "rahul"));
    }
}
