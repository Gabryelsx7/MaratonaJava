package academy.dev.dojo.maratonajava.javacore.Isobreescrita.dominio;

public class Anime extends Object{
    private String name;

    @Override
    public String toString(){
        return "Anime:" +this.name;
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
