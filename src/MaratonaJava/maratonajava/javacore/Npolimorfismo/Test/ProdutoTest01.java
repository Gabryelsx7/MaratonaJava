package MaratonaJava.maratonajava.javacore.Npolimorfismo.Test;

import MaratonaJava.maratonajava.javacore.Npolimorfismo.Serviço.CalculadoraImposto;
import MaratonaJava.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import MaratonaJava.maratonajava.javacore.Npolimorfismo.dominio.Televisão;
import MaratonaJava.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest01 {
    static void main(String[] args) {
        Computador computador = new Computador("Mac100", 11000);
        Tomate tomate = new Tomate("Vermelo", 10);
        Televisão televisão = new Televisão("TMJ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------");
        CalculadoraImposto.calcularImposto(televisão);

    }
}
