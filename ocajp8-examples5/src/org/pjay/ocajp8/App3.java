package org.pjay.ocajp8;

import java.util.ArrayList;

public class App3 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        // Runtime Exception -- Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
        al.add(1,1);
        al.add(1,1);
        System.out.println(al.size());
    }

}
