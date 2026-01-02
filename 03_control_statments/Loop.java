public class Loop {
    public static void main(String[] args) {
        /*
         * problem 1:
         * --------------------------------
         * print the 1st 10 even numbers
         */
        // solve using for loop
        // for (int i=1; i<=10; i++) {
        //     // i -> 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        //     //      2, 4, 6, 8, 10, 12, 14, 16, 18, 20
        //     System.out.println(i*2);
        // }

        // solve using while loop
        // int i = 1;
        // while (i <= 10) {
        //     System.out.print(i*2 + " ");
        //     i++;
        // }

         /*
          * problem 2:
          * --------------------------------
          * FizzBuzz problem
          * print numbers from 1 to 20
          * if the number is divisible by 3, print "Fizz"
          * if the number is divisible by 5, print "Buzz"
          * if the number is divisible by 3 and 5, print "FizzBuzz"
          * else print the number
          */
        // solve using for loop
        //   for (int i=1; i <=20; i++) {
        //     if (i % 3 == 0) {
        //         System.out.print("Fizz");
        //     }
        //     if (i % 5 == 0) {
        //         System.out.print("Buzz");
        //     }
        //     if (i % 3 != 0 && i % 5 != 0) {
        //         System.out.println(i);
        //     } else {
        //         System.out.println(); // \n -> new line
        //     }
        //   }
          
          /*
           * problem 3:
           * --------------------------------
           * print the following pattern for n=5
           * # # # # #
           * # # # # #
           * # # # # #
           * # # # # #
           * # # # # #
           */
        //   for (int row=0; row<5; row++) {
        //     for (int col=0; col<5; col++) {
        //         System.out.print("# ");
        //     }
        //     System.out.println();
        //   }

          /*
           * problem 4:
           * --------------------------------
           * print the following pattern for n=5
           * 1
           * 1 2
           * 1 2 3
           * 1 2 3 4
           * 1 2 3 4 5
           */
            // for (int r=1; r<=5; r++) {
            //     for (int c=1; c<=r; c++) {
            //         System.out.print(c + " ");
            //     }
            //     System.out.println();
            // }
        
           /*
            * problem 5:
            * --------------------------------
            * print the following pattern for n=5
            * a
            * a b
            * a b c
            * a b c d
            * a b c d e
            */
            // int decimalValue = 97; // ASCII value for 'a'
            // char char_value;
            // for (int r=1; r<=5; r++) {
            //     for (int c=1; c<=r; c++) {
            //         char_value = (char) (decimalValue + c - 1);
            //         System.out.print(char_value + " ");
            //     }
            //     System.out.println();
            // }

            /*
            * problem 6:
            * --------------------------------
            * print the following pattern for n=5
            * 1 2 3 4 5
            * 1 2 3 4
            * 1 2 3
            * 1 2
            * 1
            */

            /*
            * problem 7:
            * --------------------------------
            * print the following pattern for n=5
            * 1
            * 2 3
            * 4 5 6
            * 7 8 9 10
            * 11 12 13 14 15
            */
            // int cell_number = 1;
            // for (int r=1; r<=5; r++) {
            //     for (int c=1; c<=r; c++) {
            //         System.out.print(cell_number++ + " ");
            //     }
            //     System.out.println();
            // }

            /*
             * problem 8:
             * --------------------------------
             * print the following pattern for n=5
             * x       x
             *   x   x  
             *     x    
             *   x   x  
             * x       x
             */
            int n = 9;
            for (int r=0; r<n; r++) {
                for (int c=0; c<n; c++) {
                    if (r == c || r+c+1 == n) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }
}