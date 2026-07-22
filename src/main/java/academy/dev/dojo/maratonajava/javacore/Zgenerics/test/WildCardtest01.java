package academy.dev.dojo.maratonajava.javacore.Zgenerics.test;


abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultado Doguinho");
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultado gatinho");
    }
}

public class WildCardtest01 {
    static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        printConsulta(gatos);
        printConsulta(cachorros);
        Animal[] animal = {new Gato(), new Cachorro()};
        printConsulta(animal);
    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }

    }
}
