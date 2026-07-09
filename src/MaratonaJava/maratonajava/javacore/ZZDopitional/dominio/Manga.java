package MaratonaJava.maratonajava.javacore.ZZDopitional.dominio;

public class Manga {
    private Integer id;
    private String titulo;
    private int chapeter;

    public Manga(Integer id, String titulo, int chapeter) {
        this.id = id;
        this.titulo = titulo;
        this.chapeter = chapeter;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getChapeter() {
        return chapeter;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setChapeter(int chapeter) {
        this.chapeter = chapeter;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", chapeter=" + chapeter +
                '}';
    }
}
