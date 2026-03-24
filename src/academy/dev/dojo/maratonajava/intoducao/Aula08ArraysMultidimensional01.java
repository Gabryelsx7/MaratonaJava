package academy.dev.dojo.maratonajava.intoducao;

public class Aula08ArraysMultidimensional01 {
    static void main(String[] args) {
        int [][] dias = new int [3][3];
        dias[0][0] =31;
        dias[0][1] =31;
        dias[0][2] =31;

        dias[1][0] =31;
        dias[2][1] =31;
        dias[3][2] =31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
    }
}
