package org.pjay.ocajp8;

import java.util.ArrayList;
import java.util.List;

interface CanSwim{}

class Amphibian implements CanSwim{}

class Tadpole extends Amphibian{}

public class FindAllTadPole {

    public static void main(String[] args) {
        List<Tadpole> tadpoles = new ArrayList<>();
        tadpoles.add(new Tadpole());
        for (Amphibian amphibian:tadpoles){
            // Compiler error:: incompatible type, need explicit type case
            //Tadpole tadpole = amphibian;

            Tadpole tadpole = (Tadpole) amphibian;
            // Below work with any issue
            Amphibian tadpole1 = amphibian;
            CanSwim tadpole2 = amphibian;
            Object tadpole3 = amphibian;
        }
    }

}
