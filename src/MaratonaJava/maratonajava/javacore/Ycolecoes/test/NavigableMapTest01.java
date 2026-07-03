package MaratonaJava.maratonajava.javacore.Ycolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() +"-" + entry.getValue());
        }
        //lower <
        //flor  <=
        //higher >
        //ceiling >=
        System.out.println(map.headMap("C"));//Manda todos antes da Chave C
        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
    }
}
