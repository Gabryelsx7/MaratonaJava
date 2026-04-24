package academy.dev.dojo.maratonajava.javacore.Oexeption.exepetion.test;

import java.io.File;
import java.io.IOException;

public class ExcepetionTest02 {
    public static void main(String[] args)throws IOException {
        criandoNovoArquivo();
    }

    private static void criandoNovoArquivo() throws IOException {
        File file = new File("MaratonaJava/arquivo//text.txt");

        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }

    }
}
