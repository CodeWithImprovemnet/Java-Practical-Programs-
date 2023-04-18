
// 12) Program to demonstrate Finilize method()  in java

public class MyClass2 {
    public void finalize() {
        System.out.println("Object is being finalized");
    }

    public static void main(String[] args) {
        MyClass2 obj = new MyClass2();
        obj = null;
        System.gc();
        
    }
}
