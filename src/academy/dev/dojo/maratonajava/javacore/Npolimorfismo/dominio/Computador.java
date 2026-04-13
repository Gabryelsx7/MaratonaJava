package academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto{
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto do Computador    ");
        return this.valor * ;
    }
}
