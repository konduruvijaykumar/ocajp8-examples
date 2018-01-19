package org.pjay.ocajp8;

public class App7 {

    static Animal animal = new Bird();
    static Animal animal1 = new Animal();

    public static void main(String[] args) {
        System.out.println(animal instanceof Fly);
        System.out.println(animal1 instanceof Fly);
    }

}

class Animal{
    // Some code
}

interface Fly{
    // Some code
}

class Bird extends Animal implements  Fly{
    // Some code
}