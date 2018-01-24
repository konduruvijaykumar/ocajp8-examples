package org.pjay.ocajp8;

public class App8 {

    public static void main(String[] args) {
        String s1 = "1";
        String s2 = s1.concat("2");
        System.out.println("s1 " + s1);
        System.out.println("s2 " + s2);
        s2.concat("3");
        System.out.println("s1 " + s1);
        System.out.println("s2 " + s2);
    }

}
