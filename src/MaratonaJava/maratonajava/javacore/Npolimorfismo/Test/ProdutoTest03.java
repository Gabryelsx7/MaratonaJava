package MaratonaJava.maratonajava.javacore.Npolimorfismo.Test;

import MaratonaJava.maratonajava.javacore.Npolimorfismo.Serviço.CalculadoraImposto;
import MaratonaJava.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import MaratonaJava.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest03 {
    static void main(String[] args) {
        Computador computador = new Computador("MAC9", 10000);
        Tomate tomate= new Tomate("Vermelho ", 10);
        tomate.setDataValidade("11/12/2026");
        System.out.println(tomate);

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------");

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------");

    }
}
