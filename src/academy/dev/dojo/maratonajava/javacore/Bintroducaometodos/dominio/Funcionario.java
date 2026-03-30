package academy.dev.dojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String name;
    public int idade;
    public double[] salarios;

    public void imprimir(){
        System.out.println(this.name);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for(double salario : salarios){
            System.out.print(salario + "");
        }
        imprimirMediaSalario();
    }

    public void imprimirMediaSalario(){
        if (salarios == null) {
            return;
        }
        double media = 0;

        for (double salario: salarios){
            media += salario;
    }
        media /= salarios.length;
        System.out.println("\nMedia salarial " +media);
}}
