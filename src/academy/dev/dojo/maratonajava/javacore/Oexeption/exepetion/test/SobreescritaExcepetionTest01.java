package academy.dev.dojo.maratonajava.javacore.Oexeption.exepetion.test;

import academy.dev.dojo.maratonajava.javacore.Oexeption.exepetion.dominio.Funcionario;
import academy.dev.dojo.maratonajava.javacore.Oexeption.exepetion.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobreescritaExcepetionTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
