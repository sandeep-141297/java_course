
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
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b) {
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
        int sum = calc.add(5, 10);  
        System.out.println("Sum: " + sum);

        System.out.println("Hello, World!");
        shopkeeper shop = new shopkeeper();
        shop.sell();
        String book = shop.giveABook(5);
        System.out.println(book);
    }

    
    
}
