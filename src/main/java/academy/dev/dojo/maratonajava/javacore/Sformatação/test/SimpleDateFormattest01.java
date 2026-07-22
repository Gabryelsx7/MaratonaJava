package academy.dev.dojo.maratonajava.javacore.Sformatação.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormattest01 {
    static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";

        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(sdf.format(new Date()));
    }
}
