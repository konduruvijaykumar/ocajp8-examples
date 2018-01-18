package org.pjay.ocajp8;

public class App6 extends App61{ // Compiler error -- There is no default constructor available in 'org.pjay.ocajp8.App61'

    public int i = 2;

    // Compiler Error: There is no default constructor available in 'org.pjay.ocajp8.App61'
    // Hence need to explicitly call super constructor on first line of our constructor
    public App6(){
        // Compiler error -- Cannot reference 'App6.i' before supertype constructor has been called
        //super(i);
        super(0);
    }

    public static void main(String[] args) {
        Double aDouble = new Double(0);
        // Compiler error -- Inconvertible types; cannot cast 'java.lang.Double' to 'java.lang.Float'
        //Float aFloat = (Float) aDouble;
        //System.out.println(aFloat);
        //System.out.println(new App6().i);// Prints i as 2
        new App6().print();
    }

    private void print() {
        System.out.println("this.i " + this.i);
        System.out.println("super.i " + super.i);
        System.out.println("i " + i);
    }

}
