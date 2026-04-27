package academy.dev.dojo.maratonajava.javacore.Oexeption.exepetion.test;

import academy.dev.dojo.maratonajava.javacore.Oexeption.exepetion.dominio.LoginInvalidoExpection;

import java.util.Scanner;

public class LoginInvalidoExpectiontest01 {
    static void main(String[] args) {
        try {
            logar();
        }catch (LoginInvalidoExpection e){
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoExpection{
        Scanner teclado = new Scanner(System.in);
        String usernameDb= "Goku";
        String senhaDb = "Dbz";

        System.out.println("Digite o usuario");
        String usernameDbDigitado = teclado.nextLine();

        System.out.println("Digite o senha");
        String senhaDbDigitado  = teclado.nextLine();

        if (!usernameDb.equals(usernameDbDigitado) || !senhaDb.equals(senhaDbDigitado)){
            throw new LoginInvalidoExpection("Usuario e senha invalida");
        }
        System.out.println("Usuario logado com sucesso");
    }
}

