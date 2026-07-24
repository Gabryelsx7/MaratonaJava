package academy.dev.dojo.maratonajava.javacore.ZZIjdbc.service;

import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProduceServiceRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name) {
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }

    public static void updateNameJdbcRowSet(Producer producer) {
        ProducerRepositoryRowSet.updateNameJdbcRowSet(producer);
    }

    public static void updateCacheRowSet(Producer producer) {
        ProducerRepositoryRowSet.updateCacheRowSet(producer);
    }
}