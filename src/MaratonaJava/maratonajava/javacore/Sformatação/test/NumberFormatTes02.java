package MaratonaJava.maratonajava.javacore.Sformatação.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTes02 {
    static void main(String[] args) {
        Locale localePt = new Locale("pt","br");
        Locale localejp = Locale.JAPAN;
        Locale localeit = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] =NumberFormat.getCurrencyInstance();
        nfa[1] =NumberFormat.getCurrencyInstance(localePt);
        nfa[2] =NumberFormat.getCurrencyInstance(localeit);
        nfa[3] =NumberFormat.getCurrencyInstance(localejp);
        double valor = 10_000.2130;
        for (NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.getMaximumIntegerDigits());
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "1,000";
        try {
            System.out.println(nfa[0].parse(valorString));
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
