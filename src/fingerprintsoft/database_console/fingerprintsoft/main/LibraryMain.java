package fingerprintsoft.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import org.postgresql.util.PSQLException;


public class LibraryMain {
	public static final String URL_STRING = "jdbc:postgresql://localhost:5432/dbadmin";
	public static final String DEFAULT_PASSWORD = "admin";
	public static final String DEFAULT_USERNAME = "dbadmin";
	public static Connection conn;
	
	public static void update(String sql) throws Exception
	{
		if(conn==null || conn.isClosed()) connect();
		Statement st=null;
		st=conn.createStatement();
		st.executeUpdate(sql);
		
	}
	
	public static void connect(){
		
		
		conn=null;
		
		try{
			if (conn == null) {
				conn = DriverManager.getConnection(URL_STRING,
						DEFAULT_USERNAME, DEFAULT_PASSWORD);
			}
		/*
			st=conn.createStatement();
			st.executeUpdate("INSERT INTO author VALUES(09,'rob')");
			st.execute("INSERT INTO author VALUES (02,'ted')");
			System.out.println("completed");*/
		}
		catch(Exception err){
			err.printStackTrace();
		}
		
		/*
		finally {
			try {
				if (conn != null)
					conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();

			}
			
		}
		*/
			
	}

	
}
