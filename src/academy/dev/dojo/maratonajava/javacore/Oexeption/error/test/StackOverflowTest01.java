package academy.dev.dojo.maratonajava.javacore.Oexeption.error.test;

public class StackOverflowTest01 {
    static void main(String[] args) {
        recusividade();
    }
    public static void recusividade(){
        recusividade();
    }
}
