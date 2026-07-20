package MaratonaJava.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import MaratonaJava.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AirCraft;
import MaratonaJava.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEager;

public class AirCraftSingletoEagerTest01 {
    static void main(String[] args) {
        bookseat("1A");
        bookseat("1A");

    }
    private static void bookseat(String seat){
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getINSTANCE();
       System.out.println(AircraftSingletonEager.getINSTANCE());
       // System.out.println(aircraftSingletonEager.bookSeat(seat));
    }
}
