package csmjdbc;
import java.sql.SQLException;
import java.util.*;
class PhantomModelTextColour{
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
class PhantomContent{
	void content(){
		PhantomModelTextColour myObj=new PhantomModelTextColour();
	System.out.println("\n\n\t\t\t"+myObj.Bg_grey+"\t\t\t"+myObj.purple+"Home\t"+"\u001B[1m\t\tAbout  "+myObj.red+"\u001B[1m\t\tModels\t\t "+myObj.purple+"Logout\t\t\t"+myObj.reset);
	 System.out.println("\n\n\t\t\t\t\t\t\t\t  "+myObj.red+"\u001B[1m Phantom Model"+myObj.reset);
	
	System.out.println(myObj.black+"\n\n\t\t\t\u001B[1mRolls-Royce Phantom Price"+myObj.reset);
	System.out.println(myObj.black+"\n\n\t\t\t\t\tThe price of Rolls-Royce"+myObj.lightBlue+" \u001B[1mPhantom"+myObj.reset+" starts at Rs. 8.99 Cr and goes upto"
			+ "\n\t\t\t Rs. 10.48 Cr. Rolls-Royce Phantom is offered in 2 variants - the base model of Phantom is "
			
			+ "\n\t\t\t coupe and the top variant Rolls-Royce Phantom Extended Wheelbase which "
			+ "comes at a price tag of Rs. 10.48 Cr.");
	
	    specification();
	}
	void specification() {
		WraithModelTextColour myObj=new WraithModelTextColour();
		System.out.println(myObj.black+"\n\n\t\t\t\u001B[1mRolls-Royce Phantom Price"+myObj.reset);
		ModelsDAO modelsdao=new ModelsDAO();
		try {
			modelsdao.Phantomspecification();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

public class PhantomPage {

	public static void main(String[] args) {
		PhantomModelTextColour myObj=new PhantomModelTextColour();
		PhantomContent ghostcontent=new PhantomContent();
		ghostcontent.content();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\u001B[1mDo You want to order the car enter yes or no"+myObj.reset);
		String order=sc.next();
		
		if(order.equals("Yes")||order.equals("yes")) {
			OrderPage orderpage=new OrderPage();
			orderpage.main(args);
			ModelsPage model=new ModelsPage();
			try {
				model.main(args);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if(order.equals("No")||order.equals("no")) {
			ModelsPage model=new ModelsPage();
			try {
				model.main(args);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		else {
			System.out.println("\n\u001B[1mKindly check yes or no, visit models page"+myObj.reset);
			ModelsPage model=new ModelsPage();
			try {
				model.main(args);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		


	}

}
