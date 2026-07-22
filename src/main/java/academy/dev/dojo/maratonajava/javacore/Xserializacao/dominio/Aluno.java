package academy.dev.dojo.maratonajava.javacore.Xserializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {

    @Serial
    private static final long serialVersionUID = 8270217892615107530L;
    private long id;
    private String nome;
    private transient String passaword;
    private static String nomeDaEscola = "DevDojo";
    private transient Turma turma;

    public static String getNomeDaEscola() {
        return nomeDaEscola;
    }

    public static void setNomeDaEscola(String nomeDaEscola) {
        Aluno.nomeDaEscola = nomeDaEscola;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Aluno(long id, String nome, String passaword) {
        System.out.println("Dentro do Construtor");
        this.id = id;
        this.nome = nome;
        this.passaword = passaword;
    }

    @Serial
    private void whiteObject(ObjectOutputStream oss) {
        try {
            oss.defaultWriteObject();
            oss.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassaword() {
        return passaword;
    }

    public void setPassaword(String passaword) {
        this.passaword = passaword;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", passaword='" + passaword + '\'' +
                ", nomeDaEscola='" + nomeDaEscola + '\'' +
                ", Turma='" + turma + '\'' +
                '}';
    }
}

