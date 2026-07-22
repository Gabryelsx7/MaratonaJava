package academy.dev.dojo.maratonajava.javacore.ZZEstreams.test;

import academy.dev.dojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.dev.dojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.dev.dojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamTest13 {
    private static final List<LightNovel> lightNovels = new ArrayList(List.of(new LightNovel("Tensei Shittara", 8.99, Category.FANTASY), new LightNovel("OverLode", 10.99, Category.FANTASY), new LightNovel("Viloet Evergarden", 5.99, Category.DRAMA), new LightNovel("No Game no Life", 2.99, Category.FANTASY), new LightNovel("Fullmental Alchemist", 5.99, Category.FANTASY), new LightNovel("Kumo desuga", 1.99, Category.FANTASY), new LightNovel("Kumo desuga", 1.99, Category.FANTASY), new LightNovel("Monogatari", 4.00, Category.ROMANCE)));

    static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(ln -> {
            return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
        }));
        System.out.println(collect);

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(ln -> {
            return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
        })));

        System.out.println(collect1);

    }
}
