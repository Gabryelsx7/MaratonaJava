package academy.dev.dojo.maratonajava.javacore.ZZIjdbc.conn;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    // java.sql: Connection, Statement, ResultSet, DriverManager

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store?allowPublicKeyRetrieval=true&useSSL=false";
        String username = "root";
        String password = "root"; // Coloque a senha exata do seu container MySQL/Docker

        return DriverManager.getConnection(url, username, password);
    }

    public static JdbcRowSet getjdbcRowSet() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store?allowPublicKeyRetrieval=true&useSSL=false";
        String username = "root";
        String password = "root"; // Coloque a senha exata do seu container MySQL/Docker
        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
        jdbcRowSet.setUrl(url);
        jdbcRowSet.setUsername(username);
        jdbcRowSet.setPassword(password);

        return jdbcRowSet;
    }
}