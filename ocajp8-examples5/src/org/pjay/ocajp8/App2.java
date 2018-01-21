package org.pjay.ocajp8;

import java.util.ArrayList;

public class App2 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("a");al.add("b");
        // Compiler Error: Incompatible types. Found: 'java.lang.Object', required: 'java.lang.String'
        //String str = al.get(1);
        String str = (String) al.get(1);
        System.out.println("str " + str);
    }

}
