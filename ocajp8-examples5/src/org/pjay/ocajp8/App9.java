package org.pjay.ocajp8;

public class App9 {

    public static void main(String[] args) {
        System.out.println("App9 Main... ");
        Move.print();
    }

    interface Move{
        public static void main(String[] args) {
            System.out.println("interface Move Main... ");
            print();
        }

        public static void print(){
            System.out.println("Printing....");
        }
    }

}
