package academy.dev.dojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande Software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou não");
        String pergunta1 = input.nextLine();
        if (pergunta1.charAt(0) == ' ' ){
            System.out.println("Sim");
        }else {
            System.out.println("Não");
        }

    }
}
