package MaratonaJava.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSorte01 {
    static void main(String[] args) {
        List<String> mangas =  new ArrayList<>();
        mangas.add("Pokemon");
        mangas.add("Dragon Ball z");
        mangas.add("DR Stone");
        mangas.add("Attack on Titan");
        mangas.add("Bersek");

        Collections.sort(mangas);

        for (String manga : mangas){
            System.out.println(manga);
        }
        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100D);
        dinheiros.add(98.10);
        dinheiros.add(28.40);
        dinheiros.add(21.80);

        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);
    }
}
