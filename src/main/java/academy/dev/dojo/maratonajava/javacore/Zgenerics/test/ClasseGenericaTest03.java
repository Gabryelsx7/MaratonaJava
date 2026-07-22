package academy.dev.dojo.maratonajava.javacore.Zgenerics.test;


import academy.dev.dojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.dev.dojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.dev.dojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    static void main(String[] args) {
        List<Carro> carrosDispnivel = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDispnivel = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("iate")));
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDispnivel);

        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês... ");
        rentalServiceCarro.retornarObejtoAlugado(carro);

        System.out.println("-------------------------");
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDispnivel);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o Barco por um mês... ");
        rentalServiceBarco.retornarObejtoAlugado(barco);
    }
}
