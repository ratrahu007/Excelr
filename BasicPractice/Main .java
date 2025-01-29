class Person {
    // Instance variable to store person's name
    String name;
    
    // Static variable to track the total number of people created
    static int totalPeople = 0;

    // Static block to initialize static variables or do other tasks
    static {
        totalPeople = 0;  // Initialize total count of people
    }

    // Method to set person's name and increment the totalPeople count
    public void setName(String name) {
        this.name = name;
        totalPeople++; // Increment total number of people when setName is called
    }

    // Method to display the person's name
    public void displayName() {
        System.out.println("Name: " + name);
    }

    // Static method to display the total number of people created
    public static void displayTotalPeople() {
        System.out.println("Total number of people created: " + totalPeople);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects and setting names without constructors
        Person person1 = new Person();
        person1.setName("Alice");

        Person person2 = new Person();
        person2.setName("Bob");

        Person person3 = new Person();
        person3.setName("Charlie");

        // Displaying the names of the people
        person1.displayName();
        person2.displayName();
        person3.displayName();

        // Displaying the total number of people created using the static variable
        Person.displayTotalPeople(); // Accessing static method without creating an object
    }
}
