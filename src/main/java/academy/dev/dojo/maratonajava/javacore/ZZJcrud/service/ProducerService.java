package academy.dev.dojo.maratonajava.javacore.ZZJcrud.service;

import academy.dev.dojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.dev.dojo.maratonajava.javacore.ZZJcrud.repositor.ProducerRepository;

import java.util.List;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void buildmenu(int op){
        switch (op){
            case 1:
                findByname();break;
            default:throw new IllegalArgumentException("Not a valid option");
        }
    }
    private static void findByname(){
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();

        List<Producer> producers = ProducerRepository.findByName(name);
        for (int i = 0; i < producers.size(); i++) {
            System.out.printf("[%d] - %s%n", i,producers.get(i).getName());
        }
    }
}
