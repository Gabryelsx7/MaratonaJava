package academy.dev.dojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO anime_store.producer (name) " + "VALUES ('%s');".formatted(producer.getName());

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Insrt producer '{}' in the database, rows affectd '{}',",producer.getName(), rowsAffected);

            System.out.println(rowsAffected);
        } catch (SQLDataException e) {
            log.error("Error while tryng to insert producer'{}'",producer.getName(), e);
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void delete(int id ) {
        String sql = "DELETE FROM anime_store.producer WHERE Id=%s;".formatted(id);

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Delete producer '{}' from database, rows affectd '{}',",id, rowsAffected);

            System.out.println(rowsAffected);
        } catch (SQLDataException e) {
            log.error("Error while tryng to insert producer'{}'",id, e);
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
