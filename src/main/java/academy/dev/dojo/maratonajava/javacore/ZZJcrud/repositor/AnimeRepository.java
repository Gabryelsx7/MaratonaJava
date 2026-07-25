package academy.dev.dojo.maratonajava.javacore.ZZJcrud.repositor;

import academy.dev.dojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.dev.dojo.maratonajava.javacore.ZZJcrud.dominio.Anime;
import academy.dev.dojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class AnimeRepository {

    public static List<Anime> findByName(String name) {
        log.info("Finding anime by name '{}'", name);
        List<Anime> animes = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer.builder().name(rs.getString("producer_name"))
                        .id(rs.getInt("producer_id"))
                        .build();

                Anime anime = Anime.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();
                animes.add(anime);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find animes by name '{}'", name, e);
        }
        return animes;
    }

    private static PreparedStatement createPreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = """
               SELECT a.id, a.name, a.episodes, p.id, p.name 
            FROM anime_store.anime a 
            INNER JOIN anime_store.producer p ON a.producer_id = p.id 
            WHERE a.name LIKE ?;
            """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementDelete(conn, id)) {

            ps.execute();
            log.info("Deleted anime with id '{}' from database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete anime with id '{}'", id, e);
        }
    }

    private static PreparedStatement createPreparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM anime_store.anime WHERE id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Anime anime) {
        log.info("Saving anime '{}'", anime.getName());

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementSave(conn, anime)) {
            ps.execute();
            log.info("Successfully saved anime '{}'", anime.getName());
        } catch (SQLException e) {
            log.error("Error while trying to save anime '{}'", anime.getName(), e);
        }
    }

    private static PreparedStatement createPrepareStatementSave(Connection conn, Anime anime) throws SQLException {
        String sql = """
                INSERT INTO anime_store.anime 
                (name, episodios, producer_id) 
                VALUES(?, ?, ?);
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getProducer().getId());
        return ps;
    }

    public static Optional<Anime> findByID(Integer id) {
        log.info("Finding anime by id '{}'", id);

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindByID(conn, id);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) return Optional.empty();
            Producer producer = Producer.builder()
                    .name(rs.getString("producer_name"))
                    .id(rs.getInt("producer_id"))
                    .build();

            Anime anime = Anime.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .episodes(rs.getInt("episodes"))
                    .producer(producer)
                    .build();

            return Optional.of(anime);
        } catch (SQLException e) {
            log.error("Error while trying to find anime by id '{}'", id, e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPreparedStatementFindByID(Connection conn, Integer id) throws SQLException {
        String sql = """
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name as producer_name 
                                FROM anime a 
                                INNER JOIN producer p ON a.producer_id = p.id
                                WHERE a.name LIKE = ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id); // Corrigido: setInt em vez de String.format
        return ps;
    }

    public static void update(Anime anime) {
        log.info("Updating anime '{}'", anime);

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementUpdate(conn, anime)) {
            int rowsAffected = ps.executeUpdate();
            log.info("Updated anime '{}', rows affected '{}'", anime.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update anime '{}'", anime.getId(), e);
        }
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection conn, Anime anime) throws SQLException {
        String sql = """
                UPDATE anime_store.anime
                                SET name='', episodios=0, producer_id=0
                                WHERE Id=0;""";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getId());
        ps.setInt(3, anime.getProducer().getId());
        return ps;
    }
}