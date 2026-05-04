package academy.dev.dojo.maratonajava.javacore.QString.test;

public class StringBuilderTest01 {
    static void main(String[] args) {
        String nome = "Gabryel";
        nome.concat(" Chianca");
        nome = nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Gabryel Chianca ");
        sb.append(" Gbrzin");
        sb.reverse();
        sb.delete(0,3);
    }
}
