package academy.dev.dojo.maratonajava.javacore.Hherança.teste;

import academy.dev.dojo.maratonajava.javacore.Hherança.dominio.Endereço;
import academy.dev.dojo.maratonajava.javacore.Hherança.dominio.Funcionario;
import academy.dev.dojo.maratonajava.javacore.Hherança.dominio.Pessoa;

public class EndereçoTest01 {
    static void main(String[] args) {
        Endereço endereço = new Endereço();

        endereço.setRua("Rua 8");
        endereço.setCep("072220");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Zoro");
        pessoa.setCpf("1111111");
        pessoa.setEndereço(endereço);
        pessoa.imprimir();


        System.out.println("-------------");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda");
        funcionario.setSalario(200000);
        funcionario.setCpf("2222");
        funcionario.setEndereço(endereço);
        funcionario.imprimir();
    }
}
