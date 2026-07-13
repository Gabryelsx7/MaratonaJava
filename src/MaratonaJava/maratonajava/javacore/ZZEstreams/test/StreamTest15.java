package MaratonaJava.maratonajava.javacore.ZZEstreams.test;

import MaratonaJava.maratonajava.javacore.ZZEstreams.dominio.Category;
import MaratonaJava.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import MaratonaJava.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest15 {
    private static List<LightNovel> lightNovels = new ArrayList(List.of(new LightNovel("Tensei Shittara", 8.99, Category.FANTASY), new LightNovel("OverLode", 10.99, Category.FANTASY), new LightNovel("Viloet Evergarden", 5.99, Category.DRAMA), new LightNovel("No Game no Life", 2.99, Category.FANTASY), new LightNovel("Fullmental Alchemist", 5.99, Category.FANTASY), new LightNovel("Kumo desuga", 1.99, Category.FANTASY), new LightNovel("Kumo desuga", 1.99, Category.FANTASY), new LightNovel("Monogatari", 4.00, Category.ROMANCE)));

    static void main(String[] args) {

        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, List<Promotion>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPrice, Collectors.toList())));
        System.out.println(collect1);

        Map<Category, Set<Promotion>> collect2 = lightNovels.stream() //sem dupli
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPrice, Collectors.toSet())));
        System.out.println(collect2);

        Map<Category, Set<Promotion>> collect3 = lightNovels.stream() //sem dupli
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPrice, Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect3);
    }

    private static Promotion getPrice(LightNovel lightNovel) {
    return  lightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION :Promotion.NORMAL_PRICE;

    }
}
