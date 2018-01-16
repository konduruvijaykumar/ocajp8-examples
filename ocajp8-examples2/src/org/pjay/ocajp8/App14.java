package org.pjay.ocajp8;

public class App14 {

    public static void main(String[] args) {
        short s = 10;
        s += 10;
        s++;
        // Note: expression with no variables involved will automatically resolve casting, when variables are involved int is default output of expressions. Hence need casting
        // Compiler Error: Incompatible types. Found: 'int', required: 'short'
        //s = s+1;
        // Works fine
        //s = 20+1;
        s = (short)(s+1);
        System.out.println("s "+s);
    }

}
