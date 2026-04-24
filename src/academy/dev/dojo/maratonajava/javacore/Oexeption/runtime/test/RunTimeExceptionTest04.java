package academy.dev.dojo.maratonajava.javacore.Oexeption.runtime.test;

import java.lang.module.FindException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        }

        try {
            talvezLanceExc();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private static void talvezLanceExc() throws SQLException, FindException{

    }
}
