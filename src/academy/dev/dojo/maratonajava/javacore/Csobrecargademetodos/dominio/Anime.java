package academy.dev.dojo.maratonajava.javacore.Csobrecargademetodos.dominio;

public class Anime {
    private String name;
    private String tipo;
    private int episodio;
    private String genero;

    public void init(String name, String tipo, int episodio){
        this.name = name;
        this.tipo = tipo;
        this.episodio = episodio;

    }
    public void init2(String name, String tipo, int episodio, String genero){
        this.init(name,tipo,episodio);
        this.genero = genero;
        }
        public void imprimir(){
        System.out.println(this.name);
        System.out.println(this.tipo);
        System.out.println(this.episodio);
        System.out.println(this.genero);
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