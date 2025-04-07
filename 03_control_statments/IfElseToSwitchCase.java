public class IfElseToSwitchCase {
    public static void main(String[] args) {

        // ********************************** problem 1: ********************************** //
        // initialize a variable with int value, if the variable is even then print even    //
        // and if the variable is odd then print odd.                                       //
        // ******************************************************************************** //

        // int num = 13;
        // if ((num % 2) == 0) {
        //     System.out.println(" if even");
        // }
        // else {
        //     System.out.println("if odd");
        // }

        // switch ((num % 2)) {
        //     case 0:
        //         System.out.println("even");
        //         break;
        //     default:
        //         System.out.println("odd");
        // } 

        // ********************************** problem 2: ********************************** //
        // initialize an integer n and determines whether it is negative, even, or odd.     //
        // ******************************************************************************** //

        int n = 8;

        if (n >= 0) {
             if ((n % 2) == 1) {
                 System.out.println("odd");
             }
             else {
                 System.out.println("even");
             }
        }
        else {
            System.out.println("Negative");
        }

        switch (Integer.signum(n)) { // Integer.signum(n) 1, 0, -1
            case 0:
            case 1:
                switch ((n % 2)) {
                    case 0:
                        System.out.println("even");
                        break;
                    default:
                        System.out.println("odd");
                } 
                break;
            default:
                System.out.println("Negative"); 
                break;
        }

        // ********************************** problem 3: ********************************** //
        // initialize a variable mark int value. and print the greade according,            //
        // mark >= 90 -> A                                                                  //
        // mark < 90 and mark >= 80 -> A-                                                    //
        // mark < 80 and mark >= 70 -> B                                                     //
        // mark < 70 and mark >= 60 -> B-                                                     //
        // else F                                                                           //
        // ******************************************************************************** //

        // int mark = 75;

        // if (mark >= 90) {
        //     System.out.println("A");
        // }
        // else if (mark > 80) {
        //     System.out.println("A-");
        // }
        // else if (mark > 70) {
        //     System.out.println("B");
        // }
        // else {
        //     System.out.println("F");
        // }

        int mark = 90;

        switch ((mark / 10)) { // 9-0
            case 1:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("A-");
                break;
            case 7:
                System.out.println("B");
                break;
            case 6:
                System.out.println("B-");
                break;
            default:
                System.out.println("F");
        }
    }
    
}
