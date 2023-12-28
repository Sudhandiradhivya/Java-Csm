package csmjdbc;

import java.util.Scanner;

class LogouttextColour {
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

class Content{
	void logout(){
	LogouttextColour logouttext=new LogouttextColour();
		
		
	System.out.println(logouttext.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
	System.out.println(logouttext.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
	System.out.println("t\t\t"+"\t\t\t"+logouttext.white+"Home\t"+"\u001B[1m\t\t\tAbout\t\t"+"\u001B[1m\t\tModels\t\t\t "+logouttext.purple+"Logout\t\t\t\t\t"+logouttext.reset);
    
	System.out.println(logouttext.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
	System.out.println(logouttext.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
	System.out.print(logouttext.Bg_black+ "\t\t\t\t\t\t\t\t\t"+logouttext.white + "\u001B[1mN e w   Season"+"   " +"N e w  Cars " +"\t\t\t\t\t\t\t\t\t\t\t\n"+logouttext.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n"+"\t\t\t\t\t\t\t-------------****-----------------------\t\t\t\t\t"
    +"\t\t\t\t\t"+logouttext.Bg_black +"\t\n\t\t\t\t\t\t"+"Take You To "+logouttext.red+"\033[3mIncredible\t\t\t\t\t\t\t\t\t\t\t\t\t\t\033[0m"+logouttext.white +logouttext.Bg_black+
    " \n\t\t\t\t\t\t\t\t"+ "Speed & Go Further"+"\t" +logouttext. reset);
    System.out.println(logouttext.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+logouttext.reset);
    System.out.println(logouttext.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+logouttext.reset);
    //System.out.println(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+logouttext.reset);
    System.out.println(logouttext.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+logouttext.reset);            
    
    
    
    System.out.println(logouttext.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+logouttext.reset);
    
    System.out.println(logouttext.Bg_black+logouttext.white+"\t\t\t\t\t\t"+"If you already have an account ?"+logouttext.purple+"\u001B[1m Login " +logouttext.white+ "to  view  the  Page "+"\t\t\t\t\t\t\t\t\t\t");
    System.out.println(logouttext.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+logouttext.reset);

    System.out.println(logouttext.Bg_black+logouttext.white+"\t\t\t\t\t\t\t\t"+logouttext.yellow+"Or "+logouttext.white+"New User ? "+" for "+logouttext.purple+"\u001B[1mSign-up \t\t\t\t\t\t\t\t\t\t\t\t"+ logouttext.reset);
    
    System.out.println(logouttext.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+logouttext.reset);

    
    
    System.out.println(logouttext.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    System.out.println(logouttext.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    System.out.println(logouttext.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
  //System.out.println(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+reset);
   System.out.println(logouttext.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+logouttext.reset);
    
    //System.out.print("\u001B[1mEnter your Choice- "+reset);
    //String choice = val.nextLine();
  //System.out.print(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+reset);
  //System.out.print(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+reset);
}
}
public class LogoutPage {

	public static void main(String[] args) {
		
		Content content=new Content();
		content.logout();
		
		LogouttextColour logouttext=new LogouttextColour();
		  
   	 
  
       int useropt=1;
       int n=1;
       Scanner scanner = new Scanner(System.in);
       
      
       	System.out.println("Enter 1 to "+"\u001B[1mLogin "+logouttext.reset+"2 to "+"\u001B[1mSign-Up");
       	useropt=scanner.nextInt();
          if (useropt==1){ 
       	   LoginPage loginpage=new LoginPage();
       	   loginpage.main(args);
       	  
          }
          else if(useropt==2) {
       	   RegisterPage registerpage=new RegisterPage();
       	   registerpage.main(args);
       	  
          }
          else {
          System.out.println(logouttext.red + "\u001B[1mPlease entered valid Choice" +logouttext. reset);
         
       }
      }
       	  
       	   //System.out.println("Enter 1 to "+"\u001B[1mLogin "+reset+"2 to "+"\u001B[1mSign-Up");  
          
          
       }

	


