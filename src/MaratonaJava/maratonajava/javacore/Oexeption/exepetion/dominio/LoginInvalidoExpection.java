package MaratonaJava.maratonajava.javacore.Oexeption.exepetion.dominio;

public class LoginInvalidoExpection extends Exception{
    public LoginInvalidoExpection() {
        super("Login invalido");
    }

    public LoginInvalidoExpection(String message) {
        super(message);
    }
}
