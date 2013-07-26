/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fingerprintsoft.domain.services;

import fingerprintsoft.database.LibraryConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jackie
 */
public class DeleteServices {
	public void LibraryUpdate() throws SQLException{
		int ret_code;
		
		//Establish a connection
	   Connection conn = LibraryConnection.getConnection();
	
	   // update mediaType table
	   try {
		   int book_number[] = {4, 7};
		   String media_type[] = {"PHYSICAL","ELECTRONIC"};

		   String sql1 = "SELECT * FROM media_type" ;
		   String sql2 = "ALTER media_type UPDATE (book_number,media_type)";

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
	   
	   //author table update
	   try {
		   int number[] = {1001, 1002, 7788};
		   String name[] = {"JOHN/ted","DAVID/ted","ORATEST/ted"};

		   String sql1 = "SELECT * FROM author" ;
		   String sql2 = "ALTER TABLE author VALUES (number,name)";

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
	   //book table UPDATE
	   try {
		   int number[] = {1001, 1002, 7788};
		   String name[] = {"JOHNTEST/TED","DAVIDTEST/TED","ORATESTTEST/TED"};

		   String sql1 = "SELECT * FROM book" ;
		   String sql2 = "ALTER TABLE book VALUES (number,name)";

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
	   
	   // UPDATE category table
	   try {
		   int book_number[] = {1001, 1002, 7788};
		   String category[] = {"JAVA/TED","HIBERNATE/TED","JDBC/TED"};

		   String sql1 = "SELECT * FROM category" ;
		   String sql2 = "ALTER TABLE category VALUES (book_number,category)";

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
	}
		
}
