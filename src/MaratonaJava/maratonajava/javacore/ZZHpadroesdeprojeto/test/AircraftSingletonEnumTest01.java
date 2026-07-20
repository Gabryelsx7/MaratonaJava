package MaratonaJava.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import MaratonaJava.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingleEnum;

public class AircraftSingletonEnumTest01 {
    static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }
    public static void bookSeat(String seat){
        System.out.println(AircraftSingleEnum.INSTANCE);
        AircraftSingleEnum instance = AircraftSingleEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
