package academy.dev.dojo.maratonajava.javacore.MInterfaces.dominio;

public class FilerLoader implements DataLoader , DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando");
    }

    @Override
    public void remover() {
        System.out.println("Deletando dados de arquivo");
    }
}
