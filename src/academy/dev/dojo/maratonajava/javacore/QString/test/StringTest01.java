package academy.dev.dojo.maratonajava.javacore.QString.test;

public class StringTest01 {
    static void main(String[] args) {
        String nome ="Gabryel";
        String nome2 ="Gabryel";
        nome = nome.concat(" Chianca");
        System.out.println(nome);
        System.out.println(nome == nome2);
    }
}
