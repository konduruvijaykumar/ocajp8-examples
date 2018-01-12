package org.pjay.ocajp8;

public class App6 {

    public static void main(String[] args) {
        // Code block 1
        {
            int x = 2, y = 3, i = 2, j = 3;
            x = x*y; // Simple assignment operator
            i *= j; // Compound assignment operator
            System.out.println("x "+x);
            System.out.println("i "+i);
        }
        // code block 2
        {
            int y =3;
            // Note: Compiler error, Compound assignment operator can be applied to already declared variables
            // Cannot be used for declaring new variable and assigning variables
            //int x *= y;
        }
        // code block 3
        {
            long x = 10;
            int y = 5;
            // Note: Compiler Error - Incompatible types. Found: 'long', required: 'int'. We need explicit casting (int) for fixing - y = (int)x*y;
            //y = x*y;
            // Where as compound operators do the casting automatically.
            y *= x;
            System.out.println("y " + y);
        }

        short x = 3;
        short y = 10;
        // Note: Incompatible types. Found: 'int', required: 'short'
        //y = x*y;// Fix is -- y = (short) (x*y);
        y *= x;
        System.out.println("y " + y);
    }

}
