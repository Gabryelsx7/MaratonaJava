package academy.dev.dojo.maratonajava.javacore.Oexeption.exepetion.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTest01 {
    static void main(String[] args) {

    }
    public static void lerArquiv
            (){
        try (Reader reader = new BufferedReader(new FileReader("text.txt"))){

        }catch (IOException e){

        }
    }
}
