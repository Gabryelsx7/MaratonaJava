package academy.dev.dojo.maratonajava.javacore.Gassociacao.teste;

import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor[] professores = {professor};
        Escola escola = new Escola("Konoha", professores);

        escola.imprimir();
    }
}
