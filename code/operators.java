public class operators {
   public static void main(String a[])
    {
        // Arithmetic Operators
        int num1 = 3;
        int num2 = 10;
        // addition
        int result = num1 + num2;
        System.out.println(result);
        // subtraction
        int result2 = num1 - num2;
        System.out.println(result2);
        // multiplication
        int result3 = num1 * num2;
        System.out.println(result3);
        // division
        int result4 = num1 / num2; 
        System.out.println(result4); // why 0 output? actual result is 0.3 but int can't store . value thats why 0
        double result5 = num1 / num2; 
        System.out.println(result5); // why 0.0 output?  check 08_02_01-Airthmetic-doubt.md file

    }
}
