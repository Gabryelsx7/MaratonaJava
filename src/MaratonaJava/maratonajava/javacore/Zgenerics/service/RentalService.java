package MaratonaJava.maratonajava.javacore.Zgenerics.service;

import MaratonaJava.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;


    public RentalService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel() {
        System.out.println("Obejto disponivel...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto " + t);
        System.out.println("Obejos disponiveis para alugar");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObejtoAlugado(T t) {
        System.out.println("Devolvendo objeto " + t);
        objetosDisponiveis.add(t);
        System.out.println("Obejto disponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
