package academy.dev.dojo.maratonajava.javacore.ZZIjdbc.service;

import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProduceServiceRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name){
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }
}