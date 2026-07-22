package academy.dev.dojo.maratonajava.javacore.Ycolecoes.test;


import academy.dev.dojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.dev.dojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaCompartor implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoCompartor implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaCompartor());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        //Não aceita duplicata
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoCompartor());
        mangas.add(new Manga(5L, "Pokemon", 19.9, 0));
        mangas.add(new Manga(1L, "Dragon Ball ", 9.5, 5));
        mangas.add(new Manga(2L, "Dragon Ball ", 9.5, 5));
        mangas.add(new Manga(4L, "DR Stone", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20, 2));
        mangas.add(new Manga(2L, "Bersek", 2.99, 0));
        mangas.add(new Manga(10L, "Aaragon", 2.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Manga yuyuHakuso = new Manga(21L, "Yuyu Hakuso", 8, 0);

        //lower <
        //flor  <=
        //higher >
        //ceiling >=
        System.out.println("----------------------");// o Menor entre todos
        System.out.println(mangas.lower(yuyuHakuso));
        System.out.println("----------------------");// o Maior preço antes do 8
        System.out.println(mangas.floor(yuyuHakuso));
        System.out.println("----------------------");// o Maior entre todos
        System.out.println(mangas.higher(yuyuHakuso));
        System.out.println("----------------------");// o Maior igual
        System.out.println(mangas.ceiling(yuyuHakuso));

        System.out.println("--------------");

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
    }
}
