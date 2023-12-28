package csmjdbc;

import java.sql.*;

public class CsmDbconnection {
	public static final String url="jdbc:mysql://localhost:3306/jdbcdemo";
	public static final String userName="root";
	public static final String password="Kdhivya@157";
    
    public static Connection getConnection() throws SQLException {
    	return DriverManager.getConnection(url,userName,password);
    }
}
