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
    }
}
