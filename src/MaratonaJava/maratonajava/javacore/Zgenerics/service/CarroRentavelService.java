package MaratonaJava.maratonajava.javacore.Zgenerics.service;

import MaratonaJava.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDispnivel = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

    public Carro buscarCarroDisponivel() {
        System.out.println("Carro disponivel...");
        Carro carro = carrosDispnivel.remove(0);
        System.out.println("Alugando Carro " + carro);
        System.out.println("Carros disponiveis para alugar");
        System.out.println(carrosDispnivel);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro) {
        System.out.println("Devolvendo Carro " + carro);
        carrosDispnivel.add(carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carrosDispnivel);
    }
}

