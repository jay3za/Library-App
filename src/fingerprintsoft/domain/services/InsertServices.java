/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fingerprintsoft.domain.services;
import fingerprintsoft.database.LibraryConnection;
import java.sql.*;
/**
 *
 * @author Jackie
 */
public class InsertServices {
	
	/**
	 *
	 * @throws SQLException
	 */
	public void LibraryInserts() throws SQLException{
	   int ret_code;
		//Establish a connection
	   Connection conn = LibraryConnection.getConnection();
	   
	   //author table insert
	   try {
		   int number[] = {1001, 1002, 7788};
		   String name[] = {"JOHN","DAVID","ORATEST"};

		   String sql1 = "SELECT * FROM author" ;
		   String sql2 = "INSERT INTO author VALUES (number,name)";

		   PreparedStatement pstmt1 = conn.prepareStatement(sql1);
		   PreparedStatement pstmt2 = conn.prepareStatement(sql2);
		   
		   for (int numx=0;numx<3;numx++) {
				pstmt1.setInt(1, number[numx]);
				ResultSet rset = pstmt1.executeQuery();
				if (rset.next()) {
					System.out.println("The book number " + number[numx] + " already exists.");
					rset.close();
			}
		   else
			{
				pstmt2.setInt(1, number[numx]);
				pstmt2.setString(2, name[numx]);
				pstmt2.executeUpdate(); }
		   } // End of for loop
		   pstmt1.close();
		   pstmt2.close();
		   conn.close();
		   } catch (SQLException e) {
			   ret_code = e.getErrorCode(); 
				System.err.println(ret_code + e.getMessage()); 
				conn.close();
		   }
	   //book table insert
	   try {
		   int number[] = {1001, 1002, 7788};
		   String name[] = {"JOHNTEST","DAVIDTEST","ORATESTTEST"};

		   String sql1 = "SELECT * FROM book" ;
		   String sql2 = "INSERT INTO book VALUES (number,name)";

		   PreparedStatement pstmt1 = conn.prepareStatement(sql1);
		   PreparedStatement pstmt2 = conn.prepareStatement(sql2);
		   
		   for (int numx=0;numx<3;numx++) {
				pstmt1.setInt(1, number[numx]);
				ResultSet rset = pstmt1.executeQuery();
				if (rset.next()) {
					System.out.println("The book number " + number[numx] + " already exists.");
					rset.close();
			}
		   else
			{
				pstmt2.setInt(1, number[numx]);
				pstmt2.setString(2, name[numx]);
				pstmt2.executeUpdate(); }
		   } // End of for loop
		   pstmt1.close();
		   pstmt2.close();
		   conn.close();
		   } catch (SQLException e) {
			   ret_code = e.getErrorCode(); 
				System.err.println(ret_code + e.getMessage()); 
				conn.close();
		   }
	   // insert category table
	   try {
		   int book_number[] = {1001, 1002, 7788};
		   String category[] = {"JAVA","HIBERNATE","JDBC"};

		   String sql1 = "SELECT * FROM category" ;
		   String sql2 = "INSERT INTO category VALUES (book_number,category)";

		   PreparedStatement pstmt1 = conn.prepareStatement(sql1);
		   PreparedStatement pstmt2 = conn.prepareStatement(sql2);
		   
		   for (int numx=0;numx<3;numx++) {
				pstmt1.setInt(1, book_number[numx]);
				ResultSet rset = pstmt1.executeQuery();
				if (rset.next()) {
					System.out.println("The category " + book_number[numx] + " already exists.");
					rset.close();
			}
		   else
			{
				pstmt2.setInt(1, book_number[numx]);
				pstmt2.setString(2, category[numx]);
				pstmt2.executeUpdate(); }
		   } // End of for loop
		   pstmt1.close();
		   pstmt2.close();
		   conn.close();
		   } catch (SQLException e) {
			   ret_code = e.getErrorCode(); 
				System.err.println(ret_code + e.getMessage()); 
				conn.close();
		   }
	   
	   	   // insert mediaType table
	   try {
		   int book_number[] = {1001, 1002};
		   String media_type[] = {"PHYSICAL","ELECTRONIC"};

		   String sql1 = "SELECT * FROM media_type" ;
		   String sql2 = "INSERT INTO media_type VALUES (book_number,media_type)";

		   PreparedStatement pstmt1 = conn.prepareStatement(sql1);
		   PreparedStatement pstmt2 = conn.prepareStatement(sql2);
		   
		   for (int numx=0;numx<3;numx++) {
				pstmt1.setInt(1, book_number[numx]);
				ResultSet rset = pstmt1.executeQuery();
				if (rset.next()) {
					System.out.println("The mediatype" + book_number[numx] + " already exists.");
					rset.close();
			}
		   else
			{
				pstmt2.setInt(1, book_number[numx]);
				pstmt2.setString(2, media_type[numx]);
				pstmt2.executeUpdate(); }
		   } // End of for loop
		   pstmt1.close();
		   pstmt2.close();
		   conn.close();
		   } catch (SQLException e) {
			   ret_code = e.getErrorCode(); 
				System.err.println(ret_code + e.getMessage()); 
				conn.close();
		   }
	   
	}
	  
}
