package MaratonaJava.maratonajava.javacore.ZZEstreams.test;

import MaratonaJava.maratonajava.javacore.ZZEstreams.dominio.Category;
import MaratonaJava.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList(List.of(new LightNovel("Tensei Shittara", 8.99, Category.FANTASY), new LightNovel("OverLode", 10.99, Category.FANTASY), new LightNovel("Viloet Evergarden", 5.99, Category.DRAMA), new LightNovel("No Game no Life", 2.99, Category.FANTASY), new LightNovel("Fullmental Alchemist", 5.99, Category.FANTASY), new LightNovel("Kumo desuga", 1.99, Category.FANTASY), new LightNovel("Kumo desuga", 1.99, Category.FANTASY), new LightNovel("Monogatari", 4.00, Category.ROMANCE)));

    static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        //Categoria
        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        //Preço
        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect2);

    }
}
