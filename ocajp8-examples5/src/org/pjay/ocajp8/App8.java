package org.pjay.ocajp8;

public class App8 {

    // IMP: http://javaconceptoftheday.com/illegal-forward-reference-error-java/

    // Only works in static case
    int x = y;
    //static int y;// Also works
    static int y = 10;
    // Illegal forward reference
    //int j = i;
    //int i = 9;

    {
        // Illegal forward reference
        //System.out.println(k);
        // Interesting to know, There is different behaviour if int k and int k = 8;
        // TODO: Values will become 10 and 8 respectively. Investigate
        k = 10;
    }
    int k;//works fine
    //int k = 8;

    public static void main(String[] args) {
        System.out.print(new App8().x +" ");
        System.out.print(y +" ");
        System.out.print(new App8().k);
    }

    static{
        y = 15;
    }

}
