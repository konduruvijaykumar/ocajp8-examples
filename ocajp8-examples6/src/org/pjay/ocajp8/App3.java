package org.pjay.ocajp8;

public class App3 {

    public static void main(String[] args) {
        try {
            System.out.println(args[0]);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e){
            if(e instanceof ArrayIndexOutOfBoundsException){
                // ArrayIndexOutOfBoundsException is thrown, as main method args array will default to zero length. If no arguments passed while running.
                // Important: Exception variable caught in catch block is implicitly final and cannot be modified or assigned value
                // Compiler Error: Cannot assign a value to final variable 'e'
                //e = new ArrayIndexOutOfBoundsException("Out of bounds");
                System.out.println(((ArrayIndexOutOfBoundsException) e).getClass().getSimpleName());
            }else if(e instanceof NullPointerException){
                // Compiler Error: Cannot assign a value to final variable 'e'
                //e = new NullPointerException("Null Value");
                System.out.println(((NullPointerException) e).getClass().getSimpleName());
            }else{
                // Compiler Error: Cannot assign a value to final variable 'e'
                //e = new ArithmeticException("Arithmetic");
                e.getClass().getSimpleName();
            }
            System.out.println(e.getMessage());
        }
    }

}
