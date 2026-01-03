/**
 * Mark1 - Child Class (Inherits from BasicSuit)
 * 
 * This class demonstrates single-level inheritance in Java.
 * Mark1 extends BasicSuit, inheriting all its fields and methods.
 * 
 * Key Concepts Demonstrated:
 * - Inheritance using 'extends' keyword
 * - Accessing inherited methods and fields
 * - Adding new fields specific to the child class
 * - Object instantiation and method calls
 * 
 * Inheritance Hierarchy:
 * BasicSuit (Parent)
 *     └── Mark1 (Child)
 * 
 * @author Phitron Java Course
 * @version 1.0
 */
public class Mark1 extends BasicSuit {

    /**
     * The version number of this Mark1 suit.
     * This is a new field specific to Mark1, not present in the parent class.
     */
    public int version = 1;

    /**
     * Main method to demonstrate Mark1 suit functionality.
     * 
     * This method:
     * 1. Creates an instance of Mark1 suit
     * 2. Calls the inherited powerUp() method from BasicSuit
     * 3. Displays the version number specific to Mark1
     * 
     * @param args Command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Create an instance of Mark1 suit
        Mark1 mark1Suit = new Mark1();
        
        // Call the inherited powerUp() method from BasicSuit parent class
        // This demonstrates inheritance - Mark1 can use methods from BasicSuit
        mark1Suit.powerUp();
        
        // Display the version number (specific to Mark1, not inherited)
        System.out.println("Suit Version: " + mark1Suit.version);
    }
}