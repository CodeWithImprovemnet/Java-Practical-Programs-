

// 11) Program to demonstrate Final variable, Method and Final Class in java 

final class MyClass {  // final class cannot be inherited
    final int MY_CONSTANT = 42;  // final variable cannot be reassigned
    final void myMethod() {  // final method cannot be overridden
      System.out.println("Hello from myMethod!");
    }
  }
  
   class Main {
    public static void main(String[] args) {
      MyClass obj = new MyClass();
      System.out.println("My constant value: " + obj.MY_CONSTANT);
      obj.myMethod();
    }
  }
  