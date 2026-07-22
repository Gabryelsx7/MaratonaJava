package academy.dev.dojo.maratonajava.javacore.ZZIjdbc.test;

import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.service.ProduceService;
import lombok.extern.log4j.Log4j2;

import java.sql.SQLException;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) throws SQLException, IllegalAccessException {
        //  Producer producer = Producer.builder().name("Studio Deen").build();
        //List<Producer> producers = ProduceService.findAll();
        //log.info("Producers found: '{}'", producers);

        // List<Producer> findbyname = ProduceService.findByAll("Mad");
        // log.info("Producers found: '{}'", findbyname);

        //ProduceService.showProductMetadata();
        ProduceService.showTypeScroll();


    }
}
