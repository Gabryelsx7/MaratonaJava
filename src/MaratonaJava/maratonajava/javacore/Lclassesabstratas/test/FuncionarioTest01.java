package MaratonaJava.maratonajava.javacore.Lclassesabstratas.test;

import MaratonaJava.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import MaratonaJava.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

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
