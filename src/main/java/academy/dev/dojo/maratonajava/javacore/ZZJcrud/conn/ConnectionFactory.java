package academy.dev.dojo.maratonajava.javacore.ZZJcrud.conn;

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
}