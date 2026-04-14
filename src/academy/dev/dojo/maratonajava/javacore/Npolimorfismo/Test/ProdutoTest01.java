package academy.dev.dojo.maratonajava.javacore.Npolimorfismo.Test;

import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.Serviço.CaluadoraImposto;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest01 {
    static void main(String[] args) {
        Computador computador = new Computador("Mac100", 11000);
        Tomate tomate = new Tomate("Vermelo", 10);
        CaluadoraImposto.calcularImpostoComputador(computador);
        System.out.println("------------------");
        CaluadoraImposto.calcularImpostoTomate(tomate);


    }
}
