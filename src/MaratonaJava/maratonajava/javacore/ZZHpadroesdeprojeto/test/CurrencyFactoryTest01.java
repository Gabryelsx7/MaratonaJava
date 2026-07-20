package MaratonaJava.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import MaratonaJava.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Country;
import MaratonaJava.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Currency;
import MaratonaJava.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.Brazil);
        Currency currency2 = CurrencyFactory.newCurrency(Country.USa);
        System.out.println(currency2.getSymbol());
    }
}
