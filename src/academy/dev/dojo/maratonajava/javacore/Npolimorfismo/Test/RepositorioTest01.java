package academy.dev.dojo.maratonajava.javacore.Npolimorfismo.Test;

import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.Serviço.RepositorioArquivo;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.Serviço.RepositorioMemoria;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
//        List.add("Goku");
//        List.add("Vegeta");
//        List.add("Kuririn");
        System.out.println(list);
    }
}