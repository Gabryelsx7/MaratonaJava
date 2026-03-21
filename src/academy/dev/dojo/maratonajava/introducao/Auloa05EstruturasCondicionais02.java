package academy.dev.dojo.maratonajava.introducao;

public class Auloa05EstruturasCondicionais02 {
    static void main(String[] args) {
        int idade = 19;
        String categoria;

        if (idade < 15){
            categoria ="Categoria Infatil";

        }else if(idade >= 15 && idade <18){

            categoria ="Categoria juvenil";

        } else {
            categoria = "Categoria Bitelo";
        }
        System.out.println(categoria);
    }
}
