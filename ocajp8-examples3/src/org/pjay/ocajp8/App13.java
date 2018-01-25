package org.pjay.ocajp8;

import java.lang.reflect.Array;
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

        System.out.println("birds.set(0,\"pjay\") >>> " + birds.set(0,"pjay"));

        ArrayList al1 = new ArrayList();
        al1.add(1);
        al1.add(4);
        System.out.println(al1.toString());

    }

}
