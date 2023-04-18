// 23) Program to demonstrate param tag in java

/**
 * This class represents a person with a name and age.
 */

public class Person {
    
    private String name;
    private int age;
    
    /**
     * Creates a new Person object with the given name and age.
     *
     * @param name the name of the person
     * @param age the age of the person
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    /**
     * Gets the name of the person.
     *
     * @return the name of the person
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name of the person.
     *
     * @param name the new name of the person
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Gets the age of the person.
     *
     * @return the age of the person
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Sets the age of the person.
     *
     * @param age the new age of the person
     */
    public void setAge(int age) {
        this.age = age;
    }
}
