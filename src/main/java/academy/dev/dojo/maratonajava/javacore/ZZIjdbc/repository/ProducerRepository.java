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
        String sql = "INSERT INTO anime_store.producer (name) VALUES ('%s');".formatted(producer.getName());

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {

            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the database, rows affected '{}'", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM anime_store.producer WHERE Id=%d;".formatted(id);

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {

            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' from database, rows affected '{}'", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE anime_store.producer SET name='%s' WHERE Id=%d;".formatted(producer.getName(), producer.getId());

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {

            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer '{}', rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
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

    public static List<Producer> findByName(String name) {
        log.info("Finding producer by name '{}'", name);
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT id, name FROM anime_store.producer WHERE name LIKE '%%%s%%';".formatted(name);

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
            log.error("Error while trying to find producers by name '{}'", name, e);
        }
        return producers;
    }

    public static void showProductMetadata() {
        log.info("Showing Producer Metadata");
        String sql = "SELECT * FROM anime_store.producer;";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            ResultSetMetaData rsMetadata = rs.getMetaData();
            int columnCount = rsMetadata.getColumnCount();
            log.info("Columns count '{}'", columnCount);

            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name '{}'", rsMetadata.getTableName(i));
                log.info("Column name '{}'", rsMetadata.getColumnName(i));
                log.info("Column size '{}'", rsMetadata.getColumnDisplaySize(i));
                log.info("Column type '{}'", rsMetadata.getColumnTypeName(i));
            }
        } catch (SQLException e) {
            log.error("Error while showing producer metadata", e);
        }
    }

    public static void showDriverMetadata() {
        log.info("Showing Driver Metadata");

        try (Connection conn = ConnectionFactory.getConnection()) {
            DatabaseMetaData metaData = conn.getMetaData();

            if (metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE_FORWARD_ONLY");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }

            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }

            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            log.error("Error while showing driver metadata", e);
        }
    }

    public static void showTypeScroll() {
        String sql = "SELECT id, name FROM anime_store.producer;";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            log.info("Moved to last row? '{}'", rs.last());
            log.info("Row number: '{}'", rs.getRow());

            log.info(Producer.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());

            log.info("Is first row? '{}'", rs.first());
            log.info("Row number: '{}'", rs.getRow());
            log.info(Producer.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());

        } catch (SQLException e) {
            log.error("Error while trying to show type scroll", e);
        }
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        log.info("Finding producer by name '{}'", name);
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT id, name FROM anime_store.producer WHERE name LIKE '%%%s%%';".formatted(name);

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                // Converte o nome para letras maiúsculas
                String upperName = rs.getString("name").toUpperCase();

                // Atualiza no ResultSet e manda a alteração pro banco
                rs.updateString("name", upperName);
                rs.updateRow();

                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(upperName)
                        .build();

                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find producers by name '{}'", name, e);
        }
        return producers;
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        log.info("Finding producer by name '{}'", name);
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT id, name FROM anime_store.producer WHERE name LIKE '%%%s%%';"
                .formatted(name);

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) return producers;
            rs.moveToInsertRow();
            rs.updateString("name", name);
            rs.insertRow();
            producers.add(getProducer(rs));

        } catch (SQLException e) {
            log.error("Error while trying to find producers by name '{}'", name, e);
        }
        return producers;
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
        return Producer.builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .build();
    }

    public static void findByNameDelete(String name) {
        log.info("Finding producer by name '{}'", name);
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT id, name FROM anime_store.producer WHERE name LIKE '%%%s%%';"
                .formatted(name);

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                log.info("Deleting '{}'", rs.getString("name"));
                rs.deleteRow();
            }

        } catch (SQLException e) {
            log.error("Error while trying to find producers by name '{}'", name, e);
        }
    }

    public static List<Producer> findByNamePrepadStatement(String name) {
        log.info("Finding producer by name '{}'", name);
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementFindByName(conn, name);
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

    private static PreparedStatement preparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT id, name FROM anime_store.producer WHERE name LIKE ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        // ps.setString(1,String.format("%%s%%",name)); como usar um like
        return ps;
    }

    public static void updatePreparedStatemente(Producer producer) {

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedUpdate(conn, producer)) {
            int rowsAffected = ps.executeUpdate();


            log.info("Updated producer '{}', rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement preparedUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE anime_store.producer SET name='?' WHERE Id=?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        // ps.setString(1,String.format("%%s%%",name)); como usar um like
        return ps;
    }

    private static CallableStatement callableStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "CALL anime_store.sp_get_name_by_name(?);";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString(1, String.format("%%s%%", name));
        return cs;
    }

    public static List<Producer> findByNamecallableStatement(String name) {
        log.info("Finding producer by name '{}'", name);
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = callableStatementFindByName(conn, name);
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

    public static void saveTranscation(List<Producer> producers) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            // 1. Desativa o commit automático (Início da Transação)
            conn.setAutoCommit(false);

            // 2. Tenta executar as inserções
            preparedsaveTransaction(conn, producers);

            // 3. Se tudo deu certo, efetiva as alterações no banco
            conn.commit();
            log.info("Transação concluída com sucesso para {} produtoras.", producers.size());

        } catch (SQLException e) {
            log.error("Erro durante a transação. Executando Rollback...", e);
            // Opcional, mas boa prática: garantir o rollback manual caso a conexão ainda esteja aberta
        }
    }

    private static void preparedsaveTransaction(Connection conn, List<Producer> producers) throws SQLException {
        String sql = "INSERT INTO anime_store.producer (name) VALUES (?);";

        try {
            for (Producer p : producers) {
                try (PreparedStatement ps = conn.prepareStatement(sql)) {
                    log.info("Salvando producer '{}'", p.getName());
                    ps.setString(1, p.getName());
                    ps.execute();
                }
            }
        } catch (SQLException e) {
            // Se der qualquer erro no meio do loop, cancela TUDO o que foi feito na transação!
            conn.rollback();
            throw e; // Relança para o método principal saber que deu erro
        }
    }

}