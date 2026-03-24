package academy.dev.dojo.maratonajava.javacore.Aintroducaoclasses.Bintroducaometodos.teste;

import academy.dev.dojo.maratonajava.javacore.Aintroducaoclasses.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20 , 2 );
        System.out.println(resultado);
    }

}
