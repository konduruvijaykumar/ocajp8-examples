package org.pjay.ocajp8;

public class App12 {

    static int x = 4;
    int z = 8;

    public static void main(String[] args) {

        for (int x = 5;x<10;x++)
            x++;
        System.out.println(x--);
        //System.out.println(z--);// Compiler error -- Non-static field 'z' cannot be referenced from a static context

        /*int i = 0;
        do{
            int j = i++;
            System.out.println("j" + j);
        }while(j<5);*/
        // Compiler error -- Cannot resolve symbol 'j'

    }

}
