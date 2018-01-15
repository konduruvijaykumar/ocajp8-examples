package org.pjay.ocajp8;

public class App1 {

    // If two static blocks available, then the order they appear in class takes priority
    static{
        //int myArray[] = new int[3];
        int myArray[] = {1,2,3};
        //int value = myArray[3];
        int value = myArray[-1];
    }

    static{
        // java.lang.ExceptionInInitializerError Caused by: java.lang.ArrayIndexOutOfBoundsException: -1
        int abc[] = new int[-1];
    }

    public static void main(String[] args) {
        // Note: Error object is thrown
        // java.lang.ExceptionInInitializerError Caused by: java.lang.ArrayIndexOutOfBoundsException: -1
        System.out.println("In Main..");
    }

}
