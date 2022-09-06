package Java_Date_TimeApi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDataExample {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.now();
        System.out.println(ld);
        System.out.println();
        LocalTime ld2= LocalTime.now();
        System.out.println(ld2);
        System.out.println();
        LocalDateTime ld3=LocalDateTime.now();
        String d= ld3.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(d);

        //Duration
        Duration due=Duration.ofDays(-3);
        LocalDate localDate=LocalDate.of(2016,1,1);
        System.out.println(localDate.minusDays(-3));
        System.out.println();

        //Leap year
        LocalDate localDateTime=LocalDate.ofYearDay(2016,366);
        System.out.println(localDateTime);
        System.out.println();

        //Local date
        LocalDate lc=LocalDate.now().of(2015,1,31);
        LocalDate l=lc.plusYears(2);
        System.out.println(l);
        System.out.println();

        LocalDateTime lct=LocalDateTime.of(LocalDate.of(2015,1,1),LocalTime.of(11,21));
        lct=lct.withDayOfMonth(12);
        System.out.println(lct.getMonth()+":"+lct.getDayOfMonth()+":"+lct.getHour());
    }
}
