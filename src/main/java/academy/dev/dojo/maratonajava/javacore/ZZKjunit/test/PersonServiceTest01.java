package academy.dev.dojo.maratonajava.javacore.ZZKjunit.test;

import academy.dev.dojo.maratonajava.javacore.ZZKjunit.dominio.Person;
import service.PersonService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PersonServiceTest01 {
    private static final Logger log = LogManager.getLogger(PersonServiceTest01.class);

    static void main() {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        log.info("Is adult '{}' ", personService.isAdult(person));
    }
}
