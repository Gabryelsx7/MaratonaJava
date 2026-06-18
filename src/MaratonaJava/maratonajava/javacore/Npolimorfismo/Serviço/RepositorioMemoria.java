package MaratonaJava.maratonajava.javacore.Npolimorfismo.Serviço;

import MaratonaJava.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na Memoria");
    }
}
