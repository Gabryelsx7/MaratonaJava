package academy.dev.dojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subraiDoisNumeros() {
        System.out.println(20 - 20);
    }

    public void multiplicaDoisNumero(int num, float num2) {
        System.out.println(num * num2);
    }

    public double divideDoisNumeros01(double num1, double num2) {
        return 0;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        return 0;
    }

    public void imprimirDivisão(double num1, double num2) {
        if (num2 == 0)
            System.out.println("Não existe divisão de zero");
    }
    public void alteraDoisNumeros(int num1 , int num2){
        num1 = 99;
        num1 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1" + num1);
        System.out.println("num2" + num2);
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }}
