package MaratonaJava.maratonajava.javacore.Vfile.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bf = new BufferedWriter(fw)){
            bf.write("Estou aprendendo java ");
            bf.newLine();
            bf.flush();

            } catch(IOException e){
                throw new RuntimeException(e);
            }
        }
}