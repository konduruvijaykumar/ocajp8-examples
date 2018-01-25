package org.pjay.ocajp8;

import java.util.Arrays;
import java.util.List;

public class App16 {

    public static void main(String[] args) {
        String[] array = { "hawk", "robin" };
        List<String> list = Arrays.asList(array);
        System.out.println(list.size());
        System.out.println("list >>> " + list);
        System.out.println("array >>> " + Arrays.toString(array));

        list.set(1, "test");
        System.out.println("list >>> " + list);
        System.out.println("array >>> " + Arrays.toString(array));

        array[0] = "new";
        System.out.println("list >>> " + list);
        System.out.println("array >>> " + Arrays.toString(array));

        // Throw runtime error -- Exception in thread "main" java.lang.UnsupportedOperationException
        list.remove(1);
        System.out.println("list >>> " + list);
        System.out.println("array >>> " + Arrays.toString(array));
    }

}
