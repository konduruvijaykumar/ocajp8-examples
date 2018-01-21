package org.pjay.ocajp8;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class App1 {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("one");
        al.add("two");
        System.out.println("al before " + al);
        al.add(1,"three");
        System.out.println("al after " + al);
    }

}
