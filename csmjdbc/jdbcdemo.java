package csmjdbc;
import java.sql.*;
import java.util.Scanner;

public class jdbcdemo {

	public static void main(String[] args) throws SQLException {
//	insertVar();
		 //insertRecord();
		//insertUsingPst();
		//delete();
		//update();
		//sp2();
		//commitdemo();
		batchdemo();
		
	}
	
	
	public static void readRecord() throws SQLException {
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName="root";
	    String password="Kdhivya@157";
	    String query="select * from customer";
	    
	    
		Connection con=DriverManager.getConnection(url,userName,password);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        
        while(rs.next()) {
        System.out.println("Id is          :"+rs.getInt(1));
        System.out.println("Name is        :"+rs.getString(2));
        System.out.println("EmailId is     :"+rs.getString(3));
        System.out.println("Phonenumber is :"+rs.getString(4));
        System.out.println("------------------------------------");
        }
        con.close();
	}
	
	
	//insert record
	public static void insertRecord() throws SQLException {
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName="root";
	    String password="Kdhivya@157";
	    String query="insert into customer values (6,'Mani','mani@gmail.com',6890543512)";
	    
	    
		Connection con=DriverManager.getConnection(url,userName,password);
        Statement st=con.createStatement();
        int rows=st.executeUpdate(query);
        
        //System.out.println("Number of rows affected    :"+rows);
        con.close();
	}
	
	
	//insert with variable
	public static void insertVar() throws SQLException {
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName="root";
	    String password="Kdhivya@157";
	    //String query="insert into customer values (6,'mani@gmail.com',6890543512)";
	    
	    
	    int id=7;
	    String name="Mohana";
	    String	email="mohana@gmail.com";
	    long phone=Long.valueOf("9890543512");
	    
	    String query = "insert into customer values (" + id + ",'" + name + "','" + email + "','" + phone + "');";

	    
		Connection con=DriverManager.getConnection(url,userName,password);
        Statement st=con.createStatement();
        int rows=st.executeUpdate(query);
        
       System.out.println("Number of rows affected    :"+rows);
       // System.out.println(query);
        con.close();
	}
	
	
	//insert with p
	public static void insertUsingPst() throws SQLException {
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName="root";
	    String password="Kdhivya@157";
	    //String query="insert into customer values (6,'mani@gmail.com',6890543512)";
	    
	    
	    int id=6;
	    String name="Mani";
	    String	email="mani@gmail.com";
	    String phone="6890543512";
	    
	    String query = "insert into customer(cus_id,cusname,email,phonenumber) values (?,?,?,?)";
	    
		Connection con=DriverManager.getConnection(url,userName,password);
      
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, id);
		pst.setString(2,name);
		pst.setString(3,email);
		pst.setString(4,phone);

        int rows=pst.executeUpdate();
        
