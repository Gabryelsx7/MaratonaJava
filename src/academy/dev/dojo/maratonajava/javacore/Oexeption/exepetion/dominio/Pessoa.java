package academy.dev.dojo.maratonajava.javacore.Oexeption.exepetion.dominio;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoExpection, FileNotFoundException {
        System.out.println("Salvando Pessoa");
    }
}
