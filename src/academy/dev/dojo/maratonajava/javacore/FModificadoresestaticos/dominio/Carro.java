package academy.dev.dojo.maratonajava.javacore.FModificadoresestaticos.dominio;

public class Carro {
    private String name;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    public Carro(String name, double velocidadeMaxima) {
        this.name = name;
        this.velocidadeMaxima = velocidadeLimite;

    }

    public void imprimir(){
        System.out.println("------------");
        System.out.println("Nome " +this.name);
        System.out.println("VelocidadeMaxima " +this.velocidadeMaxima);
        System.out.println("VelocidadeLimite " +Carro.velocidadeLimite);
    }
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;

    }
    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVelocidade() {
        return velocidadeMaxima;
    }

    public void setVelocidade(double velocidade) {
        this.velocidadeMaxima = velocidade;
    }
}
