package org.pjay.ocajp8;

public class App17 {

    public static void main(String[] args) {

        // Imp: https://stackoverflow.com/questions/16255270/final-variable-case-in-switch-statement/16255479
        final int x;
        x = 0;
        final int y = 2;

        int i = (int)(Math.random()*4);
        System.out.println("i " + i);
        switch (i){// Constant expression required
            case 0://case x:
                // case statement should have Constant at compile time and not at runtime
                {System.out.println("A");}
                break;
            case 1:
                System.out.println("B");
            case 4:System.out.println("D");break;
            case y:// This is a constant at compile time, hence no errors
                System.out.println("C");
        }

        // Another sample
        {
            final int a = 0;
            final int b = 2;
            int j = a;
            switch (j){
                // Compiler error for case a+1 (Duplicate label '1'), as we have case 1 already
                // Compiler error for case a+2 (Duplicate label '2'), as we have case 2 already
                case a-1:{System.out.println("A");}break;
                case 1:System.out.println("B");
                default:System.out.println("default");//break;
                case b:System.out.println("C");
            }
        }
    }

}
