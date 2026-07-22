package academy.dev.dojo.maratonajava.javacore.Zgenerics.test;


import academy.dev.dojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.dev.dojo.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês... ");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
