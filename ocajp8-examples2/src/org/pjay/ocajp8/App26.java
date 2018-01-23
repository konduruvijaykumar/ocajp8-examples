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
        }

    }

}
