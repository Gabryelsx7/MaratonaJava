package MaratonaJava.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import MaratonaJava.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AirCraft;

public class AirCraftTest01 {
    static void main(String[] args) {
        bookseat("1A");
        bookseat("1A");
    }
    private static void bookseat(String seat){
        AirCraft airCraft = new AirCraft("781-872");
        System.out.println(airCraft.bookSeat(seat));
    }
}
