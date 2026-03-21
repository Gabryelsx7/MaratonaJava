package academy.dev.dojo.maratonajava.introducao;

public class ExercicioTabeladeImposto {
    static void main(String[] args) {
        double salario = 45000;
        double taxa1 = 9.70 /100;
        double taxa2 = 37.50 /100;
        double taxa3 = 49.50 /100;

        if (salario <= 34712){
            salario = salario * taxa1;

        } else if (salario >= 68.507) {
            salario = salario * taxa2;

        }else {
            salario = salario * taxa3;

        }
        System.out.println(salario);
    }
}
