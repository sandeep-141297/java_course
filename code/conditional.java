public class conditional {
    public static void main(String[] args) {
        // Check 09_conditional-statement.md for more details on conditional statements in Java
        int a = 10;
        int b = 20;

        // Using if-else statement
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is not greater than b");
        }

        // Using ternary operator
        String result = (a > b) ? "a is greater than b" : "a is not greater than b";
        System.out.println(result);

        // Using switch statement
        int day = 3;    
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // no need curly braces for single statements in if-else, but it's good practice to use them
        if (a > 20)  System.out.println("a is greater than b");
        else System.out.println("a is not greater than b");

        if(true) {
            System.out.println("This will always be printed");
        }

        if (a > 10 && a < 20) {
            System.out.println("a is between 10 and 20");
        }

        int x = 5;
        int y = 9;
        int z = 7;

        if (x > y) {
            System.out.println("x is greater than y");
            System.out.println("x = " + x + ", y = " + y);
        } else if (x < y) {
            System.out.println("x is less than y");
            System.out.println("x = " + x + ", y = " + y);
        } else {
            System.out.println("x is equal to y");
            System.out.println("x = " + x + ", y = " + y);
        }


        if(x > y && x > z)
          System.out.println("x is the greatest = " + x);
        else if (y > x && y > z)
            System.out.println("y is the greatest = " + y);
        else if (z > x && z > y)
            System.out.println("z is the greatest = " + z);
        else
            System.out.println("There is a tie for the greatest value");


        if(x > y && x > z)
          System.out.println("x is the greatest = " + x);
         // if x is already false, no need to check it again in the next condition its optimize the code by avoiding redundant checks
         // check this file for understading 09_01-conditional-logic-optimization.md
        else if (y > z)
            System.out.println("y is the greatest = " + y);
        else
          System.out.println("z is the greatest = " + z);  

        // evenOddResult if even number than evenOddResult should be "Even" otherwise "Odd"
        int num1 = 8;
        String evenOddResult = null;
        evenOddResult = num1 % 2 == 0 ? "Even" : "Odd";
        System.out.println(evenOddResult);
    }
}
