package academy.dev.dojo.maratonajava.javacore.ZZClambdas.test;

import academy.dev.dojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.dev.dojo.maratonajava.javacore.ZZClambdas.service.AnimeCompartor;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {

    public static void main(String[] args) {

        AnimeCompartor animeCompartor = new AnimeCompartor();

        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 43),
                new Anime("One Piece", 900),
                new Anime("Naruto", 500)
        ));

        animeList.sort(animeCompartor::compareByEpisodioNonStatic);

        System.out.println(animeList);
    }
}