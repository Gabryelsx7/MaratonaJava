package MaratonaJava.maratonajava.javacore.Zgenerics.test;

import MaratonaJava.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.List;

public class MetodosGenericosTest01 {
    static void main(String[] args) {
        List<Barco> barcos = criarArrayComUmObejto(new Barco("Canoa Marota"));

    }

    private static <T> List<T> criarArrayComUmObejto(T t) {
        return List.of();

    }
    //  private static <T extends Comparable> List<T> criarArrayComUmObejto(T t){
    //      return List.of();
    //
    //  }
}
