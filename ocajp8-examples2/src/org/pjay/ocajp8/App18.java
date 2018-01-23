package org.pjay.ocajp8;

public class App18 {

    public static void main(String[] args) {
        System.out.println("================================================");
        int dayOfWeek = 5;
        switch (dayOfWeek){
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
        System.out.println("================================================");
        //dayOfWeek = 0;
        switch (dayOfWeek){
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }
        System.out.println("================================================");
        dayOfWeek = 0;
        switch (dayOfWeek){
            default:
                System.out.println("Weekday");
            case 0:
                System.out.println("Sunday");
            case 6:
                System.out.println("Saturday");
                break;
        }
        System.out.println("================================================");
        switch (dayOfWeek){
            default:
                System.out.println("Weekday");
            case 0:
                System.out.println("Sunday");
            case 6:
                System.out.println("Saturday");
        }
        System.out.println("================================================");
        switch (dayOfWeek){
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }

}
