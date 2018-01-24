package org.pjay.ocajp8;

public class App7 {

    public static void main(String[] args) {
        // The expression is evaluated left to right
        System.out.println(1 + 2); //3
        System.out.println("a" + "b"); //ab
        System.out.println("a" + "b" + 3); //ab3
        System.out.println(1+2+"c"); //3c
        System.out.println("a"+2+5); //a25

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);

        String s = "1";
        s += "2";
        s += 3;
        System.out.println("s " + s);
    }

}
