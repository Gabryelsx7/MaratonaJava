package academy.dev.dojo.maratonajava.javacore.Sformatação.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeHolanda = new Locale("nl", "IN");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Italia " + df1.format(calendar.getTime()));
        System.out.println("Holanda " + df2.format(calendar.getTime()));

        System.out.println(localeItaly.getCountry());
    }
}
