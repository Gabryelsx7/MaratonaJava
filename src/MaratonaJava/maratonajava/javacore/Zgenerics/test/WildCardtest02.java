package MaratonaJava.maratonajava.javacore.Zgenerics.test;


import java.util.List;

public class WildCardtest02 {
    static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

    }
    private static void printConsulta(List<Animal>[] animals){
        for (Animal animal : (Animal[]) animals) {
            animal.consulta();
        }
        
    }
}
