package MaratonaJava.maratonajava.javacore.ZZClambdas.service;

import MaratonaJava.maratonajava.javacore.ZZClambdas.dominio.Anime;

public class AnimeCompartor {
    public static int compareByTitulo(Anime a1, Anime a2) {
        return a1.getTitulo().compareTo(a2.getTitulo());
    }

    public static int compareByEpisodio(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodios(), a2.getEpisodios());
    }
    public  int compareByEpisodioNonStatic(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodios(), a2.getEpisodios());
    }
}