package academy.dev.dojo.maratonajava.javacore.Gassociacao.teste;

import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    static void main(String[] args) {
        Local local = new Local("Rua da laranja");
         Aluno aluno = new Aluno("Luffy ", 19);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Onde achar o One Piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.impimir();
    }
}
