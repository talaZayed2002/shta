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
	      
			   
				    	/*for(int i=0;i<main.db_Apartment.size();i++) {
		                      logger.info(main.db_Apartment.get(i).getRent());
				    	}*/
    	//view all the information
				    }
			
			   main.ViewAdminMenu1();			
		
		}
		
		
		
		
		
		public static void viewRequestsForAdmin() {
	
			  Apartment apart1=new Apartment();

				apart1.setBuildingId("5");
			    apart1.setName("Abu Salha");
			    apart1.setPicture("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.apartments.com%2Fblog%2Fwhat-is-a-luxury-apartment&psig=AOvVaw2mUHZKPS8Wd2_lmV74uosq&ust=1690538402290000&source=images&cd=vfe&opi=89978449&ved=0CA0QjRxqFwoTCICH27rQroADFQAAAAAdAAAAABAD");
			    apart1.setRent("700 $");
			    apart1.setLocation("Nablus");
			    apart1.setFloor("5");
			    apart1.setBalcony("no");
			    apart1.setWater("yes");
			    
			    apart1.setElectric("yes");
			    
			    apart1.setnameـtenant("jebreel");
			    apart1.setStudentMajor("CAP");
			    apart1.setage_tenant("21");
			    
			    
				  Apartment apart0=new Apartment();

					apart0.setBuildingId("5");
				    apart0.setName("Abu Salha");
				    apart0.setPicture("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.apartments.com%2Fblog%2Fwhat-is-a-luxury-apartment&psig=AOvVaw2mUHZKPS8Wd2_lmV74uosq&ust=1690538402290000&source=images&cd=vfe&opi=89978449&ved=0CA0QjRxqFwoTCICH27rQroADFQAAAAAdAAAAABAD");
				    apart0.setRent("700 $");
				    apart0.setLocation("Nablus");
				    apart0.setFloor("5");
				    apart0.setBalcony("no");
				    apart0.setWater("yes");
				    
				    apart0.setElectric("yes");
				    
				    apart0.setnameـtenant("Saleh");
				    apart0.setStudentMajor("Art");
				    apart0.setage_tenant("20");
				    apart0.setInternet("no");
				    
				    main.db_Apartment.add(apart0);
			
				Apartment apart=new Apartment();
				apart.setBuildingId("4");
			    apart.setName("Alool-Abu Salha");
			    apart.setPicture("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.apartments.com%2Fblog%2Fwhat-is-a-luxury-apartment&psig=AOvVaw2mUHZKPS8Wd2_lmV74uosq&ust=1690538402290000&source=images&cd=vfe&opi=89978449&ved=0CA0QjRxqFwoTCICH27rQroADFQAAAAAdAAAAABAD");
			    apart.setRent("1000 $");
			    apart.setLocation("Nablus-Rafidia");
			    apart.setFloor("4");
			    apart.setBalcony("yes");
			    apart.setWater("yes");
			    apart.setElectric("yes");
			    apart.setInternet("yes");
			    apart.setnameـtenant("khalid");
			    apart.setStudentMajor("Medecine");
			    apart.setage_tenant("23");
			    
			    
				   main.db_Apartment.add(apart);
				   
				  
				    apart1.setInternet("no");
				    
				   main.db_Apartment.add(apart1);

			for(Apartment ap : main.db_Apartment) {
			
				Scanner s = new Scanner(System.in);
	   
			
			 logger.info("| --------------------------------------------------------------------------------------------------- |"+"\n"+
			            "|id-building"+" buliding name"+" picture"+" rent"+ " location" +" bedrooms"+" bathrooms"+" floor"+" Balcony"+"\n"+
				         "|                                                                                                     |"+"\n"+
				        "|   " +ap.getBuildingId()+"       "+ ap.getName()+"     "+ ap.getPicture()+"    "+ ap.getRent()+""+ap.getLocation()+"    "+ap.getBedrooms()+"     "+ap.getBathrooms()+
				        "     "  +  ap.getFloor()+"  "+ ap.getBalcony()+	
				        "                           |" + "\n"+ "Services :" +"Water:"+ap.getWater()+" , Electric : "+ap.getElectric()+" , Internet : "+ap.getInternet()+"\n"+
				         "|                                                                                                     |"+"\n"
			  
				       + "| --------------------------------------------------------------------------------------------------- |"+"\n"+"|                                                                                                     |"+"\n"+
"|   " +apart.getBuildingId()+"       "+ apart.getName()+"     "+ apart.getPicture()+"    "+ apart.getRent()+""+apart.getLocation()+"    "+apart.getBedrooms()+"     "+apart.getBathrooms()+
"     "  +  apart.getFloor()+"  "+ apart.getBalcony()+	
"                           |" + "\n"+ "Services :" +"Water:"+apart.getWater()+" , Electric : "+apart.getElectric()+" , Internet : "+apart.getInternet()+"\n"+
"|                                                                                                     |"+"\n"

+ "| --------------------------------------------------------------------------------------------------- |"+"\n"
			 
	+ "|                                                                                                     |"+"\n"+
	 "|   " +apart1.getBuildingId()+"       "+ apart1.getName()+"     "+ apart1.getPicture()+"    "+ apart1.getRent()+""+apart1.getLocation()+"    "+apart1.getBedrooms()+"     "+apart1.getBathrooms()+
	 "     "  +  apart1.getFloor()+"  "+ apart1.getBalcony()+	
	 "                           |" + "\n"+ "Services :" +"Water:"+apart1.getWater()+" , Electric : "+apart1.getElectric()+" , Internet : "+apart1.getInternet()+"\n"+
	  "|                                                                                                     |"+"\n"

	+ "| --------------------------------------------------------------------------------------------------- |"+"\n");
			 
			 
			 
			 break;
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
		



