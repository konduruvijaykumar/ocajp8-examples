package org.pjay.ocajp8.app3;

import org.pjay.ocajp8.App2;

public class App3 extends App2 {

    public static void main(String[] args) {
        App3 app3 = new App3();
        app3.print(5);
    }

    public  void print(int y){
        // https://stackoverflow.com/questions/20404977/accessing-a-protected-variable-from-a-subclass-outside-package
        // https://stackoverflow.com/questions/22139513/protected-variables-can-be-accessed-within-child-class-or-child-object
        System.out.println("y " + y);
        App2 app2 = new App2();
        App3 app3 = new App3();
        // Compiler Error: 'x' has protected access in 'org.pjay.ocajp8.App2'
        //System.out.println(app2.x);
        // This is a inherited property so can be accessed directly
        System.out.println("x " + x);
        System.out.println("x " + app3.x);
        System.out.println("x " + this.x);
        System.out.println("x " + super.x);
        //System.out.println(app2.x);//Not allowed
    }

}
