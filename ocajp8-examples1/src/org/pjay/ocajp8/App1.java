package org.pjay.ocajp8;

public class App1 {

    public static void main(String[] args) {

        System.out.println("Pre increment with While");
        int i = 0;
        while(++i < 5){
            i+=1;
        }
        String msg = i>5?"Greater Than":"Less Than";
        System.out.println(msg+", "+i);

        System.out.println("Post increment with While");
        int j = 0;
        while(j++ < 5){
            j+=1;
        }
        String msg1 = j>5?"Greater Than":"Less Than";
        System.out.println(msg1+", "+j);

        System.out.println("Pre increment with For Loop");
        int k;
        for(k=0;k<5;++k){
            k+=1;
        }
        String msg2 = k>5?"Greater Than":"Less Than";
        System.out.println(msg2+", "+k);

        System.out.println("Post increment with For Loop");
        int l= 0;
        for(l=0;l<5;l++){
            l+=1;
        }
        String msg3 = l>5?"Greater Than":"Less Than";
        System.out.println(msg3+", "+l);
    }

}
