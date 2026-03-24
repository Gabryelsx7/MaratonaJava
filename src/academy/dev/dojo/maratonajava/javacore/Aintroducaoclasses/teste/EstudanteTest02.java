package academy.dev.dojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.dev.dojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome ="Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        estudante.nome = "Luffy";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);

        System.out.println("------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);

    }
}
