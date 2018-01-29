package org.pjay.ocajp8;

public class App7 {

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);
        s1.substring(4);// Returns string and does not modify string builder
        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);
    }

}
