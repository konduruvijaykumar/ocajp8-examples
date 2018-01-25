package org.pjay.ocajp8;

import java.util.ArrayList;

public class App13 {

    public static void main(String[] args) {
        ArrayList<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add(1, "robin"); // [hawk, robin]
        birds.add(0, "blue jay"); // [blue jay, hawk, robin]
        birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
        System.out.println(birds); // [blue jay, cardinal, hawk, robin]

        // Runtime Error: java.lang.IndexOutOfBoundsException: Index: 5, Size: 4
        //birds.add(5,"rjay");

    }

}
