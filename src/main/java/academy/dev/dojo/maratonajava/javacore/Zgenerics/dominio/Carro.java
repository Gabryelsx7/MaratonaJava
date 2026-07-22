package academy.dev.dojo.maratonajava.javacore.Zgenerics.dominio;

public class Carro {
    private final String nome;

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
