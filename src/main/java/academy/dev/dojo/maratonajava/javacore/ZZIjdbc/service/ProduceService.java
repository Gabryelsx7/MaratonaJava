package academy.dev.dojo.maratonajava.javacore.ZZIjdbc.service;

import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

public class ProduceService {
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(int id) throws IllegalAccessException {
        if (id <= 0) {
            throw new IllegalAccessException("Invalid value for id");
        }
        ProducerRepository.delete(id);
    }
}
