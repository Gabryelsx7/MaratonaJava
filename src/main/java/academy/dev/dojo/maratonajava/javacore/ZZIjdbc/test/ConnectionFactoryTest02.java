package academy.dev.dojo.maratonajava.javacore.ZZIjdbc.test;

import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.service.ProduceServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.sql.SQLException;
import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) throws SQLException, IllegalAccessException {

        Producer producerUpdatae = Producer.builder().id(1).name("MADHOUSE").build();
        ProduceServiceRowSet.updateNameJdbcRowSet(producerUpdatae);
        log.info("------------------");

        List<Producer> nhk = ProduceServiceRowSet.findByNameJdbcRowSet("");
        log.info(nhk);

    }
}
