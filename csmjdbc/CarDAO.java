package csmjdbc;
import java.sql.*;

public class CarDAO {
	public void carInfo(String query) throws SQLException {
		//String query = "insert into RegisterDetails values(" + "'" + username + "','" + Email+ "','"+ Password+ "','" + ConfirmPassword + "')";
		Connection con=CsmDbconnection.getConnection();
		Statement st=con.createStatement();
        int rows=st.executeUpdate(query);
        
//        System.out.println("Number of rows affected    :"+rows);
        con.close();
	}

	public void carInfo1(String usernameval, String passwordval) throws SQLException{
		
	    
		Connection con = CsmDbconnection.getConnection();

		String query = "SELECT email, password FROM registerDetails WHERE email = '" + usernameval + "'";

		try {
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery(query);
		    
		    if (rs.next()) {
		        String storedPassword = rs.getString("password");
		        
		        if (storedPassword.equals(passwordval)) {
		            System.out.println("Login Successfull");
		            Index index=new Index();
		            index.main(null);
		           
		           
		            
		        } else {
		            System.out.println("Password Mismatched");
		        }
		    } else {
		        System.out.println("Username not found.");
		        LoginPage login=new LoginPage();
		        login.main(null);
		    }
		} catch (SQLException e) {
		   
		    e.printStackTrace();
		} finally {
		    try {
		        con.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}

       
	}

	

}
