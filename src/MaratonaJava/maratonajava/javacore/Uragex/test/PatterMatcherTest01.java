package MaratonaJava.maratonajava.javacore.Uragex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest01 {
    static void main(String[] args) {
        String regex = "ab";
        String texto = "ababababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " +texto);
        System.out.println("indice: 012345678");
        System.out.println("regex: " +regex);
        System.out.println("Posiçoes encrontadass");
        while (matcher.find()){
            System.out.print(matcher.start()+ " ");
        }
    }
}
