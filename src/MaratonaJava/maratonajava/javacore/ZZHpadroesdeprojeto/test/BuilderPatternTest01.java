package MaratonaJava.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import MaratonaJava.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Willian")
                .lastName("Suane")
                .username("DevDojo")
                .email("WillianSuane@gmail.com")
                .build();
        System.out.println(build);
    }
}
