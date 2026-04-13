package academy.dev.dojo.maratonajava.javacore.MInterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover  {
    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de dados");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados de banco de dados");
    }

    @Override
    public void checkPermission() {
            System.out.println("Checando permissoes do banco de dados");
        }

     public static void retriveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na ClasseLoader");
    }
    }

