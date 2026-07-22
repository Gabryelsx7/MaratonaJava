package academy.dev.dojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.dev.dojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Country;
import academy.dev.dojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Currency;
import academy.dev.dojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.Brazil);
        Currency currency2 = CurrencyFactory.newCurrency(Country.USa);
        System.out.println(currency2.getSymbol());
    }
}
