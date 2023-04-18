
// 16) Program to demonstrate inheritance and its Types in java 


// Superclass
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Subclass
class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
}

 class InheritanceDemo {
    public static void main(String[] args) {
        // Creating a Dog object
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");

        // Calling methods on the Dog object
        myDog.eat();
        myDog.sleep();
        myDog.bark();

        // Accessing fields inherited from Animal
        System.out.println(myDog.name);
        System.out.println(myDog.age);
    }
}
