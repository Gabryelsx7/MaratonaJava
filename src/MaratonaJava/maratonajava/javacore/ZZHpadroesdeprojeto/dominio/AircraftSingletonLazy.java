package MaratonaJava.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {
    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> availabeseats = new HashSet<>();
    private final String name;

    {

        availabeseats.add("1A");
        availabeseats.add("1B");
    }

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    public static AircraftSingletonLazy getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonEager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("897-987");
                }
            }
        }
        return INSTANCE;
    }


    public boolean bookSeat(String seat) {
        return availabeseats.remove(seat);
    }
}
