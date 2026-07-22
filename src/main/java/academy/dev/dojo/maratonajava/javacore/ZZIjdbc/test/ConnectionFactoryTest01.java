package academy.dev.dojo.maratonajava.javacore.ZZIjdbc.test;

import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

import java.sql.SQLException;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) throws SQLException {
        Producer producer = Producer.ProducerBuilder.builder()
                .name("NHK").build();
        ProducerRepository.save(producer);
    }
}
