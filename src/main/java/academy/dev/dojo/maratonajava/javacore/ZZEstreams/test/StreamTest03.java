package academy.dev.dojo.maratonajava.javacore.ZZEstreams.test;

import academy.dev.dojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static final List<LightNovel> lightNovels = new ArrayList(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("OverLode", 3.99),
            new LightNovel("Viloet Evergarden", 8.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmental", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)));

    static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.stream().forEach(System.out::println);
        long count = stream.filter(lightNovel -> lightNovel.getPrice() <= 4)
                .count();
        long count2 = lightNovels.stream()
                .distinct()
                .filter(lightNovel -> lightNovel.getPrice() <= 4)
                .count();
        System.out.println(count);
        System.out.println(count2);
    }
}
