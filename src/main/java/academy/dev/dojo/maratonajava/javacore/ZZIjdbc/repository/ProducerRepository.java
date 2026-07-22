package academy.dev.dojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.dev.dojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO anime_store.producer (name) " + "VALUES ('%s');".formatted(producer.getName());

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Insrt producer '{}' in the database, rows affectd '{}',", producer.getName(), rowsAffected);

            System.out.println(rowsAffected);
        } catch (SQLDataException e) {
            log.error("Error while tryng to insert producer'{}'", producer.getName(), e);
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM anime_store.producer WHERE Id=%s;".formatted(id);

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Delete producer '{}' from database, rows affectd '{}',", id, rowsAffected);

            System.out.println(rowsAffected);
        } catch (SQLDataException e) {
            log.error("Error while tryng to delete producer'{}'", id, e);
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void upadate(Producer producer) {
        String sql = "UPDATE anime_store.producer SET name='%s' WHERE Id='%d';".formatted(producer.getName(), producer.getId());

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer '{}' rows affectd '{}',", producer.getId(), rowsAffected);

            System.out.println(rowsAffected);
        } catch (SQLDataException e) {
            log.error("Error while tryng to update producer'{}'", producer.getId(), e);
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Producer> findAll() {
        log.info("Finding all Producers");
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT id, name FROM anime_store.producer;";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }
}
