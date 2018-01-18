package org.pjay.ocajp8;

public class App42 extends App41{

    // This method is not overriding so, no problem with downgrading access of protected with default
    final void method1(int i){
        System.out.println("int Version");
    }

    void method1(long i){
        System.out.println("long Version");
    }

    void method1(char i){
        System.out.println("char Version");
    }

}
