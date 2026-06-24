package MaratonaJava.maratonajava.javacore.Ycolecoes.test;

import MaratonaJava.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("1ABC1", "Iphone");
        System.out.println(s1.equals(s2));

    }

}
