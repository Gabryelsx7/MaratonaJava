package academy.dev.dojo.maratonajava.introducao;

public class Aula06EstruturadeRepeticao05 {
    static void main(String[] args) {
        double valordoCarro = 30000;
        for (int parcela = (int) valordoCarro; parcela >= 1; parcela--) {
            double valorParcela = valordoCarro / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Pacela "+ parcela+ " R$ " +valorParcela);
    }
}}
