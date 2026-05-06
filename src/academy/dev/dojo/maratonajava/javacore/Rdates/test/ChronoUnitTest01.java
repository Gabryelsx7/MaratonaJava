package academy.dev.dojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class ChronoUnitTest01 {
    static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2007, Month.AUGUST, 8 ,6 ,12,5);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println(ChronoUnit.MONTHS .between(aniversario, now));
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));
    }
}
