public class array {
    public static void main(String a[]) {
        // Check 15-array-topic-cover.md for more details on arrays in Java
        
        int num[] = {}; // Declare an empty array
        //num = {1, 2, 3, 4, 5}; // Initialize the array with values like this is not allowed in Java, should use new int[]{1, 2, 3, 4, 5} instead
        num = new int[]{1, 2, 3, 4, 5}; // Correct way to initialize the array with values
        System.out.println("Array elements:");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        int num1[] = {3,7,4}; // Declare and initialize an array with values
        System.out.println(num1[0]); // Accessing the first element of the array
        num1[0] = 10; // Modifying the first element of the array
        System.out.println(num1[0]); // Accessing the modified first element of the array


        int nums[] = new int[3];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        System.out.println(nums[2]);
        System.out.println("Elements of nums array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        // show only the first two elements of the array
        System.out.println("First two elements of nums array:");
        for (int i = 0; i < 2; i++) {
            System.out.println(nums[i]);
        }


        int[] arr = new int[10]; // Declare an array of size 10
        arr[0] = 10; // Assign values to the array
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Accessing array elements
        System.out.println("Element at index 0: " + arr[0]);
        System.out.println("Element at index 1: " + arr[1]);
        System.out.println("Element at index 2: " + arr[2]);
        System.out.println("Element at index 3: " + arr[3]);
        System.out.println("Element at index 4: " + arr[4]);

        // Using a loop to iterate through the array
        System.out.println("Iterating through the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

        // Using enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (int value : arr) {
            System.out.println("Value: " + value);
        }




        System.out.println("Multi-dimensional array example:");
        // multi-dimensional array
        int[][] multiArr = new int[4][5]; // Declare a 2D array/Multi-dimensional with 4 rows and 5 columns

        /*int multiArr[][] = {
            {10,20,30,40,50},
            {40,50,60,70,80},
            {70,80,90,80,70},
            {20,10,40,30,20}
        };*/
        
        System.out.println(multiArr.length); // prints 4, number of rows

        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                //multiArr[i][j] = (i + 1) * (j + 1); // Assign values to the 2D array
                // Math.random() generates a random double value between 0.0 (inclusive) and 1.0 (exclusive). By multiplying it by 100, we get a random double value between 0.0 and 100.0. Casting it to int truncates the decimal part, resulting in an integer value between 0 and 99.
                //multiArr[i][j] = (int)(Math.random() * 100); // Assign random values to the 2D array
                multiArr[i][j] = (int)(Math.random() * 10); // Assign random single-digit values to the 2D array
            }
        }

        for (int i = 0; i < multiArr.length; i++) {
            //System.out.println("Row " + i + ":");
            // System.out.println(multiArr[i].length); // prints 5, number of columns in each row
            for (int j = 0; j < multiArr[i].length; j++) {
                // System.out.println("Element at [" + i + "][" + j + "]: " + multiArr[i][j]);
                // System.out.println("Address of element at [" + i + "][" + j + "]: " + System.identityHashCode(multiArr[i][j]));
                System.out.print(multiArr[i][j] + " ");
            }
            System.out.println();
        }

