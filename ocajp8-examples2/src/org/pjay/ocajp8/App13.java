package org.pjay.ocajp8;

public class App13 {

    static int x = 9;
    static int z = 9;

    public static void main(String[] a) {
        // Compiler error -- Variable 'a' is already defined in the scope
        //int[] a = {1,2,3};
        //System.out.println(a[3]);

        // Another example
        int x = 8;
        for (;x>-1;x--)
            System.out.print(x);

        // Another example
        // Compiler error - Cannot resolve symbol 'y' (As we have already terminated for loop with ; and moved variable out of scope. Indentation does not provide any guarantee that to be in scope of loop)
        for(int y =0;y>=-1;y--);
//            System.out.print(y);

        // Another example
        int z;
        // Compiler Error -- Variable 'z' might not have been initialized
        //System.out.println("z " + z);
    }

}
