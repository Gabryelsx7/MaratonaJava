package MaratonaJava.maratonajava.javacore.Bintroducaometodos.teste;

import MaratonaJava.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class Pessoa01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraya");
        pessoa.setIdade(90);
        pessoa.imprime();

        System.out.println(pessoa.getNome());
    }
}
