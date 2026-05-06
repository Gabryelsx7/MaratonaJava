package academy.dev.dojo.maratonajava.javacore.Rdates.test;

import java.time.LocalTime;

public class LocalTimetes01 {
    static void main(String[] args) {
        LocalTime localTime = LocalTime.of(23,32,21);
        LocalTime localNow = LocalTime.now();

        System.out.println(localTime);
        System.out.println(localNow);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
    }
}
