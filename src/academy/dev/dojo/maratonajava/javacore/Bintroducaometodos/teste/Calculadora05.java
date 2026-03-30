package academy.dev.dojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.dev.dojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class Calculadora05 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[ ] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
