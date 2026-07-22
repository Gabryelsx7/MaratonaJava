package academy.dev.dojo.maratonajava.javacore.Uragex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest03 {
    static void main(String[] args) {
        // \d = todos os numeros
        // \D = tudo que não for digito
        // \s = espaço em Branco
        // \S = Todos os caracteres excluidos os brancos
        // \w = a-ZA-Z, digito e _
        // \W = Tudo que não for incluso no w
        // [] = Tudo que não for incluso no w
        // String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-f]";
        //  String texto = "ababababa";
        String texto2 = "12 0X 0X OxFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: " + texto2);
        System.out.println("indice: 012345678");
        System.out.println("regex: " + regex);
        System.out.println("Posiçoes encrontadass");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
