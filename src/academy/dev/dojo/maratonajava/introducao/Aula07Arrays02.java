package academy.dev.dojo.maratonajava.introducao;

public class Aula07Arrays02 {
    static void main(String[] args) {
       String[] nomes = new String[3];
       nomes[0] ="Goku";
       nomes[1] ="Luffy";
       nomes[2] ="Tanjiro";

        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
        }
    }
}
