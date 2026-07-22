package academy.dev.dojo.maratonajava.javacore.ZZDopitional.test;

import java.util.List;
import java.util.Optional;

public class OpitionalTest01 {
    static void main(String[] args) {
        Optional<String> o1 = Optional.of("LUFFY");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("------------");


        Optional<String> nameOpition = Optional.ofNullable(String.valueOf(findName("willian")));
        String empty = nameOpition.orElse("EMPTY");
        nameOpition.ifPresent(s -> System.out.println(s));
        String name = String.valueOf(findName("willian"));

    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("willian", "DevDojo");
        int i = list.indexOf(name);
        if (i != 0) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
