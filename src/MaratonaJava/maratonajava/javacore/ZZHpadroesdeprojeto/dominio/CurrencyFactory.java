package MaratonaJava.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        return switch (country) {
            case Brazil -> new Real();
            case USa -> new UsDollar();
            default -> throw new IllegalArgumentException("No currency found for this country");
        };
    }
}