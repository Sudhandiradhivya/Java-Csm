package csmjdbc;

import java.sql.*;

class ModelTextColourType{
    public static final String reset = "\u001B[0m";
    public static final String black = "\u001B[30m";
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String yellow = "\u001B[33m";
    public static final String darkBlue = "\u001B[34m";
    public static final String purple = "\u001B[35m";
    public static final String lightBlue = "\u001B[36m";
    public static final String white = "\u001B[37m";
    public static final String orange = "\u001B[38;5;202m";
    public static final String Bg_black = "\u001B[40m";
    public static final String Bg_red = "\u001B[41m";
    public static final String Bg_green = "\u001B[42m";
    public static final String Bg_yellow = "\u001B[43m";
    public static final String Bg_darkBlue = "\u001B[44m";
    public static final String Bg_purple = "\u001B[45m";
    public static final String Bg_lightBlue = "\u001B[46m";
    public static final String Bg_grey = "\u001B[47m";
}

public class ModelsDAO {
	
	public void displayInfo() throws SQLException {
		String query = "Select * from model";
		Connection con = ModelsDbConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		TextColourType myObj=new TextColourType();
		
		int num=1;
		
		System.out.println("\n\n\t\t\t\t"+"\u001B[1mModel"+"\t\t\t\t\t\t\tEx-showroom Price"+"\n"+myObj.reset);
		System.out.println("\t\t\t\t--------------------------------------------------------------------------\n");
		if(num>0) {
		while(rs.next()) {
				System.out.println("\t\t\t\t"+rs.getString(1)+"\t\t\t\t\t"+rs.getString(2)+"\n");
			
		   }
		}
		
		
	}
	
	public void specification() throws SQLException {
		
		String query = "Select * from cullinanspecification";
		Connection con = ModelsDbConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		TextColourType myObj=new TextColourType();
		
		int num=1;
		
		//System.out.println("\n\n\t\t\t\t"+"\u001B[1mModel"+"\t\t\t\t\t\t\tEx-showroom Price"+"\n"+myObj.reset);
		
		if(num>0) {
		while(rs.next()) {
			    System.out.println("\n\n\t\t\t"+rs.getString(1)+"\t\t\t\t\t"+rs.getString(2)+"\n");
				//System.out.println("\t\t\t\t"+"\u001B[1m"+rs.getString(1)+"\t\t\t\t\t"+rs.getString(2)+"\n");
				System.out.println("\t\t\t-----------------------------------------------------------------------");
			
		   }
		}
	}
		
		public void Ghostspecification() throws SQLException {
			
			String query = "Select * from Ghostspecification";
			Connection con = ModelsDbConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			TextColourType myObj=new TextColourType();
			
			int num=1;
			
			//System.out.println("\n\n\t\t\t\t"+"\u001B[1mModel"+"\t\t\t\t\t\t\tEx-showroom Price"+"\n"+myObj.reset);
			
			if(num>0) {
			while(rs.next()) {
				    System.out.println("\n\n\t\t\t"+rs.getString(1)+"\t\t\t\t\t"+rs.getString(2)+"\n");
					//System.out.println("\t\t\t\t"+"\u001B[1m"+rs.getString(1)+"\t\t\t\t\t"+rs.getString(2)+"\n");
					System.out.println("\t\t\t-----------------------------------------------------------------------");
				
			   }
			}
			
		
	}
public void Dawnspecification() throws SQLException {
			
			String query = "Select * from Dawnspecification";
			Connection con = ModelsDbConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			TextColourType myObj=new TextColourType();
			
			int num=1;
			
			//System.out.println("\n\n\t\t\t\t"+"\u001B[1mModel"+"\t\t\t\t\t\t\tEx-showroom Price"+"\n"+myObj.reset);
			
			if(num>0) {
			while(rs.next()) {
				    System.out.println("\n\n\t\t\t"+rs.getString(1)+"\t\t\t\t\t"+rs.getString(2)+"\n");
					//System.out.println("\t\t\t\t"+"\u001B[1m"+rs.getString(1)+"\t\t\t\t\t"+rs.getString(2)+"\n");
					System.out.println("\t\t\t-----------------------------------------------------------------------");
				
			   }
			}
}
public void Wraithspecification() throws SQLException {
	
	String query = "Select * from Wraithspecification";
	Connection con = ModelsDbConnection.getConnection();
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(query);
	
	TextColourType myObj=new TextColourType();
	
	int num=1;
	
	//System.out.println("\n\n\t\t\t\t"+"\u001B[1mModel"+"\t\t\t\t\t\t\tEx-showroom Price"+"\n"+myObj.reset);
	
	if(num>0) {
	while(rs.next()) {
		    System.out.println("\n\n\t\t\t"+rs.getString(1)+"\t\t\t\t\t"+rs.getString(2)+"\n");
			//System.out.println("\t\t\t\t"+"\u001B[1m"+rs.getString(1)+"\t\t\t\t\t"+rs.getString(2)+"\n");
			System.out.println("\t\t\t-----------------------------------------------------------------------");
		
	   }
	}
}
public void Phantomspecification() throws SQLException {
	
	String query = "Select * from Phantomspecification";
	Connection con = ModelsDbConnection.getConnection();
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(query);
	
	TextColourType myObj=new TextColourType();
	
	int num=1;
	
	//System.out.println("\n\n\t\t\t\t"+"\u001B[1mModel"+"\t\t\t\t\t\t\tEx-showroom Price"+"\n"+myObj.reset);
	
	if(num>0) {
	while(rs.next()) {
		    System.out.println("\n\n\t\t\t"+rs.getString(1)+"\t\t\t\t\t"+rs.getString(2)+"\n");
			//System.out.println("\t\t\t\t"+"\u001B[1m"+rs.getString(1)+"\t\t\t\t\t"+rs.getString(2)+"\n");
			System.out.println("\t\t\t-----------------------------------------------------------------------");
		
	   }
	}
}

}
