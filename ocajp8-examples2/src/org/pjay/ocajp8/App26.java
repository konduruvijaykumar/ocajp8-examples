package org.pjay.ocajp8;

public class App26 {

    public static void main(String[] args) {

        {
            int x = 0;
            while(x++ < 10) {}
            // Compiler error -- Incompatible types. Found: 'boolean', required: 'java.lang.String'
            //String message = x > 10 ? "Greater than" : false;
            String message = x > 10 ? "Greater than" : "false";
            System.out.println(message+","+x);
        }

        {
            for(int i=0; i<10 ; ) {
                // Note: creates a infinite loop
                //i = i++;
                i++;
                System.out.println("Hello World " + i);
            }

            int m = 9, n = 1, x = 0;
            x += m + n;
            System.out.println("x " + x);
        }

        {
            int count = 0;
            ROW_LOOP: for(int row = 1; row <=3; row++)
                for(int col = 1; col <=2 ; col++) {
                    if(row * col % 2 == 0) continue ROW_LOOP;
                    count++;
                }
            System.out.println(count);
            System.out.println(count);
        }

    }

}
