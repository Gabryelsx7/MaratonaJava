package MaratonaJava.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    static void main(String[] args) {
        List <String> nomes = new ArrayList();
        nomes.add("Wiliian");
        nomes.add("DevDojo academy");


        for (String nome : nomes){
            System.out.println(nome);
        }
        nomes.add("Suane");

        System.out.println("-------------");
        for (int i = 0; i <nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
