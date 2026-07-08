package MaratonaJava.maratonajava.javacore.ZZClambdas.test;

import MaratonaJava.maratonajava.javacore.ZZClambdas.dominio.Anime;
import MaratonaJava.maratonajava.javacore.ZZClambdas.service.AnimeCompartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest02 {
    static void main(String[] args) {
        AnimeCompartor animeCompartor = new AnimeCompartor();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43),
                new Anime("One piece", 900),
                new Anime("Naruto", 500)));
        animeList.sort(animeCompartor::compareByEpisodioNonStatic);
        System.out.println(animeList);
    }
}
