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
        System.out.println(result12); // -6; ~5 = -(5+1) = -6  // check 08_04-Unary-operator.md line no from 876
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

        // short-circuit evaluation with logical operators
        int x1 = 5;
        int x2 = 10;
        boolean result15 = (x1 > x2) && (x1 / 0 > 1); // short-circuit evaluation prevents division by zero, so the second part is not evaluated and result15 is false
        System.out.println(result15);
        boolean result16 = (x1 < x2) || (x1 / 0 > 1); // short-circuit evaluation prevents division by zero, so the second part is not evaluated and result16 is true
        System.out.println(result16);
        // without short-circuit evaluation, the second part would be evaluated and cause an exception, but with short-circuit evaluation, it is not evaluated because the first part already determines the result.
        // boolean result17 = (x1 > x2) & (x1 / 0 > 1); // without short-circuit evaluation, both parts are evaluated, so this will throw an exception due to division by zero
        // System.out.println(result17);
        // boolean result18 = (x1 < x2) | (x1 / 0 > 1); // without short-circuit evaluation, both parts are evaluated, so this will throw an exception due to division by zero
        // System.out.println(result18);
        boolean result19 = (x1 > x2) & (x1 < x2); // without short-circuit evaluation, both parts are evaluated, so this will not throw an exception and result19 will be false because 5 is not greater than 10 and 5 is less than 10
        System.out.println(result19);
        boolean result20 = (x1 < x2) | (x1 > x2); // without short-circuit evaluation, both parts are evaluated, so this will not throw an exception and result20 will be true because 5 is less than 10 and 5 is not greater than 10
        System.out.println(result20);
        
        System.out.println("! because true is false: " + result20); // false; because !true is false
        System.out.println("! because false is true: " + result19); // true; because !false is true

        // Combining relational operators with logical operators
        boolean result14 = (a1 == a2) && (a1 < a2); // false && true = false
        System.out.println(result14);

        
        // Bitwise Operators // &, |, ^, ~, <<, >>, >>>
        System.out.println("Bitwise Operators:");
        int numA = 5; // in binary: 0101
        int numB = 3; // in binary: 0011
        int result21 = numA & numB; // 5 & 3 = 1; bitwise AND
        System.out.println(result21);
        int result22 = numA | numB; // 5 | 3 = 7; bitwise OR
        System.out.println(result22);
        int result23 = numA ^ numB; // 5 ^ 3 = 6; bitwise XOR
        System.out.println(result23);
        int result24 = ~numA; // ~5 = -6; bitwise NOT
        System.out.println(result24);
        int result25 = numA << 1; // 5 << 1 = 10; left shift
        System.out.println(result25);
        int result26 = numA >> 1; // 5 >> 1 = 2; right shift // before 0101 after 0010 and last bit is removed and 0 is added in the leftmost bit because numA is positive, if numA was negative then 1 would be added in the leftmost bit
        System.out.println(result26);
        int result27 = numA >>> 1; // 5 >>> 1 = 2; unsigned right shift
        System.out.println(result27);

        // Ternary Operator // ? :
        // Check /java-notes/08_08-instanceof-operator-java.md
        System.out.println("Ternary Operator:");
        int ab = 10;
        int ba = 20;
        int max = (ab > ba) ? ab : ba;
        System.out.println("Maximum of " + ab + " and " + ba + " is: " + max);

        // instanceOf Operator // instanceof
        System.out.println("instanceOf Operator:");
        Object obj = new String("Hello");
        if (obj instanceof String) {
            System.out.println("obj is an instance of String");
        } else {
            System.out.println("obj is not an instance of String");
        }

        Object obj2 = null;
        if (obj2 instanceof String) {
            System.out.println("obj2 is an instance of String");
        } else {
            System.out.println("obj2 is not an instance of String");
        }

        String name = "Sandeep";
        System.out.println(name instanceof String); // true because name is a String object, so it is an instance of the String class
        String name2 = "Sandeep";
        System.out.println(name2 instanceof Object); // true because String is a subclass of Object, so name2 is an instance of Object as well

        Object obj3 = "Hello"; // obj3 is a reference of type Object, but it is actually referring to a String object, so it is an instance of String
        //String str = (String) obj;
        if(obj3 instanceof String) {
            String str = (String) obj3;
            System.out.println(str);
        }
        
        if(obj3 instanceof Integer) {
            Integer num5 = (Integer) obj3;
            System.out.println(num5);
        } else {
            System.out.println("obj3 is not an instance of Integer");
        }
    }
}


