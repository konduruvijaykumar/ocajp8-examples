package org.pjay.ocajp8;

import java.util.Arrays;

public class App12 {

    public static void main(String[] args) {
        int[] ids, types;
        int ids1[], types1;
        ids = new int[]{1,2,3};
        types = new int[]{2, 3, 4};
        ids1 = new int[]{3,4,5};
        // Note: Compiler error -- Incompatible types. Found: 'int[]', required: 'int'
        //types1 = new int[]{4,5,6};
        types1 = 7;
        System.out.println(Arrays.toString(ids));
        System.out.println(Arrays.toString(types));
        System.out.println(Arrays.toString(ids1));
        System.out.println(types1);

        int[][] vars1; // 2D array
        int vars2 [][]; // 2D array
        int[] vars3[]; // 2D array
        int[] vars4 [], space [][]; // a 2D AND a 3D array -- (spaces)
    }

}
