package academy.dev.dojo.maratonajava.javacore.Sformatação.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTes01 {
    static void main(String[] args) {
        Locale localePt = new Locale("pt", "br");
        Locale localejp = Locale.JAPAN;
        Locale localeit = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localePt);
        nfa[2] = NumberFormat.getInstance(localeit);
        nfa[3] = NumberFormat.getInstance(localejp);
        double valor = 10_000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }
    }
}
