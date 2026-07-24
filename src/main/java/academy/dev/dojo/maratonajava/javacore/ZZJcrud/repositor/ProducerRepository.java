package academy.dev.dojo.maratonajava.javacore.ZZJcrud.repositor;


import academy.dev.dojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.dev.dojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static List<Producer> findByName(String name) {
        log.info("Finding producer by name '{}'", name);
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createaPreapareStatementFinByName(conn, name);
             ResultSet rs = ps.executeQuery();) {

            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find producers by name '{}'", name, e);
        }
        return producers;
    }
    private static PreparedStatement createaPreapareStatementFinByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT id, name FROM anime_store.producer WHERE name LIKE ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        // ps.setString(1,String.format("%%s%%",name)); como usar um like
        return ps;
    }


}
