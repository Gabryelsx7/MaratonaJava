package academy.dev.dojo.maratonajava.intoducao;

public class Aula04Operadores {
    static void main(String[] args) {

        int numero1 = 20;
        int numero2 = 10;
        int resultado = numero1 + numero2;
        System.out.println("Valor da conta:" + resultado);

        int resto = 21%7;
        System.out.println("resto");

        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMaiorQueVi = 10<20;
        boolean isDezMaiorQueV = 10==20;
        boolean isDezMaior = 10==20;
        boolean isDezMaiorQue = 10>20;

        double valorTotalContaCorrente = 200;
        double valorTotalPoupanca= 10000;
        double ps5 = 15000;

        boolean isplay5 = valorTotalContaCorrente > ps5 || valorTotalPoupanca > ps5;
        System.out.println("Comprou "+ isplay5);

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /=2;
        bonus *=2;

        System.out.println(bonus);
    }
}