       System.out.println("Number of rows affected    :"+rows);
       // System.out.println(query);
        con.close();
	}
	
	
	public static void delete() throws SQLException {
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName="root";
	    String password="Kdhivya@157";
	    //String query="insert into customer values (6,'mani@gmail.com',6890543512)";
	    
	    
	    int id=6;
	    
	    
	    String query = "delete from customer where cus_id="+id;
	    
		Connection con=DriverManager.getConnection(url,userName,password);
        Statement st=con.createStatement();
		

        int rows=st.executeUpdate(query);
        
       System.out.println("Number of rows affected    :"+rows);
       // System.out.println(query);
        con.close();
	}

	
	public static void update() throws SQLException {
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName="root";
	    String password="Kdhivya@157";
	    //String query="insert into customer values (6,'mani@gmail.com',6890543512)";
	    
	    
	    int id=6;
	    
	    
	    String query = "update customer set phonenumber=8978678970 where cus_id=1";
	    
		Connection con=DriverManager.getConnection(url,userName,password);
        Statement st=con.createStatement();
		

        int rows=st.executeUpdate(query);
        
       //System.out.println("Number of rows affected    :"+rows);
        System.out.println("update successfully");
        //System.out.println(query);
        con.close();
	}
	
	
	//Types of statement
	//normal,
	//prepared,
	//callable statement
	
	
	//calling simple stored procecedure
	
	public static void sp() throws SQLException {
	String url="jdbc:mysql://localhost:3306/jdbcdemo";
	String userName="root";
    String password="Kdhivya@157";
    
    
	Connection con=DriverManager.getConnection(url,userName,password);
    CallableStatement cst=con.prepareCall("{call GetCus()}");
    ResultSet rs=cst.executeQuery();
    
    
    while(rs.next()) {
        System.out.println("Id is          :"+rs.getInt(1));
        System.out.println("Name is        :"+rs.getString(2));
        System.out.println("EmailId is     :"+rs.getString(3));
        System.out.println("Phonenumber is :"+rs.getString(4));
        System.out.println("------------------------------------");
        }
    con.close();
}
	
	
	//calling simple stored procecedure with parameter
	
	public static void sp2() throws SQLException {
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName="root";
	    String password="Kdhivya@157";
	    
	    System.out.println("Enter id between 1 to 7");
	    Scanner myObj= new Scanner (System.in);
	    int value=myObj.nextInt();
		Connection con=DriverManager.getConnection(url,userName,password);
	    CallableStatement cst=con.prepareCall("{call GetCusById(?)}");
	    cst.setInt(1,value);
	    ResultSet rs=cst.executeQuery();
	    
	    
	    if(rs.next()) {
	        System.out.println("Id is          :"+rs.getInt(1));
	        System.out.println("Name is        :"+rs.getString(2));
	        System.out.println("EmailId is     :"+rs.getString(3));
	        System.out.println("Phonenumber is :"+rs.getString(4));
	        System.out.println("------------------------------------");
	        }
	    else {
	    	System.out.println("id mismatched..");
	    }
	    con.close();
	}
	
	
	
	public static void sp3() throws SQLException {
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName="root";
	    String password="Kdhivya@157";
	    
	    int id=3;
		Connection con=DriverManager.getConnection(url,userName,password);
	    CallableStatement cst=con.prepareCall("{call GetCusNameById(?,?)}");
	    cst.setInt(1, id);
	    cst.registerOutParameter(2,Types.VARCHAR);
	    cst.executeUpdate();
	    
	    
	    System.out.println(cst.getString(2));
	   
	    con.close();
	}
	
	
	//commit Vs autocommit
	
	public static void commitdemo() throws SQLException {
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName="root";
	    String password="Kdhivya@157";
	    
	    String query1="update customer set phonenumber=8967895645 where cus_id=2";
	    String query2="update customer set phonenumber=8967895645 where cus_id=5";
	    
		Connection con=DriverManager.getConnection(url,userName,password);
	    
		con.setAutoCommit(false);
		Statement st=con.createStatement();
	    
	    int rows1=st.executeUpdate(query1);
	    
	    
	    int rows2=st.executeUpdate(query2);
	   
	   if(rows1>0 && rows2>0) {
		   con.setAutoCommit(true);
		   System.out.println(rows1);
		   System.out.println(rows2);
	   }
	   
	    
	    con.close();
	}
	//batch
	public static void batchdemo() throws SQLException {
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName="root";
	    String password="Kdhivya@157";
	    
	    String query1="update customer set phonenumber=7967895645 where cus_id=2";
	    String query2="update customer set phonenumber=7967895645 where cus_id=5";
	    String query3="update customer set phonenumber=7967895645 where cus_id=1";
	    String query4="update customer set phonenumber=7967895645 where cus_id=3";
	    
	    
		Connection con=DriverManager.getConnection(url,userName,password);
	    
		con.setAutoCommit(false);
		Statement st=con.createStatement();
	    
	    st.addBatch(query1);
	    st.addBatch(query2);
	    st.addBatch(query3);
	    st.addBatch(query4);
	   
	    int[] res=st.executeBatch();
	    
	    
	    for(int i:res) {
	    	if(i>0) {
	    		//con.setAutoCommit(true);
	    	//System.out.println("Rows affected"+i);
	    		continue;
	    	}
	    	else
	    		con.rollback();
	    }
	    con.commit();
	    con.close();
	}
}
