package MaratonaJava.maratonajava.javacore.Vfile.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    static void main(String[] args) {
        File file = new File("text.txt");
        try( FileWriter fw = new FileWriter(file);) {
            fw.write("O devDojo é lindo, é o melhor curso do brasill!!!");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
