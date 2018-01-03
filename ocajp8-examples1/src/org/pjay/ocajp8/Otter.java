package org.pjay.ocajp8;

interface Animal{
    default String getName(){return "Animal";}
}

interface Mammal{
    default String getName(){return "Mammal";}
}

abstract public class Otter implements Animal, Mammal{

    // Compiler Error (if method not implemented and Otter is not abstract):: Otter inherits unrelated defaults for getName() from types Animal and Mammal
    // Fix is done by overriding
//    @Override
//    public String getName() {
//        return "Otter";
//    }

    // Can add a abstract method or concrete method to solve compiler issue
    public abstract String getName();

}