        // enhanced for loop to iterate through the multi-dimensional array
        System.out.println("Using enhanced for loop to iterate through the multi-dimensional array:");
        for (int row[] : multiArr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Find 5 greatest numbers in the multi-dimensional array using a simple approach from the multiArr array
        // work process check this D:\java_course\java-notes\15_03-01-multi-dimensonal-array-doubt.md
        System.out.println("5 greatest numbers in the multi-dimensional array:");
        for (int count = 1; count <= 5; count++) {

            int max = multiArr[0][0];
            int row = 0;
            int col = 0;

            for (int i = 0; i < multiArr.length; i++) {

                for (int j = 0; j < multiArr[i].length; j++) {

                    if (multiArr[i][j] > max) {
                        max = multiArr[i][j];
                        row = i;
                        col = j;
                    }

                }

            }

            System.out.println(max);

            multiArr[row][col] = -1;
        }




        // jagged array
        System.out.println("Jagged array example:");
        int jaggedArr[][] = new int[3][]; // Declare a jagged array with 3 rows, but the number of columns in each row is not specified
        jaggedArr[0] = new int[5]; // First row has 5 columns
        jaggedArr[1] = new int[3]; // Second row has 3 columns
        jaggedArr[2] = new int[4]; // Third row has 4 columns


        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                jaggedArr[i][j] = (int)(Math.random() * 10); // Assign random single-digit values to the jagged array
            }
        }

        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println();
        }




        // 3D array
        System.out.println("3D array example:");
        int[][][] threeDArr = new int[2][3][4]; // Declare a 3D array with 2 layers, 3 rows, and 4 columns

        for (int i = 0; i < threeDArr.length; i++) {
            for (int j = 0; j < threeDArr[i].length; j++) {
                for (int k = 0; k < threeDArr[i][j].length; k++) {
                    threeDArr[i][j][k] = (int)(Math.random() * 10); // Assign random single-digit values to the 3D array
                }
            }
        }

        System.out.println(threeDArr[0][1][2]); // Accessing an element in the 3D array

        for (int i = 0; i < threeDArr.length; i++) {
            System.out.println("Layer " + i);

            for (int j = 0; j < threeDArr[i].length; j++) {
                for (int k = 0; k < threeDArr[i][j].length; k++) {
                    System.out.print(threeDArr[i][j][k] + " ");
                }
                System.out.println();
            }

            System.out.println();
        }

        for (int i = 0; i < threeDArr.length; i++) {
            for (int j = 0; j < threeDArr[i].length; j++) {
                System.out.print("{");
                for (int k = 0; k < threeDArr[i][j].length; k++) {
                    System.out.print(" " + threeDArr[i][j][k] + " ");
                }
                System.out.print("}");
            }
            System.out.println();
        }

        System.out.println("Using enhanced for loop to iterate through the 3D array:");
        for (int[][] layer : threeDArr) {
            for (int[] row : layer) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        

        // Drawback of using arrays in Java
        // Check Process Flow - 15_04-02-Drawback-Array-Insert-Shift.md
            // 1. Fixed size - cannot be resized after creation.
            // 2. Can store only one data type (homogeneous).
            // 3. Insertion in the middle is slow because elements need to be shifted.
            // 4. Deletion is slow because remaining elements need to be shifted.
            // 5. Memory may be wasted if the allocated array size is much larger than the number of elements used.
        int fixedSizeArr[] = new int[5]; // Declare an array of size 5
        fixedSizeArr[0] = 10;
        fixedSizeArr[1] = 20;
        fixedSizeArr[2] = 30;
        fixedSizeArr[3] = 40;
        fixedSizeArr[4] = 50;

        // insertion in the middle of the array
        int indexToInsert = 2; // Index where we want to insert the new element
        int newElement = 25; // The new element to be inserted

        // Shift elements to the right
        for (int i = fixedSizeArr.length - 1; i > indexToInsert; i--) {
            System.out.println("Shifting element at index " + (i - 1) + " to index " + i);
            System.out.println(fixedSizeArr[i]);
            fixedSizeArr[i] = fixedSizeArr[i - 1];
            System.out.println(fixedSizeArr[i]);
        }

        //System.out.println(fixedSizeArr[2]);

        // Insert the new element
        fixedSizeArr[indexToInsert] = newElement;
        System.out.println("Fixed size array after insertion: " + fixedSizeArr[2]);

        for (int i = 0; i < fixedSizeArr.length; i++) {
            System.out.println("Element at index " + i + ": " + fixedSizeArr[i]);
        }


        // deletion in the middle of the array - Check Process Flow - 15_04-03-Drawback-Array-delete-Shift.md
        int indexToDelete = 3; // Index of the element to be deleted

        // Shift elements to the left
        for (int i = indexToDelete; i < fixedSizeArr.length - 1; i++) {
            System.out.println("Shifting element at index " + (i + 1) + " to index " + i);
            System.out.println(fixedSizeArr[i]);
            fixedSizeArr[i] = fixedSizeArr[i + 1];
            System.out.println(fixedSizeArr[i]);
        }
        System.out.println("Fixed size array after deletion: " + fixedSizeArr[3]);

        fixedSizeArr[fixedSizeArr.length - 1] = 0;

        for (int i = 0; i < fixedSizeArr.length; i++) {
            System.out.println("Element at index " + i + ": " + fixedSizeArr[i]);
        }

        
        
        int[] arr2 = {10, 20, 30, 40, 50};

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Element at index " + i + ": " + arr2[i]);
        }

        // Physical Delete (Create New Array)
        System.out.println("Physical delete example:");
        //int[] arr3 = {10, 20, 40, 50};
        int[] arr3 = new int[arr2.length - 1];
        int indexToDeleteVal = 2;
        int j = 0;

        for (int i = 0; i < arr2.length; i++) {
            if (i != indexToDeleteVal) {
                arr3[j] = arr2[i];
                j++;
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("Element at index " + i + ": " + arr3[i]);
        }

        System.out.println("Logical delete example:");
        // Logical Delete
        int indexToDeleteVal2 = 2;

        for (int i = indexToDeleteVal2; i < arr2.length - 1; i++) {
            arr2[i] = arr2[i + 1];
            System.out.println(arr2[i]);
        }

        // Set the last element to a default value (e.g., 0) to indicate that it is logically deleted
        arr2[arr2.length - 1] = 0;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Element at index " + i + ": " + arr2[i]);
        }

        




    }
}
