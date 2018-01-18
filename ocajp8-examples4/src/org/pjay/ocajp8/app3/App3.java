package org.pjay.ocajp8.app3;

import org.pjay.ocajp8.App2;

public class App3 extends App2 {

    public static void main(String[] args) {
        App3 app3 = new App3();
        app3.print(5);
    }

    public  void print(int y){
        System.out.println("y " + y);
        App2 app2 = new App2();
        // Compiler Error: 'x' has protected access in 'org.pjay.ocajp8.App2'
        //System.out.println(app2.x);
        // This is a inherited property so can be accessed directly
        System.out.println("x " + x);
    }

}
