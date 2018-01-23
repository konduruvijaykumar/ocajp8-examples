package org.pjay.ocajp8;

public class App22 {

    public static void main(String[] args) {
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        for (int i = 0; i < myComplexArray.length; i++) {
            for (int j = 0; j < myComplexArray[i].length; j++) {
                System.out.print(myComplexArray[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("==============");

        for (int[] rows:myComplexArray){
            for (int i = 0; i < rows.length; i++) {
                System.out.print(rows[i]+"\t");
            }
            System.out.println();
        }

        System.out.println("==============");

        for (int i = 0; i < myComplexArray.length; i++) {
            for(int col:myComplexArray[i]){
                System.out.print(col+"\t");
            }
            System.out.println();
        }
    }

}
