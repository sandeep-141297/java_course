public class typecastingconver {
    public static void main(String a[]) 
    {
        //byte a = 124; // String a[] already same name variable defined
        byte ac = 124; 
        int b = 256;
        // Normal conversion its is implicit conversion ///////////////////
        //b = ac; // it works bec int range is bigger than byte 
        
        // Type Casting that is explicit converstion //////////////////
        //ac = b; // error: incompatible types: possible lossy conversion from int to byte. byte range is smaller than int
        ac = (byte) b; // solution
        System.out.println(ac);


        int x = 12;
        byte bx = (byte) x;

        System.out.println(bx); // 12

        int x2 = 130;
        byte bx2 = (byte) x2;
        // 128 (negative) + 1 (zero) + 127 (positive) = 256 byte total range
        System.out.println(bx2); 
        // (value % 256) -126 
        // 130 % 256 = 130 // it not divisble so reminder is 130   because 130 < 256 // check 07_02-moduler-work file
        // 130 > 127 → 130 - 256 = -126
        // (130 - 256) (Only adjust (wrap) when value is OUTSIDE byte range and 130 is outside the byte range)


        int c = 259;
        byte m = (byte) c;
        System.out.println(m); 

        int c2 = 257;
        byte m2 = (byte) c2;
        System.out.println(m2); 


        float ff = 5.6f;
        int mm = (int) ff; 
        System.out.println(mm);  // lost point value only outuput is 5


        //(Expression Promotion) /////////////////////////
        byte av = 10;
        byte bv = 20;

        int result = av + bv;  // NOT byte
        System.out.println(result);
    }
}
