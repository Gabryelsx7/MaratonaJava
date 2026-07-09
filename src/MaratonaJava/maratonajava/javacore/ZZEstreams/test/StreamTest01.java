package MaratonaJava.maratonajava.javacore.ZZEstreams.test;


import MaratonaJava.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("OverLode", 3.99),
            new LightNovel("Viloet Evergarden", 8.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmental", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)));

    static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();//Para guarda titulos
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4){
                titles.add(lightNovel.getTitle());//Para salvar os titulos
            }
            if (titles.size() >=3 ){
                break;
            }
        }

        System.out.println(lightNovels);//exibir
    }

}
