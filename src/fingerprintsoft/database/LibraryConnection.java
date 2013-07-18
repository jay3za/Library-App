package fingerprintsoft.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LibraryConnection {

    public static final String URL_STRING = "jdbc:postgresql://localhost:5432/library_database";
    public static final String DEFAULT_PASSWORD = "admin";
    public static final String DEFAULT_USERNAME = "dbadmin";
    public static Connection conn;

    public static Connection getConnection() {

        Statement statement = null;

        try {
            if (conn == null) {
                conn = DriverManager.getConnection(URL_STRING, DEFAULT_USERNAME, DEFAULT_PASSWORD);
            }
        } catch (Exception err) {
            err.printStackTrace();

        } finally {
            try {
                if (statement != null)
                    statement.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();

            }

        }
        return conn;
    }
    
}
