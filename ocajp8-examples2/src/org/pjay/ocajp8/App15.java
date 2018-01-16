package org.pjay.ocajp8;

public class App15 {

    public static void main(String[] args) {
        String s1 = new String("Vijay");
        String s2 = "Vijay";
        String s3 = "Vijay";
        String s4 = s1.intern();//new String("Vijay").intern();// Works same
        System.out.println("s1 == s2 >>> " + (s1 == s2));
        System.out.println("s2 == s3 >>> " + (s2 == s3));
        System.out.println("s3 == s4 >>> " + (s3 == s4));
    }

}
