package academy.dev.dojo.maratonajava.javacore.Oexeption.runtime.test;

import java.io.FileNotFoundException;
import java.lang.module.FindException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    static void main(String[] args) {
        try {
            throw new RuntimeException ();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IndexOutOfBoundsException e ");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RunTime");
        }

        try {
            talvezLanceExc();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void talvezLanceExc() throws SQLException, FileNotFoundException{

    }
}
