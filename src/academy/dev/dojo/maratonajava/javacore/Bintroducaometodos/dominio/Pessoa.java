package academy.dev.dojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if (idade < 0   ) {
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
        System.out.println("Idade Validada");
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
}
