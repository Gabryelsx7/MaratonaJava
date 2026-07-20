package MaratonaJava.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.time.ZoneId;
import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("781-888");
    private final Set<String> availabeseats = new HashSet<>();
    private final String name;

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    {

        availabeseats.add("1A");
        availabeseats.add("1B");
    }
    public boolean bookSeat(String seat){
        return availabeseats.remove(seat);
    }

    public static AircraftSingletonEager getINSTANCE() {
        return INSTANCE;
    }
}
