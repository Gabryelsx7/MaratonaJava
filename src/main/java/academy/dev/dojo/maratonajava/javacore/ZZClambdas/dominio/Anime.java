package academy.dev.dojo.maratonajava.javacore.ZZClambdas.dominio;

public class Anime {
    private final String titulo;
    private final int episodios;

    public Anime(String titulo, int episodios) {
        this.titulo = titulo;
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "titulo='" + titulo + '\'' +
                ", episodios=" + episodios +
                '}';
    }
}
