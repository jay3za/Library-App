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

/**
 * @author jackie
 */
public class JDBCMediaTypeResource implements IMediaTypeResources{
	Statement stm=null;
	Connection conn = LibraryConnection.getConnection();
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
			String sql = "INSERT INTO mediaType " + "VALUES ('testersmtype')";
			//creating a new statement to insert into the database
            stm = conn.createStatement();
			stm.executeUpdate(sql);
			System.out.println("Inserted record into table...");
			
        } catch (SQLException e) {
            e.printStackTrace();
        }catch(Exception e){
      //Handle errors for Class.forName
			e.printStackTrace();
		}finally{
      //finally block used to close resources
			try{
				if(stm!=null)
				 conn.close();
				}catch(SQLException se){
					 }// do nothing
			 try{
				if(conn!=null)
				 conn.close();
			}catch(SQLException se){
				 se.printStackTrace();
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
		
			String sql = "UPDATE mediaType " +
					   "SET type = 'test' WHERE type in (tester)";
			
			//executes the update statement
			stm.executeUpdate(sql);
			ResultSet rs = null;
			//try and catch inserted by IDE
			rs = stm.executeQuery(sql);
			while(rs.next()){
				 //Retrieve by column name
				 String name  = rs.getString("testertype");
			 }
			rs.close();
		
		}catch(Exception e){
		 //Handle errors for Class.forName
			 e.printStackTrace();
		}finally{
		 //finally block used to close resources
		 try{
			 if(stm!=null)
			   conn.close();
		 }catch(SQLException se){
			}// do nothing
		try{
         if(conn!=null)
            conn.close();
		 }catch(SQLException se){
			 se.printStackTrace();
			}//end finally try
		}//end try
    }

    /**
     * allows media type to be deleted and returns null to cover type
     */
    public MediaType delete(String coverType) {
        try{
			//creates a statement to lookup in database
			stm=conn.createStatement();
			String sql = "DELET Type " +
					   "WHERE name='tester'";
			stm.executeUpdate(sql);
			sql = "SELECT type FROM mediaType";
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()){
				String name = rs.getString("tester");
			}
			rs.close();
			}catch(SQLException se){
			//Handle errors for JDBC
				se.printStackTrace();
			}catch(Exception e){
			//Handle errors for Class.forName
				e.printStackTrace();
			}finally{
			 //finally block used to close resources
				 try{
					if(stm!=null)
						conn.close();
				 }catch(SQLException se){
			}// do nothing
			try{
			  if(conn!=null) conn.close();
		   }catch(SQLException se){
			  se.printStackTrace();
		   }//end finally try
		}//end try
		
        return null;
    }

   /**
	* Netbeans inserted these methods 
	*/
    public List findMediaType() {
        return null;
    }
/**
 * netbeans IDE implemented these
 */
    public List findMediaType(String name) {
        return null;
    }
/**
 * netbeans IDE implemented these
 */
     public void insert(IMediaType mediaType) {
    }
/**
 * netbeans IDE implemented these
 */
    public void update(IMediaType mediaType) {
    }
/**
 * netbeans IDE implemented these
 */
    public IMediaType delete(Long id) {
        return null;
    }
/**
 * netbeans IDE implemented these
 */
    public IMediaType getAuthor(Long id) {
        return null;
    }
}
