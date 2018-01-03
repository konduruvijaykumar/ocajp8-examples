package org.pjay.ocajp8;

public class FeedingSchedule {

    public static void main(String[] args) {
        int x=5, j=0;
        OUTTER: for(int i=0;i<3;)
            INNER: do{
                x++; i++;
                if(x > 10) break INNER;
                x+=4;
                j++;
            } while (j<=2);
        System.out.println("x value is "+x);
    }

}
