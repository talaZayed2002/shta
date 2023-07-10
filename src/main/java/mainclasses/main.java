package mainclasses;

import java.util.Scanner;
import java.util.logging.Logger;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
public class main {
private static final Logger logger = Logger.getLogger(main.class.getName());
static Scanner s=new Scanner(System.in);
static int num ;
static String email="0";
static String password="0";
static String name="0";
static String major="0";
static String type="0";
static int age=0;
static admin admin1;
static user user1;
static owner owner1;
static database db;
static boolean valid ;
static boolean ynValid ; 

public static boolean yesNoValidation(String s){
	if( s.equals("yes") || s.equals("no")) {
		return true ;
	}
	else 
		return false ;
}


public static boolean containsOnlyDigits(String str) { 
    for (int i = 0; i < str.length(); i++) {
      if (!Character.isDigit(str.charAt(i))) { // in case that a char is NOT a digit, enter to the if code block
        return false;
      }
    }
	return true ; 
}


static void start1() {
	  logger.info(" \n"+"                                    HELLO\n"+
	  		      "                            WELCOME TO SAKANCOM \n"+
                  "                    Please choose your type: \n" +
			      "                    1-Admin \n"+
                  "                    2-Tenant\n"+
			      "                    3-Owner\n") ;
		
	    num=s.nextInt();
		switch(num)
		{
		case 1:
		{
			
			 logger.info("Please enter your email as admin"); 
				email=s.nextLine();
				email=s.nextLine();
				while(!(email.contains("@"))) {
					logger.info("Please this is not an invalid email\n reenter ur email"); 
					email=s.nextLine();
				}		
		     logger.info("\nPlease enter your password:"); 
		      	password=s.nextLine();
		      	
		    	admin1.check(email, password);
		 
			break;
		}// end case 1 for admin
		
		case 2:
		{ 
			logger.info("Please enter your email as tenant:"); 
		email=s.nextLine();
		email=s.nextLine();
		while(!(email.contains("@"))) {
			logger.info("Please this is not an invalid email\n reenter ur email"); 
			email=s.nextLine();
			user1.email=email;
			
		}		
      logger.info("\nPlease enter your password:"); 
      	password=s.nextLine();	
    	user1.checkuser(email, password);
      
       

    	ViewForTenant();
    	
    	
			break;
			
		}// end case 2 for tenant(user)
		
		case 3:
		{
		logger.info("Please enter your email as tenant:"); 
			email=s.nextLine();
			email=s.nextLine();
			while(!(email.contains("@"))) {
				logger.info("Please this is not an invalid email\n reenter ur email"); 
				email=s.nextLine();
			}		
	      logger.info("\nPlease enter your password:"); 
	      	password=s.nextLine();	
	    	int res= owner1.checkowner(email, password);	    	
	      //tala	    	
	      if (res !=1) {//new user 
	         owner ow = new owner ();             
             ow.email = email ; 
             ow.password= password ; 
	    
	    	 logger.info("Please enter your information:\n");		    
        	 logger.info("\nid:");
             String id =s.nextLine();
             valid = containsOnlyDigits(id);
             while(!valid) {
            	 id =s.nextLine();
            	 valid = containsOnlyDigits(id);
             }
             ow.id = id ; 
            
             logger.info("\nname:");
             String name =s.nextLine();
             ow.name = name ; 
             
             logger.info("\nphone:");
             String phone =s.nextLine();
             valid = containsOnlyDigits(id);
             while(!valid) {
            	 id =s.nextLine();
            	 valid = containsOnlyDigits(phone);
             }
             ow.phone = phone ; 
             
             logger.info("\naddress:");
             String address  =s.nextLine();
             ow.id = address ;                         
          }
	      
	      logger.info("1.Add new appratment:\n2.Dashboard:");
	      num = s.nextInt() ; 	      
          if(num == 1){
        	 Apartment ap = new Apartment(); 
        	 
        	 logger.info("photo link:");
             String p =s.nextLine();
             ap.picture = p ; 
             //validation
             
             
             logger.info("location:");
             String location =s.nextLine();
             ap.location = location ; 
             
             logger.info("rent:");
             String rent =s.nextLine();
             valid = containsOnlyDigits(rent);
             while(!valid) {
            	 rent=s.nextLine();
            	 valid = containsOnlyDigits(rent);
             }
             ap.rent = rent ;
             
             logger.info("services(only yes or no)");
            
             logger.info("water:");             
             String water  =s.nextLine();
             ynValid = yesNoValidation(water);
             while(!ynValid) {
                  water  =s.nextLine();
                 ynValid = yesNoValidation(water);

             }
             ap.water = water;

             
             logger.info("internet");     
             String internet  =s.nextLine();
             ynValid = yesNoValidation(internet);
             while(!ynValid) {
                  internet  =s.nextLine();
                  ynValid = yesNoValidation(internet);
             }
             ap.internet = internet;
             
           
             logger.info("electricety:");    
             String electricety  =s.nextLine();
             ynValid = yesNoValidation(electricety);
             while(!ynValid) {
             	  electricety  =s.nextLine();
                  ynValid = yesNoValidation(electricety);
             }
             ap.electric = electricety;
             
             logger.info("#bathrooms:");
             String bathrooms =s.nextLine();
             valid = containsOnlyDigits(bathrooms);
             while(!valid) {
            	 bathrooms=s.nextLine();
            	 valid = containsOnlyDigits(bathrooms);
             }
             ap.bathrooms = bathrooms ;
             
             logger.info("#bedrooms:");
             String bedrooms =s.nextLine();
             valid = containsOnlyDigits(bedrooms);
             while(!valid) {
            	 bedrooms=s.nextLine();
            	 valid = containsOnlyDigits(bedrooms);
             }
             ap.bedrooms = bedrooms ;
             
             /*
             logger.info("balcony: yes or no");
             String bedrooms =s.nextLine();
             valid = containsOnlyDigits(bedrooms);
             while(!valid) {
            	 bedrooms=s.nextLine();
            	 valid = containsOnlyDigits(bedrooms);
             }
             ap.bedrooms = bedrooms ;
*/
             
          }
          
          
          
       /*   
   	   int bathrooms;
   	   int berdooms;
   	   boolean balcony;
   	   String date;
      */
          
		
	      
	      
	      
	      
	    
	    	//tala	    
		
	    	
	    	
	    	
			break;
		} // end of case 3 for owner 
	
		default :
		{
			logger.info("The enteryis not correct!.");
		}//end default
		
			
		
		}//end switch
		
}// end start1 function
static void ViewForTenant() {
	logger.info("Please determine wheather u r a student or not \n 1-Student 2-Not a student"); 
     num=s.nextInt();
     switch(num) {
     case 1:
     {
    		logger.info("Hello student!\n"); 
    		
    		email=s.nextLine();
    		
    		
    		
 	 
    	 
     } //student
     case 2:
     {
    	 
     }//not student
     default:
     {
    	 
     }// otherwise
     }
	
}



public static void main(String[] args) 
{	
	start1();

		
}//end public static void main(String[] args) 



}// end main class 