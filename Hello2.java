public class Hello2 {
    public static void main(String a[]) {

        //.... Type conversion, casting and promotion ...//
        byte bc = 127;
        int ac = 12;
        ac = bc; // its "conversion" (normally assign)
        System.out.println(ac); // work because int range bigger than byte

       
        int ac1 = 12;
        //byte bc1 = ac1; // not work because byte range smaller than int
        byte bc1 = (byte)ac1; // for solution we explicit convert the int to byte that is "casting"
        System.out.println(bc1); // output 12

        int ac2 = 257;
        byte bc2 = (byte)ac2; // its convert the byte but int value is greater than byte range so modules operater will work behind 
        // byte complete range is 256 = so 257 % 256 and remider get 1 thats why output 1
        System.out.println(bc2); // output 1 
        System.out.println(ac2); // output 257
        ac2 = bc2;
        System.out.println(ac2); // output 1


        float f = 5.6f;
        int t = (int)f; // will loose after . value
        System.out.println(t);


        byte a1 = 10;
        byte a2 = 30;
        //byte res = a1 * a2; // not work bec 10 x 30 = 300 which is bigger than byte range
        int res = a1 * a2; // for solution we assign as a integer bec 300 is adjust in integer range // This is called "Type Promotion"
        //System.out.println(a1 * a2);
        System.out.println(res);





        //... Operators ...//
        System.out.println("Arithmetic Operators");
        // Arithmetic (+   -   *   /   %) AND Assignment (=)
        int num1 = 7;
        int num2 = 5;
        int result = num1 + num2;
        int result2 = num1 - num2;
        int result3 = num1 * num2;
        int result4 = num1 % num2;
        int result5 = num1 / num2;
        System.out.println("Addition = " + result);
        System.out.println("Subtraction = " + result2);
        System.out.println("Multiplication = " + result3);
        System.out.println("Modulus = " + result4);
        System.out.println("Division = " + result5);
        System.out.printf("Multiplication = %d%n", result3);
    }
}
