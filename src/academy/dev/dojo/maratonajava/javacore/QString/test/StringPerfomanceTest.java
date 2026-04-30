package academy.dev.dojo.maratonajava.javacore.QString.test;

public class StringPerfomanceTest {
    static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(1000);
    }
    private static void concatString(int tamanho){
            String texto = "";
        for (int i = 0; i <tamanho ; i++) {
            texto +=i;
        }
        System.out.println(texto);
    }
}
