package org.pjay.ocajp8;

public class App23 {

    public static void main(String[] args) {
        int x = 20;
        while(x>0) {
            do {
                x -= 2;
            } while (x>5);
            x--;
            System.out.print(x+"\t");
        }

        System.out.println("");
        System.out.println("=====================================");

        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        OUTER_LOOP: for(int[] row:myComplexArray){
            INNER_LOOP: for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]+"\t");
            }
            System.out.println();
        }
    }

}
