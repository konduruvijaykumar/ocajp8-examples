package org.pjay.ocajp8;

public class App3 {

    public static void main(String[] args) {
        int x = 3;
        int y = ++x * 5/x-- + --x;
        System.out.println("x " + x);
        System.out.println("y " + y);

        int i = 3;
        int j = ++i * 5/(i-- + --i);
        System.out.println("i " + i);
        System.out.println("j " + j);
    }

}
