package org.pjay.ocajp8;

import java.util.ArrayList;
import java.util.Arrays;

public class App15 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objects = list.toArray();
        System.out.println("objects >>> " + Arrays.toString(objects));
        // To not to created array objects just mention array of type any size in toArray().
        // It can have the same size of list or zero or larger than list size. Then an array is created with size of the list(if size of array given is less) or more if given
        String[] strings = list.toArray(new String[0]);
        System.out.println("strings >>> " + Arrays.toString(strings));
        String[] strings1 = list.toArray(new String[2]);
        System.out.println("strings1 >>> " + Arrays.toString(strings1));
        String[] strings2 = list.toArray(new String[5]);
        System.out.println("strings2 >>> " + Arrays.toString(strings2));
    }

}
