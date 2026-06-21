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

        //int weekday = 1;
        int weekday = 3;
        switch (weekday) {
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

        String daywakeup = "Sunday";

        switch (daywakeup) {
            case "Sunday", "Saturday":
                System.out.println("at 6:00 AM");
                break;
            case "Monday":
                System.out.println("at 7:00 AM");
                break;
            default:
                System.out.println("at 8:00 AM");
        }


        ///// modern switch statement ////
        switch (daywakeup) {
            case "Sunday", "Saturday" -> System.out.println("at 6:00 AM");
            case "Monday" -> System.out.println("at 7:00 AM");
            default -> System.out.println("at 8:00 AM");
        }

        int dayOfWeek = 5;

        switch (dayOfWeek) {
            case 1 -> 
                System.out.println("at 6:00 AM");
            case 2 -> 
                System.out.println("at 7:00 AM");
            case 3 -> 
                System.out.println("at 8:00 AM");
            default -> 
                System.out.println("at 9:00 AM");
        }

        // Using switch expression (Java 14 and later) it means returning a value from the switch statement
        String dayName = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        System.out.println("The day is: " + dayName);

        String wakeupTime = null;
        // using switch expression to assign wakeup time based each case of daywakeup variable
        switch (daywakeup) {
            case "Sunday", "Saturday" -> wakeupTime = "at 6:00 AM";
            case "Monday" -> wakeupTime = "at 7:00 AM";
            default -> wakeupTime = "at 8:00 AM";
        }
        System.out.println("Wakeup time: " + wakeupTime);

        // if dont want -> this that means you can use yield keyword to return value from switch expression
        wakeupTime = switch (daywakeup) {
            case "Sunday", "Saturday" -> {
                System.out.println("Weekend");
                yield "at 6:00 AM";
            }
            case "Monday" -> {
                System.out.println("Weekday");
                yield "at 7:00 AM";
            }
            default -> {
                System.out.println("Other day");
                yield "at 8:00 AM";
            }
        };
        System.out.println("Wakeup time: " + wakeupTime);

        // if you want to use this : in modern switch statement, you can use it like this
        result = switch (daywakeup) {
            case "Sunday", "Saturday" : yield "at 6:00 AM";
            case "Monday" : yield "at 7:00 AM";
            default : yield "at 8:00 AM";
        }; 

        // This is incorrect because System.out.println() returns void, and yield must return a value.
        // Error - yield outside of switch expression
        // You are using a switch statement, not a switch expression.
        // Here, switch is not returning a value, so yield is not allowed.
        /* switch (daywakeup) {
            case "Sunday", "Saturday": yield System.out.println("at 6:00 AM");
            case "Monday" : yield System.out.println("at 7:00 AM");
            default : yield System.out.println("at 8:00 AM");
        }*/
       
    }
}
