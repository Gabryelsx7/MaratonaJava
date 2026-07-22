package academy.dev.dojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.dev.dojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.dev.dojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Seku", 2000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
