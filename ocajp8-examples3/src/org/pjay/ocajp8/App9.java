package org.pjay.ocajp8;

public class App9 {

    public static void main(String[] args) {
        String s = "animals";

        System.out.println("s.length() >>> " + s.length());

        System.out.println("s.charAt(0) >>> " + s.charAt(0));
        System.out.println("s.charAt(6) >>> " + s.charAt(6));
        //System.out.println("s.charAt(7) >>> " + s.charAt(7));// StringIndexOutOfBoundsException is thrown

        System.out.println("s.indexOf('a') >>> " + s.indexOf('a'));
        System.out.println("s.indexOf(\"al\") >>> " + s.indexOf("al"));
        System.out.println("s.indexOf('a', 4) >>> " + s.indexOf('a', 4));
        System.out.println("s.indexOf(\"al\", 5) >>> " + s.indexOf("al", 5));// No match found gives value -1

        System.out.println("Method chaining call " + "AniMaL  ".trim().toLowerCase().replace('a', 'A'));

    }

}
