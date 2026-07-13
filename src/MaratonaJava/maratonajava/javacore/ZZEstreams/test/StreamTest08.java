package MaratonaJava.maratonajava.javacore.ZZEstreams.test;

import MaratonaJava.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("OverLode", 10.99),
            new LightNovel("Viloet Evergarden", 5.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmental", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)));
    static void main(String[] args) {
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price ->  price >3 )
                .reduce(Double ::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream() //Stream<Double>
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();

        System.out.println(sum);
    }
}
