package academy.dev.dojo.maratonajava.javacore.MInterfaces.dominio;

public interface DataLoader {
    void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissoes");
    }
    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na ClasseLoader");
    }
}
