/**
 * Mark2 - Child Class (Inherits from Mark1, which inherits from BasicSuit)
 * 
 * This class demonstrates multi-level inheritance and method overriding.
 * Mark2 extends Mark1, creating a three-level inheritance hierarchy.
 * 
 * Key Concepts Demonstrated:
 * - Multi-level inheritance (Mark2 -> Mark1 -> BasicSuit)
 * - Method overriding using @Override annotation
 * - Field shadowing (hiding parent class fields with same name)
 * - Polymorphism - providing different implementation of inherited method
 * 
 * Inheritance Hierarchy:
 * BasicSuit (Grandparent)
 *     └── Mark1 (Parent)
 *         └── Mark2 (Child)
 * 
 * @author Phitron Java Course
 * @version 1.0
 */
public class Mark2 extends Mark1 {

    /**
     * The version number of this Mark2 suit.
     * This field shadows (hides) the version field from Mark1 parent class.
     */
    public int version = 2;
    
    /**
     * The arc reactor core type for Mark2 suit.
     * This field shadows the archReactor field from BasicSuit grandparent class.
     * Mark2 uses a more advanced "Mark II Core" compared to the basic "Mark I Core".
     */
    public String archReactor = "Mark II Core";

    /**
     * Overrides the powerUp() method inherited from BasicSuit.
     * 
     * This demonstrates method overriding - providing a new implementation
     * of an inherited method. The @Override annotation ensures we're actually
     * overriding a method (compiler will error if method doesn't exist in parent).
     * 
     * Polymorphism: When powerUp() is called on a Mark2 object, this version
     * will execute instead of the parent class version.
     */
    @Override
    void powerUp() {
        System.out.println("Powering up the suit with " + archReactor);
    }

    /**
     * Main method to demonstrate Mark2 suit functionality.
     * 
     * This method:
     * 1. Creates an instance of Mark2 suit
     * 2. Calls the overridden powerUp() method (Mark2's version, not parent's)
     * 3. Displays the version number specific to Mark2
     * 
     * @param args Command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Create an instance of Mark2 suit
        Mark2 mark2Suit = new Mark2();
        
        // Call the overridden powerUp() method
        // This will execute Mark2's version, not the inherited version from BasicSuit
        // This demonstrates polymorphism - same method name, different behavior
        mark2Suit.powerUp();
        
        // Display the version number (Mark2's version, which shadows Mark1's version)
        System.out.println("Suit Version: " + mark2Suit.version);
    }
}