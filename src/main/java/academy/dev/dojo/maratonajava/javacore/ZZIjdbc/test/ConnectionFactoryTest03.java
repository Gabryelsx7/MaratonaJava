package academy.dev.dojo.maratonajava.javacore.ZZIjdbc.test;

import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.service.ProduceService;
import lombok.extern.log4j.Log4j2;

import java.sql.SQLException;
import java.util.List;

@Log4j2
public class ConnectionFactoryTest03 {
    public static void main(String[] args) throws SQLException, IllegalAccessException {
      Producer producer1 = Producer.builder().name("Toei Animation").build();
      Producer producer2 = Producer.builder().name("White Fox").build();
      Producer producer3 = Producer.builder().name("Studio Ghibi").build();
      ProduceService.saveTranscation(List.of(producer1,producer2,producer3));

    }
}
