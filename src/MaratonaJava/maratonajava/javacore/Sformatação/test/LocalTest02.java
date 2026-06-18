package MaratonaJava.maratonajava.javacore.Sformatação.test;

import java.util.Locale;

public class LocalTest02 {
    static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoContries= Locale.getISOCountries();
        String[] isoLaguaens= Locale.getISOLanguages();

        for (String isoLaguagens : isoLaguaens){
            System.out.print(isoLaguagens + " ");
        }
        System.out.println();
        for (String isoContry : isoContries) {
            System.out.println(isoContries + " ");
        }
    }
}
