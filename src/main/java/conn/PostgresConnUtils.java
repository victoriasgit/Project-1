package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnUtils {

    public static Connection getPostgresConnection()
            throws ClassNotFoundException, SQLException {
        // Примечание: Изменить параметры соединения соответствующе.
        String hostName = "localhost";
        String dbName = "cryoroom";
        String userName = "postgres";
        String password = "Bitbybit123!";
        return getPostgresConnection(hostName, dbName, userName, password);
    }

    public static Connection getPostgresConnection(String hostName, String dbName,
                                                String userName, String password) throws SQLException,
            ClassNotFoundException {

        Class.forName("org.postgresql.Driver");

        // Структура URL Connection для Postgres:
        // Например:
        // jdbc:postgres://localhost:3306/simplehr
        String connectionURL = "jdbc:postgresql://" + hostName + ":5432/" + dbName;

        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);
        return conn;
    }
}
