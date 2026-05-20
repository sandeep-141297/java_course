// import means bringing something into the program.
// java.util is a package that contains utility classes, including Scanner.
// Scanner helps take input from the user using keyboard.
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) { 
        // Creates a Scanner object named sc.
        // System.in means keyboard input.
        Scanner sc = new Scanner(System.in);

        // Enter two numbers
        System.out.print("Enter first number: ");
        // nextDouble() reads a double value from the user input.
        // Takes decimal or whole number input and stores it in num1 variable.
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        // nextDouble() reads a double value from the user input.
        // Takes decimal or whole number input and stores it in num2 variable.
        double num2 = sc.nextDouble();

        // Show options
        System.out.println("\nChoose Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1-4): ");
        // nextInt() reads an integer value from the user input. 
        // Takes whole number input and stores it in choice variable.
        int choice = sc.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                // break statement is used to exit the switch block after executing the matched case.
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division = " + result);
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
            default:
                throw new AssertionError();
        }
        // Close the scanner object to prevent resource leaks.
        // It's a good practice to close the scanner when it's no longer needed.
        sc.close();
    }
    
}

/*
nextDouble() and nextInt() are predefined methods (functions) of the Java Scanner class.

// Other Common Scanner Methods

| Method          | Purpose        | Example Input |
| --------------- | -------------- | ------------- |
| `nextInt()`     | Integer        | `5`           |
| `nextDouble()`  | Decimal number | `5.7`         |
| `next()`        | Single word    | `Hello`       |
| `nextLine()`    | Full sentence  | `Hello World` |
| `nextFloat()`   | Float number   | `3.14`        |
| `nextLong()`    | Large integer  | `999999`      |
| `nextBoolean()` | true/false     | `true`        |

*/
