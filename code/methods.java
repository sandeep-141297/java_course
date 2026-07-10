
class shopkeeper {
    
    public void sell() {
        System.out.println("Selling items");
    }

    public String giveABook(int cost) {
       
        //written way 1
        if (cost >= 10) {
            return "Book";
        } else {
            return "give me money at least 10";
        }
        
        //written way 2
        //If there is only one statement, {} are optional.
        /*if (cost >= 10) 
            return "Book";
        else
            return "give me money at least 10";*/

        //written way 3
        // If there is only one statement after an if, {} are optional.
        // Since the first return ends the method immediately, an else is not required.
        // If cost >= 10, the method returns "Book" and stops.
        // Otherwise, execution continues to the next statement and returns
        // "give me money at least 10".
        /*if (cost >= 10) 
            return "Book";
        
            return "give me money at least 10";*/


        // for production code, it is better to use the first way, as it is more readable and less error-prone.
        
        //System.out.println("This line will never be executed because the method has already returned. and the compiler will give an error for this line because it is unreachable code.");
    }
}

class calculator {

    int num; // default value of int is 0, so num will be initialized to 0. Check this file 14_01-variable-default-value-java.md
    int num2 = 5;

    public int add(int a, int b, int c) {
        System.out.println(num);
        return a + b + c;
    }

    public int add(int a, int b) {
        System.out.println(num);
        return a + b;
    }

    // Its not different parameter is matter not different return type. So, we cannot have two methods with same parameter but different return type.
    /*public double add(int a, int b) {
        return a + b;
    }*/

    public double add(double a, int b) {
        return a + b;
    }
}


public class methods {
    
    //shopkeeper shop = new shopkeeper();
    //In Java, you cannot write executable statements directly inside a class (except in initialization blocks). Method calls like shop.sell(); must be inside a method, such as main().
    //shop.sell();

    public static void main(String a[]) {
        

        calculator calc = new calculator();
        calculator calc2 = new calculator();

        int sum = calc.add(5, 10);  
        System.out.println("Sum: " + sum);

        calc.num = 10;

        System.out.println("Num in calc: " + calc.num); // 0
        System.out.println("Num in calc2: " + calc2.num); // 0
        System.out.println("Num2 in calc: " + calc.num2); // 5
        System.out.println("Num2 in calc2: " + calc2.num2); // 5

        int sum1 = calc.add(5, 10);  
        System.out.println("Sum1: " + sum1);

        System.out.println("Hello, World!");
        shopkeeper shop = new shopkeeper();
        shop.sell();
        String book = shop.giveABook(5);
        System.out.println(book);
    }

    
    
}
