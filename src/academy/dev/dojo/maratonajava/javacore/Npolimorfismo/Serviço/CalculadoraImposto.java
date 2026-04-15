package academy.dev.dojo.maratonajava.javacore.Npolimorfismo.Serviço;

import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto " +produto.getNome());
        System.out.println("Preço " +produto.getValor());
        System.out.println("Imposto a ser pago " +imposto);

        if ( produto instanceof  Tomate){
        String dataValidade = ((Tomate) produto).getDataValidade();
        System.out.println("Data de validade " +dataValidade);
    }
  }
}