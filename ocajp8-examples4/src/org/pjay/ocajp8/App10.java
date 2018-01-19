package org.pjay.ocajp8;

public class App10 {

    public static void main(String[] args) {
        A a = new A();
        // Exception in thread "main" java.lang.ClassCastException: org.pjay.ocajp8.A cannot be cast to org.pjay.ocajp8.C
        C c = (C)a;
        c.meth();
    }

}

interface IA{
    void meth();
}

class A implements IA{
    void A(String s){

    }

    public void meth(){
        System.out.println("A");
    }
}

class C extends A implements IA{
    public void meth(){
        System.out.println("C");
    }
}