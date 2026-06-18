package MaratonaJava.maratonajava.javacore.Xserializacao.test;

import MaratonaJava.maratonajava.javacore.Xserializacao.dominio.Aluno;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno(20, "Gabryel", "1234");

        serializacao(aluno);
        deserializacao();
    }

    private static void serializacao(Aluno aluno) {

        Path path = Paths.get("arquivo/aluno.ser");

        try {
            Files.createDirectories(path.getParent());

            try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {

                oos.writeObject(aluno);
                System.out.println("Aluno salvo com sucesso!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializacao() {

        Path path = Paths.get("arquivo/aluno.ser");

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {

            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}