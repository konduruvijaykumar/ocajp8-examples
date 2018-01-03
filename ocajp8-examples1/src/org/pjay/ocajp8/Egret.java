package org.pjay.ocajp8;

public class Egret {

    private String color;

    public Egret(){
        this("white");
    }

    public  Egret(String color){
        //this.color = color;
        color = color;
    }

    public static void main(String[] args) {
        Egret egret = new Egret();
        System.out.println("Color: " + egret.color);
    }

}
