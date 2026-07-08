package MaratonaJava.maratonajava.javacore.ZZClambdas.test;

import MaratonaJava.maratonajava.javacore.Gassociacao.teste.AssociacaoTest;
import MaratonaJava.maratonajava.javacore.ZZClambdas.dominio.Anime;
import MaratonaJava.maratonajava.javacore.ZZClambdas.service.AnimeCompartor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    static void main(String[] args) {
        Supplier<AssociacaoTest> newAnimeCompartor = () -> {
            AnimeCompartor animeCompartor = new AnimeCompartor();
            return (AssociacaoTest) animeCompartor;
        };
        AnimeCompartor animeCompartor = newAnimeCompartor.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43),
                new Anime("One piece", 900),
                new Anime("Naruto", 500)));

        animeList.sort(animeCompartor ::compareByEpisodioNonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction= (title,epsodios) -> new Anime(title,epsodios);
        BiFunction<String, Integer, Anime> animeBiFunction2= Anime::new;
        System.out.println(animeBiFunction2.apply("Super Campeos", 36));

    }
}
