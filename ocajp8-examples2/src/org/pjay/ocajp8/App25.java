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
    }

}
