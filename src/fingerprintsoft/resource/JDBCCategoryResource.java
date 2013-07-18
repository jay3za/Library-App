package fingerprintsoft.resource;

import fingerprintsoft.database.LibraryConnection;
import java.util.List;
import fingerprintsoft.domain.Category;
import fingerprintsoft.domain.interfaces.ICategory;
import fingerprintsoft.resource.interfaces.ICategoryResource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author jackie
 */
public class JDBCCategoryResource implements ICategoryResource {
	Statement stm=null;
	Connection conn = LibraryConnection.getConnection();
			
    /**
     * Fetches a list of categories from Category
     * @return category
     */
    public List getCategory() {
        return null;
    }

    /**
     *Allows to insert an new name into Category list
     */
    public void insert(Category category) {
		try{
			String sql = "INSERT INTO categroy " + "VALUES ('testerscat')";
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
     * Allows to update an Category name in the Category list
     */
    public void update(Category category) {
		try {
			PreparedStatement ps = conn.prepareStatement("update category values(?)");
            ps.setString(1, category.getName());
		
			//creates new connection for creating a statment
			stm = conn.createStatement();
		
			String sql = "UPDATE category " +
					   "SET name = 'test' WHERE name in (tester)";
			
			//executes the update statement
				stm.executeUpdate(sql);
			ResultSet rs = null;
			//try and catch inserted by IDE
			rs = stm.executeQuery(sql);
			while(rs.next()){
				 //Retrieve by column name
				 String name  = rs.getString("testercat2");
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
     * Allows to delete a name from the Category list
     */
    public Category delete(String name) {
		try{
			//creates a statement to lookup in database
			stm=conn.createStatement();
			String sql = "DELET category " +
					   "WHERE name='tester'";
			stm.executeUpdate(sql);
			sql = "SELECT name FROM category";
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()){
				 name = rs.getString("tester");
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
 * netbeans added these from abstract category method
 */
	@Override
	public List findCategory() {
		throw new UnsupportedOperationException("Not supported yet.");
	}
/**
 * netbeans added these from abstract category method
 */
	@Override
	public List findCategory(String name) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
/**
 * netbeans added these from abstract category method
 */
	@Override
	public void insert(ICategory category) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
/**
 * netbeans added these from abstract category method
 */
	@Override
	public void update(ICategory category) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
/**
 * netbeans added these from abstract category method
 */
	@Override
	public ICategory delete(Long id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
/**
 * netbeans added these from abstract category method
 */
	@Override
	public ICategory getCategory(Long id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
