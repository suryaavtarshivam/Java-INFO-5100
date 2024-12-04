// Creating a class named HelloWorld
public class HelloWorld {

    // Private member variable to store the greeting message
    private String greeting;

    // Constructor that takes a custom greeting as input and assigns it
    public HelloWorld(String greeting) {
        this.greeting = greeting;
    }

    // Default constructor that sets the greeting message to "Hello, World!"
    public HelloWorld() {
        this.greeting = "Hello, World!";
    }

    // Setter method to update the greeting message
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    // Method to print the greeting message to the console
    public void greet() {
        System.out.println(greeting);
    }

    // Main method - the entry point of the program
    public static void main(String[] args) {
        // Creating an instance of HelloWorld with the default greeting
        HelloWorld helloWorld = new HelloWorld();
        
        // Calling the greet method to print the default greeting
        helloWorld.greet();

        // Updating the greeting message using the setGreeting method
        helloWorld.setGreeting("Hello Surya Shivam");

        // Calling the greet method again to print the updated greeting
        helloWorld.greet();
    }
}
