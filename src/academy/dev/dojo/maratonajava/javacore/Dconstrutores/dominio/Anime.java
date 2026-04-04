package academy.dev.dojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String name;
    private String tipo;
    private int episodio;
    private String genero;
    private String estudio;

    public Anime(String name, String tipo, int episodio, String genero,String estudio){
        this();
        this.name = name;
        this.tipo = tipo;
        this.episodio = episodio;
        this.genero = genero;
        this.estudio = estudio;

    }
    public Anime(){
        System.out.println("Dentro do Construtor");

    }

        public void imprimir(){
        System.out.println(this.name);
        System.out.println(this.tipo);
        System.out.println(this.episodio);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public int getEpisodio() {
        return this.episodio;
    }
}