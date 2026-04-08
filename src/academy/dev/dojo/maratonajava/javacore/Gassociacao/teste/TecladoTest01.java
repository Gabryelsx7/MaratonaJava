package academy.dev.dojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class TecladoTest01 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome embaixo:");
        String nome = entrada.nextLine();
        System.out.println("Digite seu idade embaixo:");
        int idade = entrada.nextInt();
        System.out.println("Digite seu sexo M ou F");
        char sexo = entrada.next().charAt(0);

        System.out.println("--------------------");
        System.out.println("Nome " +nome+ " Idade "+idade+ " Sexo " +sexo);
    }
}
