package academy.dev.dojo.maratonajava.javacore.Csobrecargademetodos.test;

import academy.dev.dojo.maratonajava.javacore.Csobrecargademetodos.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto","Tv",12);
        anime.init2("Naruto","Tv",12,"Ninja");
       // anime.setName("Naruto");
       // anime.setTipo("Tv");
      //  anime.setEpisodio(12);
        //1anime.setGenero("Ninja");

        anime.imprimir();
    }
}
