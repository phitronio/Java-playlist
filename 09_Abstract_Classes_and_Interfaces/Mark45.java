/**
 * Flyable - Interface
 * 
 * This interface defines a contract for objects that can fly.
 * Interfaces specify what to do, but not how to do it - they are pure
 * declarations of capability.
 * 
 * Key Concepts Demonstrated:
 * - Interface definition using 'interface' keyword
 * - Abstract methods (implicitly public and abstract)
 * - Interface constants (implicitly public, static, and final)
 * - Multiple inheritance through interfaces (a class can implement multiple interfaces)
 * 
 * Why Interfaces?
 * Tony says: "Some suits can swim, some can hack, and others need to go to space."
 * These are specialized abilities that aren't inherent to every single suit.
 * Interfaces allow us to define these distinct capabilities separately.
 * 
 * @author Phitron Java Course
 * @version 1.0
 */
interface Flyable {
    /**
     * Maximum speed constant for flying objects.
     * 
     * Interface variables are implicitly:
     * - public: accessible from anywhere
     * - static: belongs to the interface, not instances
     * - final: cannot be modified (constant)
     * 
     * This represents the maximum speed in km/h that any flyable object can achieve.
     * Since it's final, it cannot be changed after declaration.
     */
    public int MAX_SPEED = 1000; // in km/h
    
    /**
     * Abstract method for flying functionality.
     * 
     * This method is implicitly public and abstract.
     * Any class that implements Flyable must provide a concrete
     * implementation of this method.
     * 
     * Note: In interfaces, methods are abstract by default (no method body).
     * The 'public' and 'abstract' keywords are optional but shown here for clarity.
     */
    void fly();
}

/**
 * Attackable - Interface
 * 
 * This interface defines a contract for objects that can attack.
 * It represents a specialized ability that can be added to any compatible suit.
 * 
 * Key Concepts Demonstrated:
 * - Multiple interfaces can be defined separately
 * - Interfaces define contracts (what must be done, not how)
 * - A class can implement multiple interfaces (multiple inheritance of interfaces)
 * 
 * This interface, along with Flyable, demonstrates how interfaces allow
 * classes to inherit diverse sets of behaviors - something not possible
 * with class inheritance (Java doesn't support multiple class inheritance).
 * 
 * @author Phitron Java Course
 * @version 1.0
 */
interface Attackable {
    /**
     * Abstract method for attack functionality.
     * 
     * This method is implicitly public and abstract.
     * Any class that implements Attackable must provide a concrete
     * implementation of this method.
     */
    void attack();
}

/**
 * Mark45 - Concrete Class (Implements Multiple Interfaces)
 * 
 * This class demonstrates multiple interface implementation, which is a form
 * of multiple inheritance in Java. Mark45 implements both Flyable and Attackable
 * interfaces, gaining the capabilities defined by both.
 * 
 * Key Concepts Demonstrated:
 * - Implementing interfaces using 'implements' keyword
 * - Multiple interface implementation (multiple inheritance of interfaces)
 * - Implementing all abstract methods from interfaces (mandatory)
 * - Interface constants (public, static, final - cannot be modified)
 * - @Override annotation for interface method implementations
 * 
 * Important: Java does NOT support multiple inheritance for classes, but
 * it DOES support multiple inheritance for interfaces. This is a critical
 * concept for exams!
 * 
 * Interface Implementation:
 * Mark45 implements:
 *     ├── Flyable (provides fly() method and MAX_SPEED constant)
 *     └── Attackable (provides attack() method)
 * 
 * @author Phitron Java Course
 * @version 1.0
 * @see Flyable
 * @see Attackable
 */
public class Mark45 implements Flyable, Attackable {

    /**
     * Implements the fly() method from Flyable interface.
     * 
     * Mark45 provides its own implementation of flying using nano technology.
     * This method must be public (interface methods are implicitly public).
     * 
     * The @Override annotation ensures we're actually implementing
     * a method from the interface (compiler will error if method doesn't exist).
     */
    @Override
    public void fly() {
        System.out.println("Mark45 is flying!");
    }

    /**
     * Implements the attack() method from Attackable interface.
     * 
     * Mark45 attacks using repulsor beams. This method must be public
     * (interface methods are implicitly public).
     * 
     * The @Override annotation ensures we're actually implementing
     * a method from the interface.
     */
    @Override
    public void attack() {
        System.out.println("Mark45 is attacking with repulsor beams!");
    }

    /**
     * Additional method specific to Mark45.
     * 
     * This method is not from any interface - it's a custom method
     * specific to the Mark45 class. This demonstrates that implementing
     * interfaces doesn't restrict a class from having its own methods.
     */
    public void powerUp() {
        System.out.println("Powering up the suit!");
    }

    /**
     * Main method to demonstrate Mark45 suit functionality and interface concepts.
     * 
     * This method demonstrates:
     * 1. Creating an instance of Mark45
     * 2. Calling implemented interface methods (fly, attack)
     * 3. Calling custom methods (powerUp)
     * 4. Accessing interface constants (MAX_SPEED)
     * 5. Attempting to modify interface constant (will cause compilation error)
     * 
     * Important Learning Points:
     * - Interface constants are final and cannot be modified
     * - Interface constants are accessed through the class name or instance
     * - All interface methods must be implemented (compilation error if not)
     * 
     * @param args Command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Create an instance of Mark45
        Mark45 mark45 = new Mark45();
        
        // Call the implemented method from Flyable interface
        mark45.fly();
        
        // Call the implemented method from Attackable interface
        mark45.attack();
        
        // Call custom method specific to Mark45
        mark45.powerUp();
        
        // Attempt to modify interface constant - THIS WILL CAUSE COMPILATION ERROR
        // Interface variables are final (constants) and cannot be modified
        // Uncommenting this line will result in: "cannot assign a value to final variable MAX_SPEED"
        // mark45.MAX_SPEED = 1200; // This line will cause a compilation error
        
        // Access interface constant (read-only, cannot modify)
        // Constants are accessed through instance or class name
        System.out.println("Maximum Speed: " + mark45.MAX_SPEED + " km/h");
    }
}