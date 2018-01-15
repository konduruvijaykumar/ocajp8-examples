package org.pjay.ocajp8;

public class DoSomething {

    public static void main(String[] args) {
/*        try{
            System.out.println();
        }catch (StackOverflowError e){

        }catch (RuntimeException e){

        }*/
        new DoSomething().go();
    }

    private void go() {
        System.out.print("A");
        try{
            stop();
        }catch (ArithmeticException ae){
            System.out.print("B");
        }finally {
            System.out.print("C");
        }
        System.out.print("D");
    }

    private void stop() {
        System.out.print("E");
        Object obj = null;
        obj.toString();
        System.out.print("F");
    }

}
