package MaratonaJava.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingleEnum {
    INSTANCE;
    private final Set<String> avalibeSet;

    AircraftSingleEnum() {
        this.avalibeSet = new HashSet<>();
        this.avalibeSet.add("1A");
        this.avalibeSet.add("1B");
    }

    public boolean bookSeat(String seat){
        return avalibeSet.remove(seat);
    }
}
