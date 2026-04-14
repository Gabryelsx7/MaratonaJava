package academy.dev.dojo.maratonajava.javacore.Npolimorfismo.Serviço;

import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto " +produto.getNome());
        System.out.println("Preço " +produto.getValor());
        System.out.println("Imposto a ser pago " +imposto);
    }
}