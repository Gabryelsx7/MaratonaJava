package academy.dev.dojo.maratonajava.javacore.ZZClambdas.test;

import academy.dev.dojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.dev.dojo.maratonajava.javacore.ZZClambdas.service.AnimeCompartor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {

    public static void main(String[] args) {

        Supplier<AnimeCompartor> newAnimeComparator = AnimeCompartor::new;

        AnimeCompartor animeCompartor = newAnimeComparator.get();

        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 43),
                new Anime("One Piece", 900),
                new Anime("Naruto", 500)
        ));

        animeList.sort(animeCompartor::compareByEpisodioNonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;

        System.out.println(animeBiFunction.apply("Super Campeões", 36));
    }
}