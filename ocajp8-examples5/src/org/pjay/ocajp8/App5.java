package org.pjay.ocajp8;

public class App5 {

    public static void main(String[] args) {
        House myHouse = new MyHouse();
        System.out.println(myHouse.getAddress());
    }

}

interface House{
    default String getAddress(){
        return "101 Main Street";
    }
}

interface Bugalow extends House{
    @Override
    default String getAddress() {
        return "101 Sub Street";
    }
}

class MyHouse implements Bugalow, House{

}
