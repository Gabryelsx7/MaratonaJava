package academy.dev.dojo.maratonajava.intoducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais03 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu salario:");
        int salario = teclado.nextInt();
        String msgDoar = "Eu vou doar 500";
        String msgNdoar = "Eu não vou doar";

        // (condicao) ? verdadeiro :falso
        String resultado = salario >= 5000 ? msgDoar : msgNdoar;

        System.out.println(resultado);

    }
}
