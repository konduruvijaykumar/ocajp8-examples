package org.pjay.ocajp8;

public class App4 {

    public static void main(String[] args) {
        int arr[][] = new int[2][];
        // Results in NullPointerException as size of major or row is only declared, error while executing the below line when assigning value
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        System.out.println("arr[1][1] >>> " + arr[1][1]);
    }

}
