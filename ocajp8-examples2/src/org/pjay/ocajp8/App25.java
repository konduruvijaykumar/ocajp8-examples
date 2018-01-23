package org.pjay.ocajp8;

public class App25 {

    public static void main(String[] args) {
        FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                if(a==2 || x=='b')
                    continue FIRST_CHAR_LOOP;
                System.out.print(" " + a + x);
            }
        }

        System.out.println("");

        {
            FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
                for (char x = 'a'; x <= 'c'; x++) {
                    if(a==2 || x=='b')
                        continue;
                    System.out.print(" " + a + x);
                }
            }
        }

        System.out.println("");

        {
            FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
                for (char x = 'a'; x <= 'c'; x++) {
//                    if(a==2 || x=='b')
//                        continue;
                    System.out.print(" " + a + x);
                }
            }
        }

        {
            byte x = 5;
            byte y = 10;
            //double z = x + y;
            //float z = x + y;
            //long z = x + y;
            //int z = x + y;
            // Compiler error -- if no explicit cast, due to default integer promotion in expression or operator evaluation
            byte z = (byte) (x + y);
        }
    }

}
