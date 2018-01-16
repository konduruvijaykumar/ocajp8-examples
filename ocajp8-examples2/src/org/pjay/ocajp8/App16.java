package org.pjay.ocajp8;

public class App16 {

    public static void main(String[] args) {
        String s = "Vijay";
        int i = 2;

        // Compiler Error -- Incompatible types. Found: 'boolean', required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
/*        switch (i%2==0){

        }*/

        switch (s){
            default:
                System.out.println("Java");
            case "Vijay":
                System.out.println("OCAJP");
        }

        switch (s){
            case "Vijay":
                System.out.println("OCAJP");
            default:
                System.out.println("Oracle");
                // Compiler error -- Duplicate default label (only one default is allowed in switch, but can come at any one position)
/*            default:
                System.out.println("Sun");*/
        }

        switch (s){
            case "Vijay":
                System.out.println("OCAJP");
            case "Raj":
                System.out.println("SCJP");
            default:
                System.out.println("Oracle");
        }
    }

}
