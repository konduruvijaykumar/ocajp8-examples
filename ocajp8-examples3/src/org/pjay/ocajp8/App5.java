package org.pjay.ocajp8;

import java.util.Arrays;

public class App5 {

    public static void main(String[] args) {
        // One block of code
        {
            int array[][] = new int[2][];
            array[0] = new int[3];
            array[1] = new int[2];
            System.out.println(array.length + array[1].length);
        }
        // Another block of code
        {
            int array[] = {2,5,9,5,0,3};
            Arrays.sort(array,2,6);
            System.out.println(array[2]+array[5]);
        }
    }

}
