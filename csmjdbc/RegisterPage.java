package csmjdbc;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



class Colour{
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



class registerDetails{
	String username,Password,Email,ConfirmPassword;
	
	
	
	void userNameValidation() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print(Colour.black+"\u001B[1mEnter Username-"+Colour.reset);
		
		String usernameval=sc.nextLine();
		Pattern userNameRegex = Pattern.compile("^(?!.*(.).*\\1\\1)[a-zA-Z]{3,20}$");
		Matcher userNameMatches = userNameRegex.matcher(usernameval);
		
		if(usernameval.isEmpty()) {
			System.out.println(Colour.red + "\u001B[1mUsername is not Empty" + Colour.reset);
			userNameValidation();
			} 
		  else if (!userNameMatches.matches()) {
			  System.out.println(Colour.red+ "\t\t\u001B[1mEnter Valid Username : \n\t* Username only containAlphabets, \n\t* Minimum of 3 digits, \n\t* 2 similar consecutive characters only allowed, \n\t* No Spaces allowed"+Colour.reset);
					  userNameValidation();
		  } else {
			  System.out.println(Colour.green + "\u001B[1mCorrect" +Colour.reset);
			  username = usernameval;
			  emailValidation();
			  }
		
	}
	
	void emailValidation() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(textColour.black + "\n\u001B[1mEnter Email  - " + textColour.reset);
		
		String emailval = sc.nextLine();
		
		Pattern emailRegex = Pattern.compile("^[0-9a-z]+[._]{0,1}[0-9a-z]+[@][a-zA-Z]+[.][a-zA-Z]{2,3}([.][a-zAZ]{2,3}){0,1}$");
		
		Matcher emailMatches = emailRegex.matcher(emailval);
		
		if (emailval.isEmpty()) {
			
		      System.out.println(textColour.red + "\u001B[1mEmail is not Empty" + textColour.reset);
		      emailValidation();
		
		}
		
		else if (!emailMatches.matches()) {
		     System.out.println(textColour.red + "\t\t\u001B[1mEnter Valid Email : email only in dhivya@gmail.com this format" + textColour.reset);
		     emailValidation();
		} 
		else {
			
		     System.out.println(textColour.green + "\u001B[1mCorrect" + textColour.reset);
		     Email = emailval;
		     passwordValidation();
		}
		}
	
	
	
	void passwordValidation() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(textColour.black + "\n\u001B[1mEnter Password  - " + textColour.reset);
		
		String passwordval = sc.nextLine();
		
		Pattern passwordRegex = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).{6,12}$");
		Matcher passwordMatches = passwordRegex.matcher(passwordval);
		
		if (passwordval.isEmpty())
		{
			System.out.println(textColour.red + "\u001B[1mpassword is not Empty" + textColour.reset);
		    passwordValidation();
		} 
		else if (!passwordMatches.matches()) 
		{
		     System.out.println(textColour.red+ "\u001B[1mEnter Valid password : \nPassword must Contains :- \n\t* Atleast 6 Digits, \n\t* Minimum 1 Alphabets should be contain, \n\t* Minimum 1 Numbers, \n\t* Atleast 1 Special Characters"+ textColour.reset);
		     passwordValidation();
		} 
		else {
		     System.out.println(textColour.green + "\u001B[1mCorrect" + textColour.reset);
		     Password= passwordval;
		confirmPasswordValidation();
		}
		
		
}
	
	
		void confirmPasswordValidation() {
			
			
		Scanner sc= new Scanner(System.in);
		System.out.print(textColour.black+ "\n\u001B[1mEnter Confirm Password  - " + textColour.reset);
		String confirmPasswordval = sc.nextLine();
		
		if (confirmPasswordval.isEmpty()) 
		{
		       System.out.println(textColour.red + "\u001B[1mConfirm password is not Empty" + textColour.reset);
		       confirmPasswordValidation();
		} 
		else if (!confirmPasswordval.equals(Password)) {
		      System.out.println(textColour.red + "\u001B[1mConfirm password must same as Password" + textColour.reset);
		      confirmPasswordValidation();
		} 
		else 
		{
		      System.out.println(textColour.green + "\u001B[1mCorrect" + textColour.reset);
		       ConfirmPassword=confirmPasswordval;
		      insertData();
		}
	}
		
		void insertData(){
			
			if (username.equalsIgnoreCase("admin"))
			{
			      System.out.println(textColour.red + "\n Admin name is not allowed, Please Try Other Username!!" + textColour.reset);
			      userNameValidation();
			} 
			else {
			     String query = "insert into registerDetails values(" + "'" + username + "','" + Email+ "','"+ Password+ "','" + ConfirmPassword + "')";
				 CarDAO cardao=new CarDAO();
				try {
					cardao.carInfo(query);
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				
				
			}
			}
	}

public class RegisterPage {

	public void main(String[] args) {
		registerDetails register= new registerDetails();
		register.userNameValidation();
		System.out.println("Register Successfull..");
		System.out.println("Redirect to Login page");
		LoginPage loginpage=new LoginPage();
 	   loginpage.main(args);
		
	}

}
