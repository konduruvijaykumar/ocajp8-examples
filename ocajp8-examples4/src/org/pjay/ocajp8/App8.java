package org.pjay.ocajp8;

public class App8 {

    public static void main(String[] args) {
        I i = new I() {};
        System.out.println(i.x + i.getValue() + " " + i);
    }

}

interface I{
    int x = 10;

    public default int getValue(){
        return 5;
    }

    // Compiler Error -- Default method 'toString' overrides a member of 'java.lang.Object'
    // This is not allowed, default methods in interfaces should not override any Object methods
/*    public default String toString(){
        return "I";
    }*/

}
