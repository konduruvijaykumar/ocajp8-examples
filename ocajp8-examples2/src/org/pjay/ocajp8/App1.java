package org.pjay.ocajp8;

public class App1 {

    public static void main(String[] args) {
        int y =4;
        int x = 4;
        // Pre decrement
        double i = 3+2*--y;
        // Post decrement
        double j = 3+2*x--;
        System.out.println("y " + y);
        System.out.println("x " + x);
        System.out.println("i " + i);
        System.out.println("j " + j);
    }

}
