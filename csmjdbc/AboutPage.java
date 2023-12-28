package csmjdbc;

import java.sql.SQLException;
import java.util.*;

class TextColourType{
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
class AboutContent{
	
	void content(){
	TextColourType myObj=new TextColourType();
	
	System.out.println("\n\n\t\t\t"+myObj.Bg_grey+"\t\t\t"+myObj.purple+"\u001B[1mHome\t"+myObj.red+"\u001B[1m\t\tAbout  "+myObj.purple+"\u001B[1m\t\tModels\t\t Logout\t\t\t"+myObj.reset);
	 System.out.println("\n\n\t\t\t\t\t\t\t\t  "+myObj.red+"\u001B[1mAbout Us"+myObj.reset);
	System.out.println("\t\t\t\t\t\t\t\t\t"+"\n\n\t\t\t"+myObj.black+"Rolls-Royce Motor Cars Limited is a British luxury automobile maker which has operated "+"\n\t\t\tas a wholly "
			+ "owned subsidiary of BMW AG since 2003 as the exclusive manufacturer of Rolls-"+"\n\t\t\tRoyce-branded motor cars."
			+ "The company's line of vehicles includes the Phantom, a four- door"+"\n\t\t\tsaloon first offered in 2003 as well as its extended wheelbase two-door coupe convertible"+"\n\t\t\tvariants; "
			+ "the smaller Ghost four-door saloon; Wraith two-door coupe; Dawn convertible; "
			+ "\n\t\t\tthe Cullinan SUV, and the forthcoming 2023 Spectre.");
	
	System.out.println("\n\n\t\t\t\t\t\t\tThe first all-electric Rolls-Royce. In 1998,"
			+ " Vickers decided"+"\n\t\t\t\t\t\t\tto sell Rolls-Royce Motors. "
			+ "The most likely buyer was BMW,"+"\n\t\t\t\t\t\t\twhich already supplied engines and other components for"
			+ " Rolls-Royce"+"\n\t\t\t\t\t\t\tand Bentley cars, but BMW's final offer of £340 million was beaten "
			+ "\n\t\t\t\t\t\t\tby Volkswagens £430 million ($703 million).");
	
	System.out.println("\t\t\t\t\t\t\t\t\t"+"\n\n\t\t\t"+myObj.black+"Rolls-Royce Motor Cars Limited is a British luxury automobile maker which has operated "+"\n\t\t\tas a wholly "
			+ "owned subsidiary of BMW AG since 2003 as the exclusive manufacturer of Rolls-"+"\n\t\t\tRoyce-branded motor cars."
			+ "The company's line of vehicles includes the Phantom, a four- door"+"\n\t\t\tsaloon first offered in 2003 as well as its extended wheelbase two-door coupe convertible"+"\n\t\t\tvariants; "
			+ "the smaller Ghost four-door saloon; Wraith two-door coupe; Dawn convertible; "
			+ "\n\t\t\tthe Cullinan SUV, and the forthcoming 2023 Spectre.");
}
}

class AboutPage {
    // Ensure the image path is correct, starting with a slash
   

    public static void main(String[] args) throws SQLException {
    	AboutContent aboutcontent=new AboutContent();
    	aboutcontent.content();
    	
    	TextColourType myObj=new TextColourType();
    	
    	System.out.println(myObj.purple+"\n\n=>\u001B[1m If you want to see the Homepage press "+myObj.yellow+"\u001B[1m1"+myObj.reset);
		 System.out.println(myObj.purple+"=>\t\t\t\u001B[1mModelspage press "+myObj.yellow+"\u001B[1m3"+myObj.reset);
		 //System.out.println(myObj.yellow+"=>  contact-us page press "+myObj.green+"\u001B[1m4"+myObj.reset);
		 System.out.println(myObj.purple+"=> \t\t\t\u001B[1mLogout press "+myObj.yellow+"\u001B[1m4"+myObj.reset);
		 System.out.println(myObj.black+"\n\u001B[1mPlease enter the number to visit the page: "+myObj.reset);
    	
    	Scanner page=new Scanner(System.in);
		 int number;
		 number=page.nextInt();
		 if(number==4) {
			 LogoutPage logout=new LogoutPage();
			 logout.main(args);
		 }else if(number==3) {
			 ModelsPage modelspage=new ModelsPage();
			 modelspage.main(args);
		 }
		 else if(number==1) {
			 Index index=new Index();
			 index.main(args);
		 }
		 else {
			 System.out.println("Kindly check the valid number in Home page");
			 
		 }
    	 
    }
}
