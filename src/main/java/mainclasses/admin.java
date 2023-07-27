package mainclasses;

import java.util.Scanner;
import java.util.logging.Logger;

import org.junit.Assert;


public class admin {
	private static final Logger logger = Logger.getLogger(admin.class.getName());
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
			logger.info("Enter a for accept and r for reject ");
			logger.info("id"+"\t"+"picture"+"\t"+"rent" +"\t"+ "loication" +"\t" +"\t" +"bedrooms"+"\t"+"bathrooms"+"\t"+"floor"+"\n"+"services") ;
			for(Apartment ap : main.db_Apartment) {
				logger.info(ap.getId()+"\t");
				logger.info(ap.getPicture()+"\t");
				logger.info(ap.getRent()+"\t");
				logger.info(ap.getLocation()+"\t");
				logger.info(ap.getBedrooms()+"\t");
				logger.info(ap.getBathrooms()+"\t");
				logger.info(ap.getFloor());
			    if(ap.getWater().equals("yes")){
					logger.info("Water");
			    }
			    if(ap.getElectric().equals("yes")){
					logger.info("+Electricity");
			    }
			    if(ap.getInternet().equals("yes")){
					logger.info("+Internet"+"\n");
			    }
			    str = s.nextLine();
			    while(!str.equals("a") && !str.equals("r")) {
				    logger.info("invalid!");
			    	str = s.nextLine();
				    if(str.equals("a")) {
				    	ap.setAccept(true) ;
				    	main.requestAccepted = true ;
						Advertisment ad = new Advertisment(ap);
                        main.db_Advertisment.add(ad);
				    }
			    }
			}
			main.requestPrinted = true ;
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
		
	}


