public class loops {
    public static void main(String a[]) {
        // check file java-notes/10-loops-in-java.md

        // while loop
        /*while (true) {
            System.out.println("This is a while loop");
        }*/

        int i = 2;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        int j = 1;
        while (j <= 5) {
            int square = j * j; 

            System.out.println("j = " + j);
            System.out.println("square = " + square);

            j++;
        }

        // 2 to 5 multiplication table
        // nested while loop
        i = 2;

        while (i <= 5) {
            j = 1;
            while (j <= 10) {
                System.out.println(i + " * " + j + " = " + (i * j));
                j++;
            }
            System.out.println(); // blank line
            i++;
        }

        i = 1;
        while (i <= 5) {
            System.out.println("Hi" + i);
            j = 1;
            while (j <= 3) {
                System.out.println("Hello");
                j++;
            }
            i++;
        }
    }
}