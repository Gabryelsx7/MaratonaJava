package academy.dev.dojo.maratonajava.javacore.Npolimorfismo.Serviço;

import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancodeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
