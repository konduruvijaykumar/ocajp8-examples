package org.pjay.ocajp8;

public class Chick {

    // Will get compiler error as variable initialization and initializer blocks are run in top down, as written in code
    //{System.out.println(name);}
    private String name = "fluffy";

    public Chick(){
        name = "tweety";
        System.out.println("Inside Chick Constructor");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println("Chick name in Main:: " + chick.name);
    }

    {
        System.out.println("Inside Chick initializer block");
        System.out.println("Chick name in initializer block :: " + name);
    }

}
