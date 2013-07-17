package fingerprintsoft.resource;

//import java.sql.SQLException;
//import java.sql.Statement;
import java.util.List;
import fingerprintsoft.database.LibraryConnection;
import fingerprintsoft.domain.Book;
import fingerprintsoft.domain.interfaces.IBook;
import fingerprintsoft.resource.interfaces.IBookResource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCBookResource implements IBookResource {
	Statement stm=null;
	//Creating connection with the database
	Connection conn = LibraryConnection.getConnection();

    /**
     * Allows to insert a book into Book List
     */
    public void insert(Book book) {
		try {			
            PreparedStatement ps = conn.prepareStatement("insert into book values(?)");
            ps.setString(1, book.getName());
			//creating a new statement to insert into the database
            stm = conn.createStatement();
			String sql = "INSERT INTO book " + "VALUES ('here is a test')";
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
     * Allows to update a book from Book List
     */
    public void update(Book book) {
		try {
			PreparedStatement ps = conn.prepareStatement("update book values(?)");
            ps.setString(1, book.getName());
		
			//creates new connection for creating a statment
			stm = conn.createStatement();
		
			String sql = "UPDATE book " +
					   "SET name = 'test' WHERE name in (tester)";
			
			//executes the update statement
				stm.executeUpdate(sql);
			ResultSet rs = null;
			//try and catch inserted by IDE
			rs = stm.executeQuery(sql);
			while(rs.next()){
				 //Retrieve by column name
				 String name  = rs.getString("tester");
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
     * Deletes a bookNumber from Book List
     */
    public Book delete(Integer bookNumber) {
		try{
			//creates a statement to lookup in database
			stm=conn.createStatement();
			String sql = "DELET book " +
					   "WHERE name='tester'";
			stm.executeUpdate(sql);
			sql = "SELECT name FROM book";
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
     * finds the book name in the list of the database
     */
    public List findBooks(String name) {
		try{
			stm = conn.createStatement();
			//Creating a statement
			String sql= "SELECT name FROM book";
			stm.executeQuery(sql);		
			ResultSet rs = stm.executeQuery(sql);
			//use while loop to lookup the name of the colomn
			while(rs.next()){
				//Retrieve by column name
				name  = rs.getString("name");
			}rs.close();
			//Select all the names in the colomb
			sql = "SELECT name FROM book" +
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

//added by the IDE
	public IBook getAuthor(Long id) {
		return null;
	}

	public void insert(IBook book) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public void update(IBook book) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public IBook delete(Long id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public List findBooks() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
