package academy.dev.dojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.dev.dojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.name ="Sanji";
        funcionario.idade = 27;
        funcionario.salarios = new double[]{1200,987.32,2000};

        funcionario.imprimir();

    }
}
