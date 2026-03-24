package academy.dev.dojo.maratonajava.intoducao;

public class Aula06EstruturadeRepeticao04 {
    static void main(String[] args) {
        double valordoCarro = 3000;

        for (int parcela = 1; parcela < valordoCarro; parcela++) {
            double valorParcela = valordoCarro / parcela;

            if (valorParcela <1000){
                break;
            }
            if (valorParcela >= 1000){
                System.out.println("Pacela "+ parcela+ " R$ " +valorParcela);
        }else{
            break;
        }
    }
}}
