package org.pjay.ocajp8;

import java.io.File;

public class App9 {

    public static void main(String[] args) {
        // Automatic promotion to highest data type
        if(5 == 5.0){
            System.out.println("5 == 5.0");
        }

        // Compiler error
        // Equity operators cannot be mixed and matched with other types, examples below
        //boolean x = true == 3;
        //boolean y = false != "Rabbit";
        //boolean z = 5 == "Horse";

        boolean y = false;
        boolean x = y = true;
        System.out.println("x " + x);
        System.out.println("y " + y);
        x = y == false;
        System.out.println("x " + x);
        System.out.println("y " + y);

        File fileX = new File("Filename.txt");
        File fileY = new File("Filename.txt");
        File fileZ = fileX;
        System.out.println("fileX == fileY >>> " + (fileX == fileY));
        System.out.println("fileX == fileZ >>> " + (fileX == fileZ));

        int num = 1;
        int time = 12;
        // Note: Though indentation is adjusted for if block with no flower brace {}, It does not mean it is part of if block
        if(time < 11)
            System.out.println("Good Morning");
            num=num+3;//num++
        System.out.println("num " + num);

        int y1 = 10;
        final int x1;
        /*if(y1 > 8){
            x1 = 2*y1;
        }else{
            x1 = 3*y1;
        }*/
        x1 = (y1 > 8)?2*y1:3*y1;
        System.out.println("x1 " + x1);

    }

}
