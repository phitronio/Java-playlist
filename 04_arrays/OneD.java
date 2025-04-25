public class OneD {
    public static void main(String[] args) {
        /*
         * Arrays are a collection of similar data types.
         * They are used to store multiple values in a single variable.
         * They are declared using square brackets [].
         * They are zero-indexed, meaning the first element is at index 0.
         * They can be of any data type, including primitives and objects.
         * They can be of any size, but the size must be specified at the time of declaration.
         * They can be multidimensional, meaning they can have more than one dimension.
         */

        // Declare an array of integers
        int[] numbers = new int[5]; // size of the array is 5

        // Initialize the array with values
        numbers[0] = 10;
        numbers[1] = 22;
        numbers[2] = 13;
        numbers[3] = 40;
        numbers[4] = 35;

        // Print the array
        System.out.println("Array of integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // linear search
        /*
         * Linear search is a simple search algorithm that checks each element in the array
         * until it finds the target value or reaches the end of the array.
         * 
         * index: |  0   |  1   |  2   |  3   |  4   |
         *        ------------------------------------
         * value: |  10  |  22  |  13  |  40  |  35  |
         *        ------------------------------------
         * 
         * for i = 0 to 4
         * if numbers[i] == searchValue
         *   found = true
         *   break
         * 
         * i: 0                         | i: 1
         * numbers[0] = 10              | numbers[1] = 22
         * not equal to 22              | found
         * go to next iteration         | break
         * 
         */

        int searchValue = 22;
        boolean found = false;
        int i = 0;

        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchValue) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Value " + searchValue + " found in the array. at index " + i);
        } else {
            System.out.println("Value " + searchValue + " not found in the array.");
        }

    }
}
