package csmjdbc;
import java.sql.SQLException;
import java.util.Scanner;

import csmjdbc.HomePage;

class Colourtype{
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
public class Index {
	

	public static void main(String[] args) {
		Colourtype myObj=new Colourtype();
		
		 System.out.println("\n\t\t\t"+"\t\t"+myObj.red+"\u001B[1mHome\t"+myObj.purple+"\u001B[1m\t\tAbout\t\tModels\t\tContact-us\t Logout\t\t"+myObj.reset);
		 System.out.println("\n\n\t\t\t\t\t\t\t  "+myObj.orange+"  \u001B[1m THE WIND IS NOT EVEN CLOSE TO US  "+myObj.reset);
		 //System.out.print(myObj.red + "\n\t\t\t\t\t\t\tWELCOME TO OUR MUSICAL STORE"+myObj.reset);
		// System.out.println(myObj.darkBlue+"\n\n\t\t\t\t\t\t\t   From Starters To Pro.."+myObj.reset);
		 System.out.println("\t\t\t\t\t\t\t\t\t"+"\n\n\t\t\t\t\t"+myObj.darkBlue+"\u001B[1mLimited time offer for only new customer\n\n\t\t\t\t\t\t \u001B[1malso get free shipping orders.");
		 System.out.println("\n\t\t\t\t\t\t\t\t"+myObj.Bg_yellow+"\t"+myObj.red+" SHOP NOW  "+myObj.reset);
		 //System.out.print(myObj.orange + "\n\t\t\t\t\t\t\t\u001B[1mGet 25% Off to our products"+myObj.reset);
		 
		 
		 System.out.println(myObj.black+"\n\n=>\u001B[1m If you want to see the Aboutpage press "+myObj.red+"\u001B[1m2"+myObj.reset);
		 System.out.println(myObj.black+"=>\t\t\t\u001B[1mModelspage press "+myObj.red+"\u001B[1m3"+myObj.reset);
		 //System.out.println(myObj.yellow+"=>  contact-us page press "+myObj.green+"\u001B[1m4"+myObj.reset);
		 System.out.println(myObj.black+"=> \t\t\t\u001B[1mLogout press "+myObj.red+"\u001B[1m4"+myObj.reset);
		 System.out.println(myObj.black+"\n\u001B[1mPlease enter the number to visit the page: "+myObj.reset);
		 Scanner page=new Scanner(System.in);
		 int number;
		 number=page.nextInt();
		 if(number==2){
			 AboutPage  about=new AboutPage ();
			 try {
				about.main(args);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 }else if(number==3) {
			 ModelsPage modelspage=new ModelsPage();
			 try {
				modelspage.main(args);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 }
		 else if(number==4) {
			 LogoutPage logout=new LogoutPage();
			 logout.main(args);
		 }
		 else {
			 System.out.println("Kindly check the valid number in Home page");
			 Index index=new Index();
			 index.main(args);
			 
		 }

	}

}
