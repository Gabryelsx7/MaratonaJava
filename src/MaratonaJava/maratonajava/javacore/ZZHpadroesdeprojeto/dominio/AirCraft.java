package MaratonaJava.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AirCraft {
    private final Set<String> availabeseats = new HashSet<>();
    private final String name;

    public AirCraft(String name) {
        this.name = name;
    }

    {
        availabeseats.add("1A");
        availabeseats.add("1B");
    }
    public boolean bookSeat(String seat){
        return availabeseats.remove(seat);
    }
}
