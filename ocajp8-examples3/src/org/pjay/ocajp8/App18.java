package org.pjay.ocajp8;

import java.util.Arrays;

public class App18 {

    public static void main(String[] args) {
        int[] random = { 6, -4, 12, 0, -10 };
        int x = 12;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);
    }

}
