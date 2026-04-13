package academy.dev.dojo.maratonajava.javacore.MInterfaces.Teste;

import academy.dev.dojo.maratonajava.javacore.MInterfaces.dominio.DatabaseLoader;
import academy.dev.dojo.maratonajava.javacore.MInterfaces.dominio.FilerLoader;

public class Dateloader01  {
    static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FilerLoader filerLoader = new FilerLoader();
        databaseLoader.load();
        filerLoader.load();

        System.out.println("-----------------------");

        databaseLoader.remover();
        filerLoader.remover();

        System.out.println("-----------------------");

        databaseLoader.checkPermission();
        filerLoader.checkPermission();

        System.out.println("-----------------------");

    }
}
