package org.pjay.ocajp8;

public class App2 {

    static Integer i;

    public static void main(String[] args) {
        try {
            System.out.println(i.doubleValue());
        } catch (RuntimeException e){// IMP -- // catch (NullPointerException | RuntimeException e)
            // Compiler error -- Types in multi-catch must be disjoint: 'java.lang.NullPointerException' is a subclass of 'java.lang.RuntimeException'
            System.out.println(e.getClass().getSimpleName());
        }
    }

}
