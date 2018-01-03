package org.pjay.ocajp8;

import java.util.ArrayList;
import java.util.List;

public class ChickenSong {

    public static void main(String[] args) {
        // Runtime error:: IndexOutOfBoundsException
        //HenHouse henHouse = new HenHouseImpl();
        //Chicken chicken = henHouse.getChickens().get(0);

        // Runtime error:: IndexOutOfBoundsException
        //HenHouse henHouse = new HenHouseImpl(0);

        // prints Cluck once
        //HenHouse henHouse = new HenHouseImpl(1);

        // prints Cluck 3 times
        HenHouse henHouse = new HenHouseImpl(3);
        Chicken chicken = henHouse.getChickens().get(0);
        for(int i=0;i<henHouse.getChickens().size();chicken = henHouse.getChickens().get(i++)){
            System.out.println("Cluck");
        }
    }

}

interface HenHouse{
    List<Chicken> getChickens();
}

class HenHouseImpl implements HenHouse{

    private List<Chicken> chiks;

//    public HenHouseImpl(){
//        chiks = new ArrayList<>();
//    }

    public HenHouseImpl(int min){
        chiks = new ArrayList<>();
        while(min>0){
            chiks.add(new Chicken());
            min--;
        }
    }

    @Override
    public List<Chicken> getChickens() {
        return chiks;
    }
}

class Chicken{}