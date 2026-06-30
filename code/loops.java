public class loops {
    public static void main(String a[]) {
        // check file java-notes/10-loops-in-java.md

        /////////// while loop  ///////////
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


        //////// do while loop /////////
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        do {
            System.out.println("This will be printed at least once");
        } while (i < 1); // This will print the message at least once, then check the condition

        // * triangle print
        i = 1;
        do {
            j = 1;
            do {
                System.out.print("*");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= 5);


        ////// for loop //////
       
        // print rectangle of * with 3 rows and 5 columns
        for(int row = 1; row <= 3; row++) {

            for(int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i2 = 1; i2 >= 1; i2--) {
            System.out.println("Step " + i2);
        }
        //System.out.println(i2); // This will throw an error because i2 is not accessible outside the for loop
        for (int i2 = 4; i2 >= 0; i2--) {
            System.out.println("Step " + i2);
        }

        for (int i2 = 0; i2 < 4; i2++) {
            System.out.println("Total step till now " + i2);
        }

        for (int day = 1; day <= 5; day++) {
            System.out.println("Work day " + day);
            for (int hour = 1; hour <= 9; hour++) {
                //System.out.println("Hour " + hour);
                //System.out.println("    " + hour+8); // this will concatenate the value because string are their not add the numbers
                System.out.println("    " + (hour + 8) + " - " + (hour + 9)); // this will add the value because of the brackets
            }
        }

        // for loop writeen types
        for (int i2 = 1; i2 <= 5;) {
            System.out.println("i2 = " + i2);
            i2++; // incrementing the value of i2 inside the loop
        }

        int i2 = 1;
        int sum = 0;
        for (; i2 <= 5;) {
            sum += i2; // sum = sum + i2
            i2++;
            System.out.println("Sum = " + sum);
        }

        int i3 = 1;
        int sub = 0;
        for (; i3 <= 5; i3++) {
            sub -= i3; // sub = sub - i3
            System.out.println("Sub = " + sub);
        }

        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = 1; row <= 5; row++) {
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }   
}