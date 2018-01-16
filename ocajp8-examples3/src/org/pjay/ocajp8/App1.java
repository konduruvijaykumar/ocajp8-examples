package org.pjay.ocajp8;

import java.util.Arrays;

public class App1 {

    public static void main(String[] args) {
        // Important: https://www.youtube.com/watch?v=f5OD9CKrZEw
        // All decelerations are not giving compiler errors. Better practice and readability is always use beside type int[]
        //int[] arr1 = new int[4];
        //int [] arr1 = new int[4];
        //int arr1 [] = new int[4];
        //int arr1[] = new int[4];
        //int []arr1 = new int[4];

        // Gives compiler error
        //int[] arr1 = new int[4]{1,2,3,4};
        int []arr1 = new int[]{1,2,3,4};

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1["+i+"] >>> " + arr1[i]);
        }

        //String[] strArr = new String[3];

        // All decelerations are not giving compiler errors. Better practice and readability is always use beside type String[][]
        //String[][] strArr = new String[3][2];
        //String [][] strArr = new String[3][2];
        //String [] [] strArr = new String[3][2];
        //String[] [] strArr = new String[3][2];
        //String strArr[][] = new String[3][2];
        //String strArr [][] = new String[3][2];
        //String strArr [] [] = new String[3][2];
        //String strArr[] [] = new String[3][2];
        //String [][]strArr  = new String[3][2];
        //String [][] strArr  = new String[3][2];
        //String [] [] strArr  = new String[3][2];
        //String [] []strArr  = new String[3][2];
        //String []strArr[]  = new String[3][2];
        //String [] strArr []  = new String[3][2];
        //String[][] strArr  = new String[][]{{"Mr. ", "Mrs. ", "Ms. "}, {"Smith", "Jones"}};
        String[][] strArr  = {{"Mr. ", "Mrs. ", "Ms. "}, {"Smith", "Jones"}};

        for (String[] rowArr:strArr){
            System.out.println(Arrays.toString(rowArr));
            for (String colArr:rowArr){
                System.out.println("colArr " + colArr);
            }
        }

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                System.out.println("strArr["+i+"]["+j+"] >>> " + strArr[i][j]);
            }
        }


        // All probabilities tried above examples are valid and will extra possibilities mentioned below. Best practice always beside variable type
        //int[][][] arr3D = new int[3][2][1];
        //int []arr3D[][] = new int[3][2][1];
        //int [][]arr3D[] = new int[3][2][1];
        //int [] [] arr3D [] = new int[3][2][1];
        //int [] []arr3D[] = new int[3][][];
        int [] []arr3D[] = new int[][][]{{{1,2},{3,4}},
                                         {{5,6},{7,8}},
                                         {{9,10},{11,12}}};

        for (int i = 0; i < arr3D.length; i++) {
            //System.out.println(Arrays.toString(arr3D[i])); //It fives reference type objects
            for (int j = 0; j < arr3D[i].length; j++) {
                for (int k = 0; k < arr3D[i][j].length; k++) {
                    System.out.println("arr3D["+i+"]["+j+"]["+k+"] >>> " + arr3D[i][j][k]);
                }
            }
        }

    }

}
