package MaratonaJava.maratonajava.javacore.Zgenerics.test;

import MaratonaJava.maratonajava.javacore.Zgenerics.dominio.Carro;
import MaratonaJava.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês... ");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
