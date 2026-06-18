package MaratonaJava.maratonajava.javacore.Vfile.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritertest01 {
    static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Estou aprendendo java\n continua a linha ");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
