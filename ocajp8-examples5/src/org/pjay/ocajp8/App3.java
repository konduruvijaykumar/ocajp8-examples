package org.pjay.ocajp8;

import java.util.ArrayList;

public class App3 {

    public static void main(String[] args) {

        ArrayList al3 = new ArrayList();
        // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 4, Size: 1
        al3.add(9);
        al3.add(4,8);

        ArrayList al2 = new ArrayList();
        // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 3, Size: 0
        al2.add(3,9);
        al2.add(1,8);


        ArrayList al = new ArrayList();
        // Runtime Exception -- Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
        al.add(1,1);
        al.add(1,1);
        System.out.println(al.size());
    }

}
