package academy.dev.dojo.maratonajava.javacore.Ycolecoes.test;


import academy.dev.dojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.dev.dojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    static void main(String[] args) {
        Consumidor c1 = new Consumidor("WILLIAN");
        Consumidor c2 = new Consumidor("Gabryel");
        System.out.println(c1);

        Manga manga1 = new Manga(5L, "Pokemon", 19.9);
        Manga manga2 = new Manga(1L, "Dragon Ball ", 9.5);
        Manga manga3 = new Manga(4L, "DR Stone", 3.2);
        Manga manga4 = new Manga(3L, "Attack on Titan", 11.20);
        Manga manga6 = new Manga(2L, "Bersek", 2.99);

        List<Manga> mangaList = List.of(manga1, manga2, manga3);
        List<Manga> mangaList2 = List.of(manga3, manga4);
        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(c1, mangaList);
        consumidorManga.put(c2, mangaList2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }

        }


    }
}
