/**
 * NanoMark - Child Class (Inherits from Mark1, which inherits from BasicSuit)
 * 
 * This class demonstrates inheritance and polymorphism alongside Mark2.
 * Both NanoMark and Mark2 extend Mark1, showing that multiple classes can
 * inherit from the same parent class, each providing their own implementations.
 * 
 * Key Concepts Demonstrated:
 * - Multiple inheritance paths from the same parent (NanoMark and Mark2 both extend Mark1)
 * - Method overriding with @Override annotation
 * - Field shadowing (hiding parent class fields)
 * - Polymorphism - different classes providing different implementations
 * 
 * Inheritance Hierarchy:
 * BasicSuit (Grandparent)
 *     └── Mark1 (Parent)
 *         ├── Mark2 (Child - one path)
 *         └── NanoMark (Child - another path)
 * 
 * This shows that inheritance allows for code reuse while enabling
 * each child class to customize behavior through method overriding.
 * 
 * @author Phitron Java Course
 * @version 1.0
 */
public class NanoMark extends Mark1 {

    /**
     * The version number of this NanoMark suit.
     * This field shadows (hides) the version field from Mark1 parent class.
     * NanoMark is version 3, representing the most advanced suit.
     */
    public int version = 3;
    
    /**
     * The arc reactor core type for NanoMark suit.
     * This field shadows the archReactor field from BasicSuit grandparent class.
     * NanoMark uses the advanced "Nano Core" technology.
     */
    public String archReactor = "Nano Core";

    /**
     * Overrides the powerUp() method inherited from BasicSuit.
     * 
     * This demonstrates method overriding - providing a new implementation
     * of an inherited method. The @Override annotation ensures we're actually
     * overriding a method (compiler will error if method doesn't exist in parent).
     * 
     * Polymorphism: When powerUp() is called on a NanoMark object, this version
     * will execute instead of the parent class version. Notice that both Mark2
     * and NanoMark override the same method but with different implementations
     * (different archReactor values), demonstrating runtime polymorphism.
     */
    @Override
    void powerUp() {
        System.out.println("Powering up the suit with " + archReactor);
    }

    /**
     * Main method to demonstrate NanoMark suit functionality.
     * 
     * This method:
     * 1. Creates an instance of NanoMark suit
     * 2. Calls the overridden powerUp() method (NanoMark's version)
     * 3. Displays the version number specific to NanoMark
     * 
     * @param args Command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Create an instance of NanoMark suit
        NanoMark nanoMarkSuit = new NanoMark();
        
        // Call the overridden powerUp() method
        // This will execute NanoMark's version, not the inherited version from BasicSuit
        // This demonstrates polymorphism - same method name, different behavior
        nanoMarkSuit.powerUp();
        
        // Display the version number (NanoMark's version, which shadows Mark1's version)
        System.out.println("Suit Version: " + nanoMarkSuit.version);
    }
}