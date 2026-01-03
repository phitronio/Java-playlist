/**
 * BasicSuit - Base/Parent Class
 * 
 * This class represents the fundamental Iron Man suit with basic functionality.
 * It serves as the parent class for all specialized suit variants (Mark1, Mark2, NanoMark).
 * 
 * Key Concepts Demonstrated:
 * - Base class definition
 * - Instance variables
 * - Methods that can be inherited by child classes
 * 
 * @author Phitron Java Course
 * @version 1.0
 */
public class BasicSuit {
    /**
     * The arc reactor core type for this basic suit.
     * This field is accessible to child classes through inheritance.
     * Default value: "Mark I Core"
     */
    String archReactor = "Mark I Core";

    /**
     * Powers up the suit using the arc reactor.
     * This method can be overridden by child classes to provide
     * suit-specific power-up behavior (demonstrating polymorphism).
     * 
     * When called, it displays a message indicating the suit is being
     * powered up with the specified arc reactor core.
     */
    void powerUp() {
        System.out.println("Powering up the suit with " + archReactor);
    }
}