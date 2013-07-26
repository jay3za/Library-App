package fingerprintsoft.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LibraryConnection {

//<<<<<<< HEAD
    /**
	 * connection to a database established below
	 */
	public static final String URL_STRING = "jdbc:postgresql://localhost:5432/library_database";
    public static final String DEFAULT_PASSWORD = "Whocares";
    public static final String DEFAULT_USERNAME = "postgres";
/**=======
<<<<<<< HEAD
    public static final String URL_STRING = "jdbc:postgresql://localhost:5432/LibraryDatabase";
    public static final String DEFAULT_PASSWORD = " ";
    public static final String DEFAULT_USERNAME = " ";
=======
    public static final String URL_STRING = "jdbc:postgresql://localhost:5432/library_database";
    public static final String DEFAULT_PASSWORD = "admin";
    public static final String DEFAULT_USERNAME = "dbadmin";
>>>>>>> jackie_branch
>>>>>>> master**/
    public static Connection conn;

    public static Connection getConnection() {

        Statement statement = null;

        try {
            if (conn == null) {
                conn = DriverManager.getConnection(URL_STRING, DEFAULT_USERNAME, DEFAULT_PASSWORD);
            }
        } catch (Exception err) {
            System.out.println(err);

        } finally {
            try {
                if (statement != null){
                    statement.close();
				}
                if (conn != null){
                    conn.close();
				}
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return conn;
	}    
}
