package csmjdbc;

import java.sql.SQLException;
import java.util.Scanner;

class ModelTextColour{
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

class ModelContent{
	
	void content(){
	ModelTextColourType myObj=new ModelTextColourType();
	
	System.out.println("\n\n\t\t\t"+myObj.Bg_grey+"\t\t\t"+myObj.purple+"Home\t"+"\u001B[1m\t\tAbout  "+myObj.red+"\u001B[1m\t\tModels\t\t "+myObj.purple+"Logout\t\t\t"+myObj.reset);
	 System.out.println("\n\n\t\t\t\t\t\t\t\t  "+myObj.red+"\u001B[1m Models"+myObj.reset);
	 
	 System.out.println("\n\n\t\t\u001B[1m ROLLS-ROYCE CARS"+myObj.reset);
	 System.out.println("\t\t\t\t\t\t\t\t\t"+"\n\n\t\t\t"+myObj.black+"There are a total of 5 Rolls-Royce models currently on sale in India.These include "+"\n\t\t\tCoupe, 1 SUV, 2 Sedans and 1 Convertible. Rolls-Royce has 1 upcoming car launches in India"
	 		+"\n\t\t\tthe Rolls-Royce Spectre."
				+ "The company's line of vehicles includes the Phantom, a four- door"+"\n\t\t\tsaloon first offered in 2003 as well as its extended wheelbase two-door coupe convertible"+"\n\t\t\tvariants; "
				+ "the smaller Ghost four-door saloon; Wraith two-door coupe; Dawn convertible; "
				+ "\n\t\t\tthe Cullinan SUV, and the forthcoming 2023 Spectre.");
	 
	 
	 System.out.println("\n\n\t\t\u001B[1m ROLLS-ROYCE CAR PRICES IN INDIA"+myObj.reset);
	 
	 System.out.println("\t\t\t\t\t\t\t\t\t"+"\n\n\t\t\t"+myObj.black+"The price of Rolls-Royce cars in India starts from Rs. 6.22 Cr for the Rolls Royce"+"\n\t\t\tWraith while the most expensive Rolls-Royce car in India one is the Phantom "
		 		+"\n\t\t\twith a price of Rs. 10.48 Cr.The newest model in the Rolls-Royce line-up is the Ghost with a"
					+"\n\t\t\tprice tag of Rs. 6.95 - 7.95 Cr. The current lineup of Rolls-Royce India includes Cullinan,"+"\n\t\t\tRolls Royce Dawn, Ghost, Phantom and Rolls Royce Wraith. ");
	 
	 
	}
}
public class ModelsPage {

	public static void main(String[] args) throws SQLException {
		ModelContent modelcontent=new ModelContent();
		modelcontent.content();
		
		ModelsDAO modelsdao=new ModelsDAO();
		modelsdao.displayInfo();
		
		ModelTextColourType myObj=new ModelTextColourType();
		
		Scanner page=new Scanner(System.in);
		System.out.println(myObj.black+"\u001B[1m\nDo you want to know  more details please enter model name or enter exit "+myObj.reset);
		
		String model=page.next();
		if(model.equals("Cullinan")||model.equals("cullinan")) {
			CullinanPage cullinan=new CullinanPage();
			CullinanPage.main(args);
		}
		
		else if(model.equals("Phantom")||model.equals("phantom")) {
			PhantomPage phantom=new PhantomPage();
			phantom.main(args);
		}
		else if(model.equals("Wraith")||model.equals("wraith")) {
			WraithPage wraith=new WraithPage();
			wraith.main(args);
		}
		else if(model.equals("Ghost")||model.equals("ghost")) {
			GhostPage ghost=new GhostPage();
			ghost.main(args);
		}
		else if(model.equals("Dawn")||model.equals("dawn")) {
			DawnPage dawn=new DawnPage();
			dawn.main(args);
		}
		else if(model.equals("exit")||model.equals("Exit")){
			Index index=new Index();
			index.main(args);
		}
		else {
			 System.out.println("Kindly check the model name in models page");
			 
			 
		}
		
		System.out.println(myObj.purple+"=>\t\t\t If you want to visit Homepage press "+myObj.green+"\u001B[1m1"+myObj.reset);
		System.out.println(myObj.purple+"=>\t\t\tAboutpage press "+myObj.green+"\u001B[1m2"+myObj.reset);
		 System.out.println(myObj.purple+"=>\t\t\t Modelspage press "+myObj.green+"\u001B[1m3"+myObj.reset);
		 System.out.println(myObj.purple+"=> \t\t\tLogout press "+myObj.green+"\u001B[1m4"+myObj.reset);
		 System.out.println(myObj.black+"\n\u001B[1mPlease enter the number to visit the page: "+myObj.reset);
		
		
		 int number;
		 number=page.nextInt();
		 int num=1;
		 
		
		 if(number==1) {
			 Index index=new Index();
			 index.main(args);
			 
			
		 }else if(number==2){
			 AboutPage  about=new AboutPage ();
			 about.main(args);
			 
		 }else if(number==3) {
			 ModelsPage modelspage=new ModelsPage();
			 modelspage.main(args);
			 
		 }
		 else if(number==4) {
			 LogoutPage logout=new LogoutPage();
			 logout.main(args);
		 }
		 else {
			 System.out.println("Kindly check the valid number in Home page");
			 
			 
			 
		 }
		 }
	}


