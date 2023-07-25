package mainclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;


public class admin {
	private static final Logger logger = Logger.getLogger(admin.class.getName());
    static List <owner> db_Advertisment=new  ArrayList <owner> ();

		 String address;
		 public String email;
		 String name;
		 String id;
		 public String password;
		 String phone;

		public static int check(String string1, String string2) {
            if((string1.equals("shafiqa@gmail.com") && string2.equals("shafiqa123")) ||(string1.equals("tala@gmail.com") && string2.equals("tala1234")) )
            {	
			    logger.info("\n u logged in sucessfully as admain"); 
				return 1;	
            }
            else {
    	        logger.info("\n admin please try again"); 
    	        return 0;
        }
		}
		public static void viewRequests() {
			Scanner s = new Scanner(System.in);
			String str ;
			logger.info("Enter" +"a" +" for accept and "+ "r" + "for reject");
			
			for(Apartment ap : main.db_Apartment) {
				/*  if(ap.getWater().equals("yes")){
						ap.setWater("yes");
				    }
				    if(ap.getElectric().equals("yes")){
				    	ap.setElectric("yes");
				    }
				    if(ap.getInternet().equals("yes")){
				    	ap.setInternet("yes");
				    }*/
	logger.info("| --------------------------------------------------------------------------------------------------- |"+"\n"+
	            "|id-building"+" buliding name"+" picture"+" rent"+ " location" +" bedrooms"+" bathrooms"+" floor"+" Balcony"+"\n"+
		         "|                                                                                                     |"+"\n"+
		        "|   " +ap.getBuildingId()+"       "+ ap.getName()+"     "+ ap.getPicture()+"    "+ ap.getRent()+""+ap.getLocation()+"    "+ap.getBedrooms()+"     "+ap.getBathrooms()+
		        "     "  +  ap.getFloor()+"  "+ ap.getBalcony()+	
		        "                           |" + "\n"+ "Services :" +"Water:"+ap.getWater()+" , Electric : "+ap.getElectric()+" , Internet : "+ap.getInternet()+"\n"+
		         "|                                                                                                     |"+"\n"
	  
		       + "| --------------------------------------------------------------------------------------------------- |"+"\n");
			  
			    
	         logger.info("to accept it or reject it first enter as an admin: , write the word(admin)");
			    str = s.nextLine();
			    
			    if(str.equals("admin")) 
			    {
			    	main.ViewAdmin();
			    	
		      logger.info("\n now u can refused or accept it"+"\n");
			    str = s.nextLine();
			    while(!str.equals("a") && !str.equals("r")) {
				    logger.info("invalid!");
				    }
		                  	
			    if(str.equals("a")) 
			    {
			    
			         ap.setAccept(true);
			            logger.info("Accepted !!,now enter as an admin to book , please enter the word:  "+ "tenant"+"\n");
					    str = s.nextLine();
			          if (str.equals("tenant")) {
			        	main.TenantStart(); 
			        	
			        	 
			         }
			    }
			    
			     
			    
			    else if (str.equals("r"))
			    {	
			    	logger.info("Refused,try to request again ");
	                 Apartment.addApartment();
	                 Apartment.viewDashboard();

			    	
			    }
			    else {
			    	logger.info("try again!");

	        	 
	         }
			    }
			    else {
			    	logger.info("try again!");
			    	}
				  
				    	/*for(int i=0;i<main.db_Apartment.size();i++) {
		                      logger.info(main.db_Apartment.get(i).getRent());
				    	}*/
    	//view all the information
				    }
			    			
		
		}
}
		/*public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		
		
		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}*/
		



