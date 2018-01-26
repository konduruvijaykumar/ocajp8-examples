package org.pjay.ocajp8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class App17 {

    public static void main(String[] args) {
        System.out.println("LocalDate.now() >>> " + LocalDate.now());
        System.out.println("LocalTime.now() >>> " + LocalTime.now());
        System.out.println("LocalDateTime.now() >>> " + LocalDateTime.now());

        // Compiler error -- 'LocalDate(int, int, int)' has private access in 'java.time.LocalDate'
        //LocalDate localDate = new LocalDate(2018,1,26);

        LocalDate date1 = LocalDate.of(2018,1,26);
        LocalDate date2 = LocalDate.of(2018, Month.JANUARY,26);

        // 'LocalTime(int, int, int, int)' has private access in 'java.time.LocalTime'
        LocalTime time1 = LocalTime.of(4,30);
        LocalTime time2 = LocalTime.of(4,30,58);
        LocalTime time3 = LocalTime.of(4,30,47,350);
        //System.out.println(time3);

        // 'LocalDateTime(java.time.LocalDate, java.time.LocalTime)' has private access in 'java.time.LocalDateTime'
        LocalDateTime dateTime1 = LocalDateTime.of(2018,Month.JANUARY,26,4,45,38,560);
        LocalDateTime dateTime2 = LocalDateTime.of(date1,time1);

        // Exception in thread "main" java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 32
        //System.out.println(LocalDate.of(2018, Month.JANUARY, 32));

        System.out.println(LocalDate.of(2016, Month.FEBRUARY, 29));
        // Exception in thread "main" java.time.DateTimeException: Invalid date 'February 29' as '2018' is not a leap year
        System.out.println(LocalDate.of(2018, 2, 29));
    }

}
