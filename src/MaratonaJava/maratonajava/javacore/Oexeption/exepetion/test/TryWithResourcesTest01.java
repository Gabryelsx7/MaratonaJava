package MaratonaJava.maratonajava.javacore.Oexeption.exepetion.test;

import MaratonaJava.maratonajava.javacore.Oexeption.exepetion.dominio.Leitor01;
import MaratonaJava.maratonajava.javacore.Oexeption.exepetion.dominio.Leitor02;

import java.io.IOException;

public class TryWithResourcesTest01 {
    static void main(String[] args) {
        lerArquiv();
    }
    public static void lerArquiv(){
        try (Leitor01 leitor01 = new Leitor01();
            Leitor02 leitor02 = new Leitor02()){

        }catch (IOException e){

        }
    }
}
