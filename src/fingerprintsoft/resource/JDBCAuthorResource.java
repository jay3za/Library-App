package fingerprintsoft.resource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import fingerprintsoft.database.LibraryConnection;
import fingerprintsoft.domain.Author;
import fingerprintsoft.domain.interfaces.IAuthor;
import fingerprintsoft.resource.interfaces.IAuthorResource;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author jackie
 */
public class JDBCAuthorResource implements IAuthorResource {
	Connection conn = LibraryConnection.getConnection();
	Statement stm=null;
   
    /**
     * catches the errors for connection to the library
     */
    public void insert(IAuthor author) {
        try {
			PreparedStatement ps = conn.prepareStatement("insert into author values(?)");
            ps.setString(1, author.getName());
			//creating a new statement to insert into the database
            stm = conn.createStatement();
			String sql = "INSERT INTO Author " + "VALUES ('Henry')";
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
     * iterate through the list to find a author name
     */
    public List findAuthors(String name) {
		try{
			stm = conn.createStatement();
			//Creating a statement
			String sql= "SELECT name FROM author";
			stm.executeQuery(sql);		
			ResultSet rs = stm.executeQuery(sql);
			//use while loop to lookup the name of the colomn
			while(rs.next()){
				 //Retrieve by column name
				name  = rs.getString("name");
			}rs.close();
			//Select all the names in the colomb
			 sql = "SELECT name FROM author" +
					   " WHERE name LIKE '%so%' ";
			}catch (SQLException ex) {
				ex.printStackTrace();

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
			 }
			return null;

			//pshuedo-if the name is not on the list then update the list and add it to the list
		  }
}
    
    /**
     * @update the author in the database
     */
    public void update(IAuthor author) {
		//try and catch inserted by IDE
		try {
		Connection conn = LibraryConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement("insert into author values(?)");
            ps.setString(1, author.getName());
		
			//creates new connection for creating a statment
			stm = conn.createStatement();
		
			String sql = "UPDATE author " +
					   "SET name = 'Tommy' WHERE name in (Henry)";
			//executes the update statement
				stm.executeUpdate(sql);
			ResultSet rs = null;
			//try and catch inserted by IDE
			rs = stm.executeQuery(sql);
			while(rs.next()){
				 //Retrieve by column name
				 String name  = rs.getString("Tommy");
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
     * Deletes an author and returns null to the database
     */
    public IAuthor delete(Long id) {
		try{
				//creates a statement to lookup in database
		stm=conn.createStatement();
		String sql = "DELET author " +
                   "WHERE name='Tommy'";
		stm.executeUpdate(sql);
		sql = "SELECT name FROM author";
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()){
			String name = rs.getString("name");
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
			  if(conn!=null)
				 conn.close();
		   }catch(SQLException se){
			  se.printStackTrace();
		   }//end finally try
		}//end try
		
        return null;
    }
	//added by IDE
	public List findAuthors() {
		return null;
	}
	//added by IDE
	public Author getNames() {
		return null;
	}

}
