package academy.dev.dojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula03TiposPrimitivos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String name = scanner.nextLine();

        System.out.println("Digite seu endereço:");
        String endereco = scanner.nextLine();

        System.out.println("Digite seu salário:");
        int salario = scanner.nextInt();

        System.out.println("Eu " + name + ", estou morando no endereço " + endereco +
                ", confirmo que estou recebendo o salário de " + salario +
                ", na data 12/03/26");
    }
}