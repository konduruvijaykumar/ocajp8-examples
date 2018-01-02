package org.pjay.ocajp8;

interface HasTail{
    int getTailLength();
}

abstract class Puma implements HasTail{
    //protected int getTailLength(){return 4;}//Compile Error:: attempting to assign weaker access privileges; was public
}

public class Cougar extends Puma{
    public static void main(String[] args) {
        //Puma puma = new Puma();//Compile Error:: Puma is abstract, cannot be instantiated
        //System.out.println(puma.getTailLength());
    }

    public int getTailLength(){return 2;}
}
