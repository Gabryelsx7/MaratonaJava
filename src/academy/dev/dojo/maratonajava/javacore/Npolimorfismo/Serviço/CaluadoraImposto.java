package academy.dev.dojo.maratonajava.javacore.Npolimorfismo.Serviço;

import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CaluadoraImposto {
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatório de  do Computador");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do computador " + computador.getNome());
        System.out.println("Valor " + computador.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatório de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Imposto do Tomate " + tomate.getNome());
        System.out.println("Valor " + tomate.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }
}