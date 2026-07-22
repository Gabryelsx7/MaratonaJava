package academy.dev.dojo.maratonajava.javacore.ZZIjdbc.test;

import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.service.ProduceService;

import java.sql.SQLException;
import java.util.Scanner;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) throws SQLException, IllegalAccessException {

       //Scanner sc = new Scanner(System.in);
       //int id = sc.nextInt();

        Producer producer = Producer.builder().name("Studio Deen").build();
       // ProduceService.save(producer);
        ProduceService.delete(7);
    }
}
