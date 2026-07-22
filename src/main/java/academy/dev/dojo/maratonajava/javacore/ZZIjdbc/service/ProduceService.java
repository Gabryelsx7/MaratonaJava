package academy.dev.dojo.maratonajava.javacore.ZZIjdbc.service;

import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class ProduceService {
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(Integer id) throws IllegalAccessException {
        requereValidId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) throws IllegalAccessException {
        requereValidId(producer.getId());
        ProducerRepository.upadate(producer);
    }

    private static void requereValidId(Integer id) throws IllegalAccessException {
        if (id == null || id <= 0) {
            throw new IllegalAccessException("Invalid value for id");
        }
    }

    public static List<Producer> findAll()  {
        return ProducerRepository.findAll();

    }
}