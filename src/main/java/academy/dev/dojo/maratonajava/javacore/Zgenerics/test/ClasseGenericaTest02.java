package academy.dev.dojo.maratonajava.javacore.Zgenerics.test;

import academy.dev.dojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.dev.dojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês... ");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
