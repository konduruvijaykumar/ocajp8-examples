package org.pjay.ocajp8;

public class App3 {

    public static void main(String[] args) {
        int i = 2;
        int[][][] array = {{{1,2},{3,4}},
                           {{83,12,19},{26,51}},
                           {{0},{10}}};

        System.out.println(array[1][1][1]);

        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array[j].length; k++) {
                for (int l = 0; l < array[j][k].length; l++) {
                    System.out.println("array["+j+"]["+k+"]["+l+"] >>> " + array[j][k][l]);
                }
            }
        }
    }

}
