package academy.dev.dojo.maratonajava.javacore.Npolimorfismo.Test;

import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    static void main(String[] args) {
        Produto produto = new Computador("MAC9", 10000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("----------------");


        Produto produto2 = new Tomate("Vermelho ", 10);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("----------------");
    }
}
