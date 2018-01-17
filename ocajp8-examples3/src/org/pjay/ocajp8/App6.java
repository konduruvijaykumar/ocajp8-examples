package org.pjay.ocajp8;

import java.util.ArrayList;
import java.util.List;

public class App6 {


    public static void main(String[] args) {
        // Looks like valid declaration, because of diamond operator it can recognise variable name with no space in between. Same goes with arrays with [] declaration
        List<String>ints = new ArrayList<>();

        byte i =1, j=1;
        while(i==3 && j<5){
            System.out.println(i+" "+j+" ");
            i++;
            j += 2;
            // Compiler error: Type mismatch: cannot convert from int to byte.
            // But while above j += 2; numeric promotion is not applied in case of unary, assignment operatiors. Hence casting is taken care
            //j=j+2;
        }

        // Block of code
        {
            int y = 10;
            // Compiler Error: Unreachable code
/*			while (false) {
				y = 20;
				System.out.println("y " + y);
			}*/
        }

        {
            int y = 10;
/*			while(true){
				//break;
			}*/
            // Compiler Error: Unreachable code
            //System.out.println("y " + y);
        }

    }

}
