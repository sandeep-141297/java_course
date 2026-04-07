public class dataTypes {
    
    public static void main(String a[]) {
        // premitive datatype total 8 datatype

        // integer
        int num1 = 0;
        //byte by = 129; // not work max size is 127 positive
        byte by = 127;
        short sh = 558;
        long l = 5585411;

        // decimal
        //float f = 5.8; // not work because need define f by default it consider double value in java but datatype define float so its not work
        float f = 5.8f;
        double d = 5.8;

        // character
        //char c = "k"; not wok only single quote allowed
        //char c = k; not work need single quote
        char c = 'k';
        char ca = '8'; // can we use number but with single quote

        // boolean
        //boolean b = 1; // not work in java only true false
        boolean b = true;

        int ab = 100;
        System.out.println(ab);

        // java char datatype work with unicode
        char ch = 'a';
        System.out.println(ch); 
        ch++;
        System.out.println(ch); 
        ch--;
        System.out.println(ch); 
    }
}
