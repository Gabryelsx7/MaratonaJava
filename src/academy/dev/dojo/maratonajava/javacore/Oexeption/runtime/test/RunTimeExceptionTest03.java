package academy.dev.dojo.maratonajava.javacore.Oexeption.runtime.test;

public class RunTimeExceptionTest03 {
    static void main(String[] args) {
        abreConexão();
    }

        private static String abreConexão(){
            try {
                System.out.println("Abrindo arquivo");
                System.out.println("Escrevendo dados do arquivo");
                return "conexão aberta";
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                System.out.println("Fechando o recurso liberado pelo SO");
            }
            return null;
        }
    }

