package org.pjay.ocajp8;

public class App11 {

    public static void main(String[] args) {
        // Block 1
        {
            int y = 1;
            int z =1;
            int x = y <10?y++:z++;
            System.out.println("y " + y + " z " + z + " x " + x);
        }
        // Block 2
        {
            int y = 1;
            int z = 1;
            final int x = y >= 10?y++:z++;
            System.out.println("y " + y + " z " + z + " x " + x);
        }
    }

}
