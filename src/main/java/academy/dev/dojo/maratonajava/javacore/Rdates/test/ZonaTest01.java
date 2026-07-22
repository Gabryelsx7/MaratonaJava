package academy.dev.dojo.maratonajava.javacore.Rdates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;


//- ZoneDatedTime - Classe para manipular fusos horários com as classes de tempo que estudamos, como Instant e LocalDate;
//- ZoneId - Classe que nos retorna lista de Map dos Zone IDs e suas siglas;
//- ZoneOffset - Guardar o deslocamento UTC (UTC offset);
//- OffSetDateTime - Classe que utilizamos o UTC offset para nos retornar o horário equivalente no fuso horário de referência;
//- JapaneseDate - Converter calendário gregoriano para japonês;


public class ZonaTest01 {
    static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime1);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        JapaneseDate meiji = JapaneseDate.from(japaneseDate);
        System.out.println(meiji);
    }
}
