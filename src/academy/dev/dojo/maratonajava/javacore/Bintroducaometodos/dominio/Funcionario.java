package academy.dev.dojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String name;
    private int idade;
    private double[] salarios;
    private double media =0;

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


        for (double salario: salarios){
            media += salario;
    }
        media /= salarios.length;
        System.out.println("\nMedia salarial " +media);
}

    public void setName(String name) {
        this.name = name;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}

