package MaratonaJava.maratonajava.javacore.ZZEstreams.test;

import MaratonaJava.maratonajava.javacore.ZZEstreams.dominio.Category;
import MaratonaJava.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList(List.of(
            new LightNovel("Tensei Shittara", 8.99 , Category.FANTASY),
            new LightNovel("OverLode", 10.99, Category.FANTASY),
            new LightNovel("Viloet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no Life", 2.99, Category.FANTASY),
            new LightNovel("Fullmental Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)));

    static void main(String[] args) {
       //Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();
       //List<LightNovel> fantasy = new ArrayList<>();
       //List<LightNovel> drama = new ArrayList<>();
       //List<LightNovel> romance = new ArrayList<>();

       //for (LightNovel lightNovel : lightNovels) {
       //    switch (lightNovel.getCategory()){
       //        case DRAMA -> drama.add(lightNovel);
       //        case FANTASY -> fantasy.add(lightNovel);
       //        case ROMANCE -> romance.add(lightNovel);
       //    }
       //}
       //categoryLightNovelMap.put(Category.FANTASY, fantasy);
       //categoryLightNovelMap.put(Category.DRAMA, drama);
       //categoryLightNovelMap.put(Category.ROMANCE, romance);
       //System.out.println(categoryLightNovelMap);


        Map<Category, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
