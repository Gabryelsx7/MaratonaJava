package MaratonaJava.maratonajava.javacore.Jmodificadorfinal.teste;

import MaratonaJava.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import MaratonaJava.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import MaratonaJava.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class Carrotest01 {
    static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();


        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuri");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Puro sangue");
        ferrari.imprimir();


    }
}
