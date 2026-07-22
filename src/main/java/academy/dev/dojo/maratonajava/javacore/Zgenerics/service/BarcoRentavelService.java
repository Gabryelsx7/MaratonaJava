package academy.dev.dojo.maratonajava.javacore.Zgenerics.service;


import academy.dev.dojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private final List<Barco> barcosDispnivel = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("iate")));

    public Barco buscarBarcoDisponivel() {
        System.out.println("Barco disponivel...");
        Barco barco = barcosDispnivel.remove(0);
        System.out.println("Alugando Barco " + barco);
        System.out.println("barcos disponiveis para alugar");
        System.out.println(barcosDispnivel);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco) {
        System.out.println("Devolvendo barco " + barco);
        barcosDispnivel.add(barco);
        System.out.println("barcos disponiveis para alugar: ");
        System.out.println(barcosDispnivel);
    }
}

