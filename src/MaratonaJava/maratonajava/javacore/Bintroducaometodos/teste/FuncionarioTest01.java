package MaratonaJava.maratonajava.javacore.Bintroducaometodos.teste;

import MaratonaJava.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setName("Sanji");
        funcionario.setIdade(27);
        funcionario.setSalarios(new double[]{1200,987.32,2000});

        funcionario.imprimir();

    }
}
