

// 5) Program to demonstrate simple class in java

public class Person {
    // properties
    private String name;
    private int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // methods
    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
 class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("shantanu nirpal", 19);
        person1.sayHello();

        Person person2 = new Person("rahul kardile", 21);
        person2.sayHello();

        person1.setAge(21);
        System.out.println(person1.getName() + " is now " + person1.getAge() + " years old.");
    }
}




