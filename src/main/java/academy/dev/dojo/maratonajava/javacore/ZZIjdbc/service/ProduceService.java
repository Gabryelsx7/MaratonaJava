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
        ProducerRepository.update(producer);
    }

    public static void updatePreparedStatemente(Producer producer) throws IllegalAccessException {
        requereValidId(producer.getId());
        ProducerRepository.updatePreparedStatemente(producer);
    }

    private static void requereValidId(Integer id) throws IllegalAccessException {
        if (id == null || id <= 0) {
            throw new IllegalAccessException("Invalid value for id");
        }
    }

    public static List<Producer> findAll()  {
        return ProducerRepository.findAll();

    }

    public static List<Producer> findByAll(String name)  {
        return ProducerRepository.findByName(name);
    }

    public static void  showProductMetadata()  {
         ProducerRepository.showProductMetadata();
    }

    public static void  showTypeScroll()  {
        ProducerRepository.showTypeScroll();
    }

    public static List<Producer> findByName(String name)  {
        return ProducerRepository.findByName(name);
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name)  {
        return ProducerRepository.findByNameAndUpdateToUpperCase(name);
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name)  {
        return ProducerRepository.findByNameAndInsertWhenNotFound(name);
    }

    public static void findByNameDelete(String name)  {
         ProducerRepository.findByNameDelete(name);
    }

    public static List<Producer> findByNamePrepadStatement(String name)  {
        return ProducerRepository.findByNamePrepadStatement(name);
    }

    public static List<Producer> findByNamecallableStatement(String name)  {
        return ProducerRepository.findByNamecallableStatement(name);
    }

}