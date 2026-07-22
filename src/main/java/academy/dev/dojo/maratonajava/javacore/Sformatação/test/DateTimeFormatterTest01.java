package academy.dev.dojo.maratonajava.javacore.Sformatação.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String s3 = date.format(DateTimeFormatter.BASIC_ISO_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate p1 = LocalDate.parse("20260511", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate p2 = LocalDate.parse("2026-05-11+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate p3 = LocalDate.parse("2026-05-11", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2026-05-11T11:22:13.5025394");
        System.out.println(parse4);

        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBr = LocalDate.now().format(formatterBr);
        System.out.println(formatBr);
        LocalDate parse = LocalDate.parse("11/05/2026", formatterBr);
        System.out.println(parse);

        DateTimeFormatter formatterGM = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMANY);
        String formatGM = LocalDate.now().format(formatterGM);
        System.out.println(formatGM);
        LocalDate parse1 = LocalDate.parse("11.Mai.2026", formatterGM);
        System.out.println(parse1);


    }
}
