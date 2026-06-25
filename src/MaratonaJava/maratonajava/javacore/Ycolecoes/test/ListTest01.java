package MaratonaJava.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest01 {
    static void main(String[] args) {
        List <String> nomes = new ArrayList();
        List <String> nomes2 = new ArrayList();
        nomes.add("Wiliian");
        nomes.add("DevDojo ");

        nomes2.add("Suane");
        nomes2.add("Academy");

        nomes.addAll(nomes2);


        for (String nome : nomes){
            System.out.println(nome);
        }

        System.out.println("-------------");
        int size = nomes.size();
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
