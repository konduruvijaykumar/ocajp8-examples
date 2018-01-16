package org.pjay.ocajp8;

public class App2 {

    public static void main(String[] args) {
        int i = 2;
        long j = 4;
        // Compiler error -- Incompatible types. Found: 'long', required: 'int'
        //int[] arr = new int[j];
        int[] arr = new int[(int)j];
        char array[] = new char[i];
        array[0] = 65;// 65 unicode value in char is A
        array[1] = 66;// 66 unicode value in char is B and so on as we increment
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
        //array[2] = 67;

        //System.out.println("array[2] >>> " + array[2]);
        System.out.println("array[1] >>> " + array[1]);

        short[] ar = new short[3];
        int k = 5;
        ar[0] = 9;
        // Incompatible types. Found: 'int', required: 'short'
        //ar[1] = k+4;
        ar[1] = (short)(k+4);
        ar[2] = 8+9;
    }

}
