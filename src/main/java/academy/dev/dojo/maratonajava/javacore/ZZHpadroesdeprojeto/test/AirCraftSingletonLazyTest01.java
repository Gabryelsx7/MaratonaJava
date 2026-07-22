package academy.dev.dojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;


import academy.dev.dojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AirCraftSingletonLazyTest01 {
    static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookseat("1A");
        bookseat("1A");

        System.out.println(AircraftSingletonLazy.getINSTANCE());
        System.out.println(AircraftSingletonLazy.getINSTANCE());
        Constructor<AircraftSingletonLazy> declaredConstructor = AircraftSingletonLazy.class.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        AircraftSingletonLazy aircraftSingletonLazy = declaredConstructor.newInstance("797-424");
        System.out.println(aircraftSingletonLazy);
    }

    private static void bookseat(String seat) {
        System.out.println(AircraftSingletonLazy.getINSTANCE());
        AircraftSingletonLazy aicraft = AircraftSingletonLazy.getINSTANCE();
        // System.out.println(aircraftSingletonEager.bookSeat(seat));
    }
}
