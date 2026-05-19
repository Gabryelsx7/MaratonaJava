package academy.dev.dojo.maratonajava.javacore.Vfile.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bf = new BufferedWriter(fw)){
            fw.write("Estou aprendendo java\n continua a linha ");
            fw.flush();

            } catch(IOException e){
                throw new RuntimeException(e);
            }
        }
}