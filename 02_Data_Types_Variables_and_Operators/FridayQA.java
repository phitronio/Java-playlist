/*
 * Your boss Tony Stark has asked you to meet him to discuss about
 * his new Armor "Mark 2025", but you are to confuse to face him without
 * any preparation, so you asked help from "friday" to give you a hint 
 * what Mr. Tony might need to know from you.
 * 
 * Friday has agreed to help you only if you can solve some questions 
 * given by her. 
 *  
 */
public class FridayQA {
    public static void main(String[] args) {
    /*
     * Friday has given you two numbers:
     * the power capacity of the armor battery batteryPower = 1000 and
     * the power required to fly flightPower = 300. Can you calculate:
     *      1. The remaining power after flying?
     *      2. How many flights are possible if each flight requires flightPower?
     */
    int batteryPower = 1000;
    int flightPower;
    flightPower = 300;
    
    // int remainingPowerAfter1Flight = batteryPower - flightPower;
    batteryPower -= flightPower;

    System.out.println("Power Remaining: " + batteryPower);
    System.out.println("Flight possible: " + (batteryPower / flightPower));

    
    System.out.println("Power Remaining with pre increment: " + ++batteryPower);
    System.out.println("Power Remaining with post increment: " + batteryPower++);
    System.out.println("Power Remaining: " + batteryPower);
    }
}
