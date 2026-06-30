package MaratonaJava.maratonajava.javacore.Ycolecoes.test;

import MaratonaJava.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        mangas.add(new Manga(5L, "Pokemon", 19.9));
        mangas.add(new Manga(1L, "Dragon Ball ", 9.5));
        mangas.add(new Manga(4L, "DR Stone", 3.2));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20));
        mangas.add(new Manga(2L, "Bersek", 2.99));


        //Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Manga mangaToSearch = new Manga(1L, "Dragon Ball ", 9.5);
        System.out.println(Collections.binarySearch(mangas,mangaToSearch, mangaByIdComparator));
    }
}
