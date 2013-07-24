package fingerprintsoft.resource;

//import java.sql.SQLException;
//import java.sql.Statement;
import fingerprintsoft.database.LibraryConnection;
import java.util.List;
//import fingerprintsoft.database.LibraryConnection;
import fingerprintsoft.domain.MediaType;
import fingerprintsoft.domain.interfaces.IMediaType;
import fingerprintsoft.resource.interfaces.IMediaTypeResources;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jackie
 */
public class JDBCMediaTypeResource implements IMediaTypeResources{
	private static final Logger LOGGER = Logger.getLogger("InfoLogging");
	Statement stm=null;
	Connection conn = LibraryConnection.getConnection();
	String x = "physical";
	String y = "electronic";
    /**
     * Fetches the list of media types
     * @return mediaType
     */
    public List getMediaType() {
        return null;
    }

    /**
     * inserts a new media type for type 
     */
    public void insert(MediaType mediaType) {
		try{
			PreparedStatement ps = conn.prepareStatement("Insert Media Type values(?)");
			String sql = "INSERT INTO media_type(media_type,book_number) VALUES ('testersmtype',1)";
			
			//creating a new statement to insert into the database
            stm = conn.createStatement();
			stm.executeUpdate(sql);
			//ps.setMediaType(1);
			ResultSet rs=ps.executeQuery();
			 if (rs.next()) {
				LOGGER.info("The employee with empno 9999 already exists.");
				rs.close();
			 }
			LOGGER.info ("Inserted record into table...");
			ps.close();
			//how it should be implemented
		if ("physical".equals(y)){
			LOGGER.log(Level.INFO, "The type is incorrect can only be electronic for this field.", x);
		}else if ("electronic".equals(x)){
			LOGGER.info("The type is incorrect");
		}else{
			LOGGER.info("Correct media type inserted");
		}
		//verify if it was implemented
		//prepared statement should verify the input
		
		//print variables that have been inserted
		LOGGER.info("");
		
        } catch (SQLException e) {
            System.out.println(e);
        }catch(Exception e){
      //Handle errors for Class.forName
			System.out.println(e);
		}finally{
      //finally block used to close resources
			try{
				if(stm!=null){
				 conn.close();
				}
				}catch(SQLException se){
					System.out.println(se);
					 }// do nothing
			 try{
				if(conn!=null){
				 conn.close();
				}
			}catch(SQLException se){
				 System.out.println(se);
			}//end finally try
		
		}
    }

    /**
     * allows update on media type for type
     */
    public void update(MediaType mediaType) {
		try {
			PreparedStatement ps = conn.prepareStatement("Update Media Type values(?)");
            ps.setString(1, mediaType.getType());
		
			//creates new connection for creating a statment
			stm = conn.createStatement();
		
			String sql = "UPDATE mediaType SET type = 'test' WHERE type in (tester)";
			
			//executes the update statement
			stm.executeUpdate(sql);
			ResultSet rs = ps.executeQuery();
			//try and catch inserted by IDE
			rs = stm.executeQuery(sql);
			while(rs.next()){
				 //Retrieve by column name
				 String name  = rs.getString("testertype");
			 }
			rs.close();
			ps.close();
		}catch(Exception e){
		 //Handle errors for Class.forName
			 System.out.println(e);
		}finally{
		 //finally block used to close resources
		 try{
			 if(stm!=null){
			   conn.close();
			 }
		 }catch(SQLException se){
			 System.out.println(se);
			}// do nothing
		try{
         if(conn!=null){
            conn.close();
		 }
		 }catch(SQLException se){
			 System.out.println(se);
			}//end finally try
		}//end try
    }

    /**
     * allows media type to be deleted and returns null to cover type
     */
    public MediaType delete(String coverType) {
        try{
			//creates a statement to lookup in database
			stm = conn.createStatement();
			String sql = "DELET Type WHERE name='tester'";
			stm.executeUpdate(sql);
			sql = "SELECT type FROM mediaType";
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()){
				String name = rs.getString("tester");
			}
			rs.close();
			}catch(SQLException se){
			//Handle errors for JDBC
				System.out.println(se);
			}catch(Exception e){
			//Handle errors for Class.forName
				System.out.println(e);
			}finally{
			 //finally block used to close resources
				 try{
					if(stm!=null){
						conn.close();
					}
				 }catch(SQLException se){
					 System.out.println(se);
			}// do nothing
			try{
			  if(conn!=null){
				  conn.close();
			  }
		   }catch(SQLException se){
			  System.out.println(se);
		   }//end finally try
		}//end try
		
        return null;
    }

	//needs to be implemented
	public List findMediaType(String name) {
		
		//how it should be implemented
		//verify it has found the mediaType
		//print out variables that has been found
		LOGGER.info("");
		return null;
	}


		
	//needs to be implemented
	public void update(IMediaType mediaType) {
		
		//how it should be implemented
		//if(==true){
			
		//}
		//verify it was updated
		//print the variables that has been updated
		//LOGGER.info("");
	}

	//needs to be implemented
	public IMediaType delete() {
		
		//how it should be implemented
		//verify it was deleted
		//print the variables that was deleted
		System.out.println();
		return null;
	}

	public void insert(IMediaType mediaType) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
