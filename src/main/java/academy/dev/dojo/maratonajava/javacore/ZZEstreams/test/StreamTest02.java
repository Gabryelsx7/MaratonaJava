package academy.dev.dojo.maratonajava.javacore.ZZEstreams.test;


import academy.dev.dojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    private static final List<LightNovel> lightNovels = new ArrayList(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("OverLode", 3.99),
            new LightNovel("Viloet Evergarden", 8.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmental", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)));

    static void main(String[] args) {
        List<String> collect = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))//coloca em ordem
                .filter(lightNovel -> lightNovel.getPrice() <= 4)
                .limit(3) //Maximo 3 titulos
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
