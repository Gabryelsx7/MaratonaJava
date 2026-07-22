package academy.dev.dojo.maratonajava.javacore.Vfile.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadertest01 {
    static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader("file.txt")) {
//        char[] in= new char[1];
//            fr.read(in);
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
