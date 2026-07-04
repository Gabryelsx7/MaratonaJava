package MaratonaJava.maratonajava.javacore.Zgenerics.test;

import MaratonaJava.maratonajava.javacore.Zgenerics.dominio.Barco;
import MaratonaJava.maratonajava.javacore.Zgenerics.dominio.Carro;
import MaratonaJava.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import MaratonaJava.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês... ");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
