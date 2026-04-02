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


    }
    
}
