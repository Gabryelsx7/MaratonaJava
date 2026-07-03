package MaratonaJava.maratonajava.javacore.Ycolecoes.test;

import MaratonaJava.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import MaratonaJava.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    static void main(String[] args) {
    Consumidor c1 = new Consumidor("Willian");
    Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoCompartor().reversed());
        mangas.add(new Manga(5L, "Pokemon", 19.9, 0));
        mangas.add(new Manga(1L, "Dragon Ball ", 9.5, 5));
        mangas.add(new Manga(2L, "Dragon Ball ", 9.5, 5));
        mangas.add(new Manga(4L, "DR Stone", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20, 2));
        mangas.add(new Manga(2L, "Bersek", 2.99, 0));
        mangas.add(new Manga(10L, "Aaragon", 2.99, 0));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
