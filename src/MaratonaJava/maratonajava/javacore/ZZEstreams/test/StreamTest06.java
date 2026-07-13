package MaratonaJava.maratonajava.javacore.ZZEstreams.test;

import MaratonaJava.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> lightNovels = new ArrayList(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("OverLode", 10.99),
            new LightNovel("Viloet Evergarden", 8.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmental", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() >= 8));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() >= 0)); //Tudo mundo e maior que 0 return true
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() >= 0));//se nenhum deles for maior que 0 returm false
        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() >= 3)
                .findAny().ifPresent(System.out::println);

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() >= 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() >= 3)
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() >= 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
