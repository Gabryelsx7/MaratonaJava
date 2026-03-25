package academy.dev.dojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.dev.dojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 =1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1 , num2);
        System.out.println("Dentro do CalculadoraTeste04");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }
}
