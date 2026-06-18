package MaratonaJava.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimetest01 {
    static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalTime time = LocalTime.parse("24:45:00");
        LocalDate date= LocalDate.parse("2022-08-06");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
    }
}
