package org.pjay.ocajp8;

public class App4 {

    public static void main(String[] args) {
        // Below code will have compiler errors
        //int x = 1.0;
        //short y = 1921222;
        //int z = 9f;
        //long t = 192301398193810323;

        int x = (int)5.78;//(int)1.0 -- results in one when printed
        short y = (short) 1921222;
        int z = (int)9f;
        long t = 192301398193810323L;
        int orgVal_y = 1921222;

        System.out.println("x " + x);
        System.out.println("y " + y);
        System.out.println("z " + z);
        System.out.println("t " + t);
        System.out.println("orgVal_y " + orgVal_y);
    }

}
