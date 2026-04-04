package academy.dev.dojo.maratonajava.javacore.FModificadoresestaticos.teste;

import academy.dev.dojo.maratonajava.javacore.FModificadoresestaticos.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro c1 = new Carro("BMW ", 280);
        Carro c2 = new Carro("Hb20 ", 150);
        Carro c3 = new Carro("Fiat ", 180);

        Carro.setVelocidadeLimite(250);

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
    }
}
