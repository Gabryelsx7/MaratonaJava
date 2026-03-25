package academy.dev.dojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.dev.dojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros01(20 , 2 );
        System.out.println(resultado);
        System.out.println(calculadora.divideDoisNumeros02(20 , 2));
        System.out.println("-------------");
        calculadora.imprimirDivisão(20,2);
    }

}
