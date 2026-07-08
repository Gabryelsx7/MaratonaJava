package MaratonaJava.maratonajava.javacore.ZZClambdas.test;

import MaratonaJava.maratonajava.javacore.ZZClambdas.dominio.Anime;
import MaratonaJava.maratonajava.javacore.ZZClambdas.service.AnimeCompartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43),
                new Anime("One piece", 900),
                new Anime("Naruto", 500)));
      //  Collections.sort(animeList,(a1,a2) -> a1.getTitulo().compareTo(a2.getTitulo()));
        Collections.sort(animeList, AnimeCompartor::compareByTitulo);
        animeList.sort(AnimeCompartor::compareByTitulo);// CLASSE:: METODO

        System.out.println(animeList);
    }
}
