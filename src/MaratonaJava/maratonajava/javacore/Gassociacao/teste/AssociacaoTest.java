package MaratonaJava.maratonajava.javacore.Gassociacao.teste;

import MaratonaJava.maratonajava.javacore.Gassociacao.dominio.Aluno;
import MaratonaJava.maratonajava.javacore.Gassociacao.dominio.Local;
import MaratonaJava.maratonajava.javacore.Gassociacao.dominio.Professor;
import MaratonaJava.maratonajava.javacore.Gassociacao.dominio.Seminario;
import MaratonaJava.maratonajava.javacore.ZZClambdas.service.AnimeCompartor;

public class AssociacaoTest extends AnimeCompartor {
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
