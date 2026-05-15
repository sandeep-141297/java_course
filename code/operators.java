public class operators {
   public static void main(String a[])
    {
        // Operators in Java: Describe the details of operators in Java with examples in 08-java-operators.md, and check all files starting with 08_* for a better understanding of operators in Java.
        
        // Arithmetic Operators // +, -, *, /, %
        System.out.println("Arithmetic Operators:"); 
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
        // modulas
        int result6 = num2 % num1; // 10/3 = 3.3333 but we want only reminder so 10 - (3*3) = 1
        System.out.println(result6);


        // Assignment Operators // =, +=, -=, *=, /=, %= , ^= , <<=, >>=, >>>=
        System.out.println("Assignment Operators:");
        num1 += num2; // num1 = num1 + num2; 3 + 10 = 13 
        System.out.println(num1);
        num1 += num1; // num1 = num1 + num1; 13 + 13 = 26
        System.out.println(num1);
        num1 += 2; // num1 = num1 + 2; 26 + 2 = 28
        System.out.println(num1);
        num1 -= num2; // num1 = num1 - num2; 28 - 10 = 18
        System.out.println(num1);
        num1 *= num2; // num1 = num1 * num2; 18 * 10 = 180
        System.out.println(num1);
        num1 /= num2; // num1 = num1 / num2; 180 / 10 = 18
        System.out.println(num1);
        num1 %= num2; // num1 = num1 % num2; 18 / 10 = 1.8 but we want only reminder so 18 - (10*1) = 8
        System.out.println(num1);
        // bitwise XOR assignment check 08_03-01-Assignment-operator-doubt.md file for more understanding
        num1 ^= num2; // num1 = num1 ^ num2; 8 ^ 10 = 2
        System.out.println(num1);
        num1 ^= 16; // num1 = num1 ^ 16; 2 ^ 16 = 18
        System.out.println(num1);
        num1 <<= 5; // num1 = num1 << 5; 18 << 5 = 576
        System.out.println(num1);
        num1 >>= 2; // num1 = num1 >> 2; 576 >> 2 = 144
        System.out.println(num1);
        num1 >>>= 3; // num1 = num1 >>> 3; 144 >>> 3 = 18
        System.out.println(num1);


        // unary Operators // ++, --
        System.out.println("Unary Operators:");
        // Increment and Decrement Operators
        // postfix increment
        num1++; // num1 = num1 + 1; 18 + 1 = 19
        System.out.println(num1);
        // postfix decrement
        num1--; // num1 = num1 - 1; 19 - 1 = 18
        System.out.println(num1);
        // prefix increment
        ++num1; // num1 = num1 + 1; 18 + 1 = 19
        System.out.println(num1);   
        // prefix decrement
        --num1; // num1 = num1 - 1; 19 - 1 = 18
        System.out.println(num1);
        int result7 = num1++; // Postfix increment: first assign current value to result7, then increment num1.
        System.out.println(result7);
        int result8 = ++num1; // Prefix increment: first increment num1, then assign updated value to result8.
        System.out.println(result8);
        int result9 = num1--; // Postfix decrement: first assign current value to result9, then decrement num1.
        System.out.println(result9);
        int result10 = --num1; // Prefix decrement: first decrement num1, then assign updated value to result10.
        System.out.println(result10);
        int result11 = num1++ + ++num1; // 18 + 20 = 38; first num1++ will assign 18 to result11 and then num1 will become 19, then ++num1 will make num1 20 and add it to result11 which is 18, so final result will be 38
        System.out.println(result11);
        int num = 5;
        int result12 = ~num;
        System.out.println(result12); // -6; ~5 = -(5+1) = -6
        int num3 = 4;
        int result12_1 = ~num3;
        System.out.println(result12_1); // -5; ~4 = -(4+1) = -5
        boolean result13 = !false; // logical NOT operator, !false becomes true
        System.out.println(result13);
        

        // Relational Operators // ==, !=, >, <, >=, <=
        System.out.println("Relational Operators:");
        int a1 = 10;
        int a2 = 20;
        boolean isEqual = (a1 == a2); // false; because 10 is not equal to 20
        System.out.println(isEqual);
        System.out.println(a1 == a2); // false; because 10 is not equal to 20
        System.out.println(a1 != a2); // true; because 10 is not equal to 20
        System.out.println(a1 > a2); // false; because 10 is not greater than 20
        System.out.println(a1 < a2); // true; because 10 is less than 20
        System.out.println(a1 >= a2); // false; because 10 is not greater than or equal to 20
        System.out.println(a1 <= a2); // true; because 10 is less than or equal to 20


        // Logical Operators // && - AND, || - OR, ! - NOT
        System.out.println("Logical Operators:");
        boolean b1 = true;
        boolean b2 = false; 
        System.out.println(b1 && b2); // false; because true && false is false
        System.out.println(b1 || b2); // true; because true || false is true
        System.out.println(!b1); // false; because !true is false

        // Combining relational operators with logical operators
        boolean result14 = (a1 == a2) && (a1 < a2); // false && true = false
        System.out.println(result14);

        

    }
}
