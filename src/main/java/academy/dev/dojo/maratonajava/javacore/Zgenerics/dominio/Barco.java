package academy.dev.dojo.maratonajava.javacore.Zgenerics.dominio;

public class Barco {
    private final String nome;

    public Barco(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
