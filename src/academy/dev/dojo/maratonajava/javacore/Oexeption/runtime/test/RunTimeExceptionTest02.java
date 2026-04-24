package academy.dev.dojo.maratonajava.javacore.Oexeption.runtime.test;

public class RunTimeExceptionTest02 {
    static void main(String[] args) {
        divisão(1,0);
    }
    private  static int divisão(int a, int b)throws IllegalArgumentException{
        if (b == 0){
            throw new RuntimeException("Argumento ilegal, não pode ser 0") ;
        }
       try {
           return a/b;
       }catch (RuntimeException e){
           e.printStackTrace();
       }
       return 0;
    }
}
