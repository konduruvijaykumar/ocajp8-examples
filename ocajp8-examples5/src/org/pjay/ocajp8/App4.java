package org.pjay.ocajp8;

import java.util.ArrayList;

public class App4 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);list.add(0);
        list.remove(0);
        System.out.println("list.get(0) " + list.get(0));
        System.out.println("list " + list);

        ArrayList list1 = new ArrayList();
        list1.add(5);
        // Runtime Exception -- Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
        list1.set(1,8);
        System.out.println("list1 " + list1);
    }

}
