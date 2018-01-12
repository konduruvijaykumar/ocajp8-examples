package org.pjay.ocajp8;

public class App7 {

    public static void main(String[] args) {
        long x = 5;
        long y = x = 3;// For better understanding long y = (x = 3);
        System.out.println("x " + x);
        System.out.println("y " + y);

        int i = 7;
        // Note: Cannot resolve symbol 'i' -- if above variable i is not defined
        int j = (i = 5);
        System.out.println("i " + i);
        System.out.println("j " + j);
    }

}
