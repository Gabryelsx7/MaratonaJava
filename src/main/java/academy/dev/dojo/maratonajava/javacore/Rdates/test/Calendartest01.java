package academy.dev.dojo.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class Calendartest01 {
    static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = new Date();
        if (c.getFirstDayOfWeek() == Calendar.SATURDAY) {
            System.out.println("Domingo é primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        c.add(Calendar.DAY_OF_YEAR, 2);
    }
}