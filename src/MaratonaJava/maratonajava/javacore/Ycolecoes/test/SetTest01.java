package MaratonaJava.maratonajava.javacore.Ycolecoes.test;

import MaratonaJava.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Pokemon", 19.9, 0));
        mangas.add(new Manga(1L, "Dragon Ball ", 9.5, 5));
        mangas.add(new Manga(2L, "Dragon Ball ", 9.5, 5));
        mangas.add(new Manga(4L, "DR Stone", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20, 2));
        mangas.add(new Manga(2L, "Bersek", 2.99, 0));

        for ( Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
