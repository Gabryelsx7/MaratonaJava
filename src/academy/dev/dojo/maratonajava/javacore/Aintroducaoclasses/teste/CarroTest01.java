package academy.dev.dojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.dev.dojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome ="Astra";
        carro01.modelo ="Chevrolet";
        carro01.ano = 2001;

        carro02.nome ="Uno";
        carro02.modelo ="Fiat";
        carro02.ano = 2001;

        System.out.println("Nome do carro é "+ carro01.nome + " Da marca " +carro01.modelo+ " ano " +carro01.ano);
        System.out.println("Nome do carro é "+ carro02.nome + " Da marca " +carro02.modelo+ " ano " +carro02.ano);

    }
}
