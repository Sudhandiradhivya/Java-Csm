package csmjdbc;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class LoginColour{
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
}

class loginDetails{
	
	
void userNameValidation() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print( LoginColour.black+"\u001B[1mEnter Username-"+ LoginColour.reset);
		
		String usernameval=sc.nextLine();
		
		System.out.print( LoginColour.black+"\u001B[1mEnter Password-"+ LoginColour.reset);
		String passwordval=sc.nextLine();
		
		CarDAO cardao=new CarDAO();
		try {
			cardao.carInfo1(usernameval,passwordval);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}
}

public class LoginPage {

	public void main(String[] args) {
		loginDetails logindetails=new loginDetails();
		logindetails.userNameValidation();
		
	}

}
