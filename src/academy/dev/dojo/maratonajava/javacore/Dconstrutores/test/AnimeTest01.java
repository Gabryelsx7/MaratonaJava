package academy.dev.dojo.maratonajava.javacore.Dconstrutores.test;


import academy.dev.dojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime("DBZ","Tv",12,"Ação","Tommi");

        anime.imprimir();

        // anime.init("Naruto","Tv",12);
        // anime.init2("Naruto","Tv",12,"Ninja");
        // anime.setName("Naruto");
        // anime.setTipo("Tv");
        //  anime.setEpisodio(12);
        //1anime.setGenero("Ninja");
    }
}
