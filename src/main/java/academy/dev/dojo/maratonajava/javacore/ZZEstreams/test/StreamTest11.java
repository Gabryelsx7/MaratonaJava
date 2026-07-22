package academy.dev.dojo.maratonajava.javacore.ZZEstreams.test;

import academy.dev.dojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static final List<LightNovel> lightNovels = new ArrayList(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("OverLode", 10.99),
            new LightNovel("Viloet Evergarden", 5.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmental", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)));

    static void main(String[] args) {
        System.out.println(lightNovels.size());
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        lightNovels.stream()
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

        lightNovels.stream()
                .collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)))
                .ifPresent(System.out::println);

        System.out.println(lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .sum());

        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);//tudo que fizemos em um unico codigo

        String titles = lightNovels.stream()
                .map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);

    }
}
