package org.pjay.ocajp8;

public class App20 {

    public static void main(String[] args) {
/*        for (int i = 0;i<10;i++){
            System.out.println("i " + i);
        }*/

        for (int i = initBlock();i<10;i = updateBlock(i)){
            System.out.println("i " + i);
        }

    }

    private static int initBlock(){
        System.out.println("Init Block");
        return 0;
    }

    private static int updateBlock(int i){
        System.out.println("Update Block");
        //return i++;// Will not work properly continues with 0 in the loop, because of post increment
        return i+1;
    }
}
