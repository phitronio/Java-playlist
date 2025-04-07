public class IfElseDemo {
    /*
     * * Simple if statement
     * * if-else statement
     * * if-else-if ladder
     * * Nested if-statement
     */
    public static void main(String[] args) {
        /*
         * Simple if statment:
         * if (condition) {
         *      // body
         * }
         */

         // initialize a variable with int value, if the variable is even then print even.
         int num = 12;
         if ((num % 2) == 0) {
            System.out.println("even");
         }

        /*
         * Simple if-else statment:
         * if (condition) {
         *      // body
         * }
         * else {
         *      // body
         * }
         */
         //if the variable is even then print even else print odd.

         num = 13;
         if ((num % 2) == 0) {
            System.out.println("even");
         }
         else {
            System.out.println("odd");
         }

         /*
          * if-else-if ladder
          *
          * if (condition) {
          *     // body
          * }
          * else if (condition) {
          *     // body
          * }
          * else if (condition) {
          *     // body
          * }
          * else {
          *     // body
          * }
          */

          // mark, mark >= 90 -> A
          // mark < 90 and mark > 80 -> A-
          // mark < 80 and mark > 70 -> B
          // ...
          // else not applicable 

          int mark = 75;

          if (mark >= 90) { System.out.println("A");}
          else if (mark > 80) {System.out.println("A-");}
          else if (mark > 70) {System.out.println("B");}
          else {
            System.out.println("not applicable");
          }

          /*
           * Nested if-statement
           * if (condition){
           *    if (condition) {
           * 
           *    }
           *    else {
           *    
           *    }
           * }
           * else {
           * 
           * }
           */

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

        }
}
