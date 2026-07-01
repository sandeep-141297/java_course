class Calculator {

    int a;

    public int add(int n1, int n2) {
        //System.out.println("Addition method called");
        int r = n1 + n2;
        return r;
    }
}


public class class_object {

    public static void main(String[] args) {

        int num1=10, num2=20;

        //Calculator → Class name
        //cals → Object reference (variable name), not the object name
        //new Calculator() → Creates a new object
        //cals.add() → Calls the add() method on that object
        Calculator cals = new Calculator();
        //cals.add(); only calling the method without storing the return value
        int result1 = cals.add(6, 7);
        int result2 = cals.add(num1, num2); // calling the method and storing the return value
        System.out.println("The sum of two numbers is: " + result1);
        System.out.println("The sum of two numbers is: " + result2);

        //int result = num1 + num2;
        //System.out.println("The sum of two numbers is: " + result);
    }
    
}
