package MaratonaJava.maratonajava.javacore.Eblocodeinicializacao.teste;

import MaratonaJava.maratonajava.javacore.Eblocodeinicializacao.dominio.Anime;

public class Animetest01 {
    static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int episodios : anime.getEpisodios()) {
            System.out.print(episodios + "");
        }
    }
}
