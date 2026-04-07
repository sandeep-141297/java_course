public class literals {

    public static void main (String a[])
    {
        int num1 = 0b101;
        // (1 x 4) + (0 x 2) + (1 x 1)
        System.out.println(num1);

        int num2 = 0x71;
        // (7 x 16) + (1 x 1)
        System.out.println(num2);

        int num3 = 0x8E;
        // (8 x 16) + (14 x 1)
        System.out.println(num3);

        int num4 = 0x8e;
        // (8 x 16) + (14 x 1)
        System.out.println(num4);

        int num5 = 100000000;
        // 100000000  → already decimal // So no calculation needed 
        // If you STILL want to “calculate” - You can think like this (base 10):
        // 1×10⁸ + 0×10⁷ + 0×10⁶ + ... + 0×10⁰ = 100000000
        System.out.println(num5);


        int num6 = 10_00_00_000; 
        System.out.println(num6);

        int b = 0b1010_1010;
        System.out.println(b);

        int c = 0xFF_EC_DE_5E;
        System.out.println(c);

        double num7 = 56;
        System.out.println(num7); // integer convert to decimal output 56.0

        // powe no not large with multiply
        double num10 = 12e2;
        System.out.println(num10);

        // power no large with multiply and increase power
        double num8 = 56e7;
        System.out.println(num8);

        double num9 = 12e10;
        System.out.println(num9);

        // power no large with multiply and decrease power
        double num11 = 0.5e12;
        System.out.println(num11);

        // power no not large with multiply
        double num12 = 0.5e2;
        System.out.println(num12);


        //boolean num13 = 1; // not work can't convert int to boolean only true false allowed
        //System.out.println(num13); 

        boolean num13 = true; 
        System.out.println(num13); 

        // java char datatype work with unicode
        char ch = 'a';
        System.out.println(ch); 
        ch++;
        System.out.println(ch); 
        ch--;
        System.out.println(ch); 

    }
    
}
