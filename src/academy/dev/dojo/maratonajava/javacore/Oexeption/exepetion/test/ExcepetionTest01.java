package academy.dev.dojo.maratonajava.javacore.Oexeption.exepetion.test;

import java.io.File;
import java.io.IOException;

public class ExcepetionTest01 {
    public static void main(String[] args) {
        criandoNovoArquivo();
    }

    private static void criandoNovoArquivo() {
        File file = new File("MaratonaJava/arquivo//text.txt");

        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
