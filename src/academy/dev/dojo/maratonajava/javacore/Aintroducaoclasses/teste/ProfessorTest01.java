package academy.dev.dojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.dev.dojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo ='M';

        System.out.println("Meu nome é " +professor.nome + " tenho " + professor.idade+" anos  "+ professor.sexo);
    }
}
