package csmjdbc;

import java.util.*;

class textColour {
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






public class HomePage extends textColour {
           public static void main(String[] args) {
        	   
        	   
        	 System.out.println(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
             System.out.print(Bg_black+ "\t\t\t\t\t\t\t\t\t"+white + "\u001B[1mN e w   Season"+"   " +"N e w  Cars " +"\t\t\t\t\t\t\t\t\t\t\t\n"+Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n"+"\t\t\t\t\t\t\t-------------****-----------------------\t\t\t\t\t"
             +"\t\t\t\t\t"+Bg_black +"\t\n\t\t\t\t\t\t"+"Take You To "+red+"\033[3mIncredible\t\t\t\t\t\t\t\t\t\t\t\t\t\t\033[0m"+white +Bg_black+
             " \n\t\t\t\t\t\t\t\t"+ "Speed & Go Further"+"\t" + reset);
             System.out.println(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+reset);
             System.out.println(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+reset);
             //System.out.println(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+reset);
             System.out.println(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+reset);            
             
             
             
             System.out.println(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+reset);
             
             System.out.println(Bg_black+white+"\t\t\t\t\t\t"+"If you already have an account ?"+purple+"\u001B[1m Login " +white+ "to  view  the  Page "+"\t\t\t\t\t\t\t\t\t\t");
             System.out.println(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+reset);

             System.out.println(Bg_black+white+"\t\t\t\t\t\t\t\t"+yellow+"Or "+white+"New User ? "+" for "+purple+"\u001B[1mSign-up \t\t\t\t\t\t\t\t\t\t\t\t"+ reset);
             
             System.out.println(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+reset);

             
             
             System.out.println(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
             System.out.println(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
             System.out.println(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
           //System.out.println(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+reset);
            System.out.println(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+reset);
             
             //System.out.print("\u001B[1mEnter your Choice- "+reset);
             //String choice = val.nextLine();
           //System.out.print(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+reset);
           //System.out.print(Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+reset);
       
            int useropt=1;
            int n=1;
            Scanner scanner = new Scanner(System.in);
            
            while(n>0){
            	System.out.println("Enter 1 to "+"\u001B[1mLogin "+reset+"2 to "+"\u001B[1mSign-Up");
            	useropt=scanner.nextInt();
               if (useropt==1){ 
            	   LoginPage loginpage=new LoginPage();
            	   loginpage.main(args);
            	   n=0;
               }
               else if(useropt==2) {
            	   RegisterPage registerpage=new RegisterPage();
            	   registerpage.main(args);
            	   n=0;
               }
               else {
               System.out.println(red + "\u001B[1mPlease entered valid Choice" + reset);
               n=1;
            }
           }
            	  
            	   //System.out.println("Enter 1 to "+"\u001B[1mLogin "+reset+"2 to "+"\u001B[1mSign-Up");  
               
               
            }
           
}
             
       
           


            	
          
  


