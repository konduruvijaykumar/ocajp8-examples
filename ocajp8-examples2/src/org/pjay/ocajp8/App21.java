package org.pjay.ocajp8;

public class App21 {

    public static void main(String[] args) {
        // Block 1
        {
            int x = 0;
            for(long y = 0, z = 4;x < 5 && y <10;x++, y++){
                System.out.println("y " + y);
            }
            System.out.println("x " + x);
        }

        // Block 2
        {
            int x = 0;
            // Compiler error - Variable 'x' is already defined in the scope
/*            for(long y = 0, x = 4;x < 5 && y <10;x++, y++){//for(int y = 0, x = 4;x < 5 && y <10;x++, y++)for(long y = 0, x = 4;x < 5 && y <10;x++, y++){
                System.out.println("y " + y);
            }*/
            System.out.println("x " + x);
        }

        //Block 3
        {
            // Compiler error -- Identifier expected
            //int i = 0,long j = 0;
            // Compiler error - ';' expected. Identifier expected. -- As variables y and x are diff types declared in same line or statement without end or termination
/*            for(long y = 0,int x = 4;x < 5 && y <10;x++, y++){
                System.out.println("y " + y);
            }*/
        }
    }

}
