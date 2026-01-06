/**
 * BaseSuit - Abstract Class
 * 
 * This abstract class serves as the foundational blueprint for all Iron Man suits.
 * It defines the core mandatory behaviors that every suit must implement, while
 * also providing common functionality that all suits share.
 * 
 * Key Concepts Demonstrated:
 * - Abstract class definition using 'abstract' keyword
 * - Abstract methods (must be implemented by subclasses)
 * - Concrete methods (already implemented, inherited by subclasses)
 * - Cannot be instantiated directly (concept, not concrete object)
 * 
 * According to Tony Stark's requirements: "Every Iron Man suit must be able to 
 * fly and attack. But the Mark-1, Mark-42, and Nanosuit will all behave differently."
 * This abstract class establishes those mandatory actions without dictating their 
 * exact execution.
 * 
 * @author Phitron Java Course
 * @version 1.0
 * @see Mark42
 */
abstract class BaseSuit {
    /**
     * Abstract method for flying functionality.
     * 
     * This method must be implemented by all concrete subclasses.
     * Each suit model will have its own unique flying mechanism:
     * - Mark-1 might use basic jet boosters
     * - Mark-42 uses advanced jet boosters
     * - Nanosuit uses nano thrusters
     * 
     * Since this is abstract, no method body is provided here.
     * Subclasses are required to provide their own implementation.
     */
    abstract void fly();
    
    /**
     * Abstract method for attack functionality.
     * 
     * This method must be implemented by all concrete subclasses.
     * Each suit model will have its own unique attack mechanism:
     * - Different weapons (repulsor beams, missiles, nano weapons)
     * - Different attack patterns
     * 
     * Since this is abstract, no method body is provided here.
     * Subclasses are required to provide their own implementation.
     */
    abstract void attack();

    /**
     * Concrete method for powering up the suit.
     * 
     * This is a common functionality shared by all suits.
     * Since it's already implemented here, subclasses can use it directly
     * without needing to override it (unless they want custom power-up behavior).
     * 
     * This demonstrates that abstract classes can have both:
     * - Abstract methods (must be implemented)
     * - Concrete methods (already implemented, can be inherited)
     */
    public void powerUp() {
        System.out.println("Powering up the suit!");
    }
}


/**
 * Mark42 - Concrete Class (Extends Abstract Class BaseSuit)
 * 
 * This class demonstrates how to extend an abstract class and implement
 * all its abstract methods. Mark42 is a concrete implementation of the
 * BaseSuit abstract class.
 * 
 * Key Concepts Demonstrated:
 * - Extending abstract classes using 'extends' keyword
 * - Implementing abstract methods (mandatory)
 * - Using @Override annotation for clarity
 * - Inheriting concrete methods from abstract class
 * - Object instantiation (unlike abstract classes, concrete classes can be instantiated)
 * 
 * Inheritance Relationship:
 * BaseSuit (Abstract Parent)
 *     └── Mark42 (Concrete Child)
 * 
 * @author Phitron Java Course
 * @version 1.0
 * @see BaseSuit
 */
public class Mark42 extends BaseSuit {

    /**
     * Implements the abstract fly() method from BaseSuit.
     * 
     * Mark42 uses jet boosters for flight. This is the concrete implementation
     * of the abstract method defined in BaseSuit. Without this implementation,
     * Java would produce a compilation error, ensuring every concrete suit model
     * fulfills its basic requirements.
     * 
     * The @Override annotation ensures we're actually overriding/implementing
     * an abstract method (compiler will error if method doesn't exist in parent).
     */
    @Override
    void fly() {
        System.out.println("Mark42 is flying!");
    }

    /**
     * Implements the abstract attack() method from BaseSuit.
     * 
     * Mark42 attacks using repulsor beams. This is the concrete implementation
     * of the abstract method defined in BaseSuit. Each suit model provides
     * its own unique attack mechanism.
     * 
     * The @Override annotation ensures we're actually implementing
     * an abstract method from the parent class.
     */
    @Override
    void attack() {
        System.out.println("Mark42 is attacking with repulsor beams!");
    }

    /**
     * Main method to demonstrate Mark42 suit functionality.
     * 
     * This method demonstrates:
     * 1. Creating an instance of Mark42 (concrete class can be instantiated)
     * 2. Calling implemented abstract methods (fly, attack)
     * 3. Calling inherited concrete method (powerUp from BaseSuit)
     * 
     * Note: While you cannot create an object directly from an abstract class
     * (BaseSuit), you can create a reference to it, pointing to a concrete
     * subclass object like Mark42.
     * 
     * @param args Command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Create an instance of Mark42 (concrete class can be instantiated)
        Mark42 mark42 = new Mark42();
        
        // Call the implemented abstract method from BaseSuit
        mark42.fly();
        
        // Call the implemented abstract method from BaseSuit
        mark42.attack();
        
        // Call the inherited concrete method from BaseSuit
        // This demonstrates that abstract classes can have concrete methods
        mark42.powerUp();
    }
}