//System.out.print("Hello World"); wrong code its only work in jshell

class Hello
{
    public static void main(String a[]) 
    {
        //System.out.print("Hello World Test");
        //System.out.print(3 + 4);
        //System.out.print(5 + 6);
        //System.out.println(8 + 9); // new line
        //System.out.println(9 + 6);

        //int num1 = 3; //type int & assignment oper
        //int num2 = 5; 
        //int result = num1 + num2;
        //System.out.println(result);
        //System.out.println(num1 + num2);

        // primitive DataType
        // calculate range in integer (byte -2root(7) to 2root(7) - 1   =  -128 to 127)
        // int num1 = 9;
        // byte by = 127;
        // short sh = 558;
        // long l = 584448547445554L;
        // long l2 = 5844485474454554l;

        // float f = 5.8f;
        // float f2 = 5.8F;
        // double d = 5.8;

        // char c = 'k';
        // char c2 = '8';  // literals
        //char c = "k";

        // boolean b = true;


        //... Literals in java ...//
        // Java Number Systems (with prefixes)
        // Prefix	Number System	Base
        // 0b or 0B	    Binary	     2
        // 0	         Octal	     8
        // 0x or 0X	   Hexadecimal	 16
        // (no prefix)	Decimal	     10

        // Hex uses 0–9 and A–F:
        // Hex	Decimal
        // A	10
        // B	11
        // C	12
        // D	13
        // E	14
        // F	15

        int num1 = 0b101;  //0b or 0B binary 
        //Binary uses base 2, so each position is a power of 2, starting from the right.
        // Position (from right)	Power of 2	Value
        //1st	2⁰	1
        //2nd	2¹	2
        //3rd	2²	4
        //So the place values become:
        // 101 = 4   2   1
        //Binary:   1   0   1
        //Values:   4   2   1

        //0b → binary indicator
        //101 → actual binary number
        //So Java ignores 0b while calculating.
        //0x10  // hex
        //010   // octal
        //0b101   → binary
        //101     → decimal
        //0x101   → hexadecimal

        //Why do we sum the values?
        //Because each binary digit represents a value, and the total number is the sum of those values.
        //Binary is a positional number system (just like decimal).
        //Decimal example (you already know this)
        //345 = (3×100) + (4×10) + (5×1)

        //Binary works the SAME way
        // Binary 101
        // Bit	Place value	Multiply
        // 1	4	1×4 = 4
        // 0	2	0×2 = 0
        // 1	1	1×1 = 1
        //4 + 0 + 1 = 5

        //0b → only tells Java this is binary
        //Java calculates using place values
        //Final number = sum of (bit × power of 2)

        System.out.println(num1); // output 5

        //0x → hexadecimal indicator
        //101 → hex number

        //Hexadecimal place values (base-16)
        //From right to left, powers of 16:
        // Position	Power	Value
        // 1st	16⁰	1
        // 2nd	16¹	16
        // 3rd	16²	256

        //1 × 256 = 256
        //0 × 16  = 0
        //1 × 1   = 1
        //256 + 0 + 1 = 257

        // 101 = 256   16   1
        int num2 = 0x101;
        System.out.println(num2);  // 257


        // int a = 10;      // decimal → 10
        // int b = 0b101;  // binary  → 5
        // int c = 010;    // octal   → 8
        // int d = 0x10;   // hex     → 16


        int x = 0x1A;
        // A = 10
        // Position	Power	Value
        // 1st (right)	16⁰	1
        // 2nd	16¹	16
        // 1 × 16 = 16
        // A × 1  = 10 × 1 = 10
        // 16 + 10 = 26
        // 1A → (1×16) + 10 = 26
        System.out.println(x); // 26


        int octalval = 010;
        // 1 x 8 and 0 x 1 = 8
        System.out.println(octalval); // output 8

        int amount = 10_00_000; // in java _ working as , like amount with number and simple print without _ its easy to reading purpose
        System.out.println(amount);

        double n = 56; // auto converts to decimal value
        System.out.println(n); 

        double val = 12e11;  
        // e  or  E  means × 10^
        // 12e11  =  12 × 10¹¹
        // 12 = 1.2 × 10¹ => how (10¹ = 10) (1.2 × 10 = 12) (1.2 × 10¹ = 12)
        // 12 × 10¹¹ = (1.2 × 10¹) × 10¹¹
        // Rule 10ᵃ × 10ᵇ = 10ᵃ⁺ᵇ => 10¹ × 10¹¹ = 10¹²
        // 12 × 10¹¹ = 1.2 × 10¹²
        // 1.2E12 output

        //Why Java converts 12e11 to 1.2E12?
        // Answer: Because Java normalizes numbers to scientific notation with one digit before the decimal.
        System.out.println(val);
        System.out.println((long) val);        // 1200000000000


        //boolean bv = 1; // error: incompatible types: int cannot be converted to boolean
        //System.out.println(bv);

        char c = 'a';
        System.out.println(c);

        // char also work like integer incremennt or decrement 
        c++;
        System.out.println(c); // output b (increment)

        c--;
        System.out.println(c); // output a (decrement)







        

    }
}
