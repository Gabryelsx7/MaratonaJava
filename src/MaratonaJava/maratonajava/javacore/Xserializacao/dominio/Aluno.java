package MaratonaJava.maratonajava.javacore.Xserializacao.dominio;

import java.io.Serializable;

public class Aluno implements Serializable {

    private long id;
    private String nome;
    private String passaword;

    public Aluno(long id, String nome, String passaword) {
        this.id = id;
        this.nome = nome;
        this.passaword = passaword;
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
                '}';
    }
}

