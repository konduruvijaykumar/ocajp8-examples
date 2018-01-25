package org.pjay.ocajp8;

import java.util.ArrayList;

public class App14 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //arrayList.add(null);
        // Runtime Exception - Exception in thread "main" java.lang.NullPointerException
        //int i = arrayList.get(0);

        arrayList.add(1);
        arrayList.add(2);
        arrayList.remove(1);
        System.out.println(arrayList);

        arrayList.add(2);
        System.out.println(arrayList);
        arrayList.remove(new Integer(1));
        System.out.println(arrayList);
    }

}
