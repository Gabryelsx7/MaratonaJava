package academy.dev.dojo.maratonajava.javacore.Uragex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest05 {
    static void main(String[] args) {
        // \d = todos os numeros
        // \D = tudo que não for digito
        // \s = espaço em Branco
        // \S = Todos os caracteres excluidos os brancos
        // \w = a-ZA-Z, digito e _
        // \W = Tudo que não for incluso no w
        // [] = Tudo que não for incluso no w
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // |
        // $
        // . 1.3 = 123 , 133 , 1@3, 1@3 tudo que esta entre 1.3 ele vai achar
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com , 123jotaro@gamil.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email Valido");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
//        System.out.println("texto: " + texto);
//        System.out.println("indice: 012345678");
//        System.out.println("regex: " +regex);
//        System.out.println("Posiçoes encrontadass");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
