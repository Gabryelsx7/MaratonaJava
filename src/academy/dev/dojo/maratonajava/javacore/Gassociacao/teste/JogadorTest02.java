package academy.dev.dojo.maratonajava.javacore.Gassociacao.teste;

import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprimir();
    }
}
