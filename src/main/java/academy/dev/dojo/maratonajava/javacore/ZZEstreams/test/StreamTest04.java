package academy.dev.dojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> grapicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> desevolpers = List.of("William", "David", "Harrison");
        List<String> studentes = List.of("Édipo", "Gustavo Mendes", "Guilherme");
        devDojo.add(grapicDesigners);
        devDojo.add(desevolpers);
        devDojo.add(studentes);

        devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}
