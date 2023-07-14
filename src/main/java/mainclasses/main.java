package mainclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
 

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
static boolean buildingExists ;
static List <Apartment> apartmentList = new ArrayList <Apartment> ();
static List <Building> buildingList   = new ArrayList <Building> ();
static List <owner> ownerList   = new ArrayList <owner> ();





public static boolean idAndPhoneValidator(String idAndPhone)
{
	if(!digitsValidator(idAndPhone)) {
		return false ;
	}
	if(idAndPhone.length() !=10) {
		return false ;
	}  
	return true ;
}

public static boolean urlValidator(String url)
{
    try {
        new URL(url).toURI();
        return true;
    }
    catch (URISyntaxException exception) {
        return false;
    }
    catch (MalformedURLException exception) {
        return false;
    }
}

public static boolean yesNoValidator(String str){
	if( s.equals("yes") || s.equals("no")) {
		return true ;
	}
	else 
		return false ;
}

public static boolean digitsValidator(String str) { 
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
             valid = idAndPhoneValidator(id);
             while( !valid ) {
            	 logger.info("invalid phone number !");
            	 id =s.nextLine();
            	 valid = idAndPhoneValidator(id);
             }
             ow.id = id ; 
            
             logger.info("\nname:");
             String name =s.nextLine();
             ow.name = name ; 
             
             logger.info("\nphone number:");
             String phone =s.nextLine();
             valid = idAndPhoneValidator(phone);
             while( !valid ) {
            	 logger.info("invalid phone number !");
            	 phone =s.nextLine();
            	 valid = idAndPhoneValidator(phone);
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
        	 
             logger.info("Appartment id:");
             String apartmentId =s.nextLine();
             valid = digitsValidator(apartmentId);
             while(!valid) {
            	 logger.info("invalid rent !");
            	 apartmentId=s.nextLine();
            	 valid = digitsValidator(apartmentId);
             }
             ap.id = apartmentId ;
         	 
        	 
        	 logger.info("photo link:");
             String picture =s.nextLine();
             valid = urlValidator(picture);     
             while(!valid) {
            	 logger.info("invalid link !");
            	 picture =s.nextLine();
            	 valid = urlValidator(picture);     
             }
             ap.picture = picture ; 

             
             logger.info("location:");
             String location =s.nextLine();
             ap.location = location ; 
             
             logger.info("rent:");
             String rent =s.nextLine();
             valid = digitsValidator(rent);
             while(!valid) {
            	 logger.info("invalid rent !");
            	 rent=s.nextLine();
            	 valid = digitsValidator(rent);
             }
             ap.rent = rent ;
             
             logger.info("services(only yes or no)\n");
            
             logger.info("water:");             
             String water  =s.nextLine();
             ynValid = yesNoValidator(water);
             while(!ynValid) {
            	 logger.info("invalid !");
                  water  =s.nextLine();
                 ynValid = yesNoValidator(water);

             }
             ap.water = water;

             
             logger.info("internet");     
             String internet  =s.nextLine();
             ynValid = yesNoValidator(internet);
             while(!ynValid) {
            	 logger.info("invalid !");
                  internet  =s.nextLine();
                  ynValid = yesNoValidator(internet);
             }
             ap.internet = internet;
             
           
             logger.info("electricety:");    
             String electricety  =s.nextLine();
             ynValid = yesNoValidator(electricety);
             while(!ynValid) {
            	 logger.info("invalid !");
             	  electricety  =s.nextLine();
                  ynValid = yesNoValidator(electricety);
             }
             ap.electric = electricety;
             
             logger.info("#bathrooms:");
             String bathrooms =s.nextLine();
             valid = digitsValidator(bathrooms);
             while(!valid) {
            	 logger.info("invalid !");
            	 bathrooms=s.nextLine();
            	 valid = digitsValidator(bathrooms);
             }
             ap.bathrooms = bathrooms ;
             
             logger.info("#bedrooms:");
             String bedrooms =s.nextLine();
             valid = digitsValidator(bedrooms);
             while(!valid) {
            	 logger.info("invalid !");
            	 bedrooms=s.nextLine();
            	 valid = digitsValidator(bedrooms);
             }
             ap.bedrooms = bedrooms ;
                          
             logger.info("balcony:yes or no");
             String balcony =s.nextLine();
             ynValid = yesNoValidator(balcony);
             while(!ynValid) {
            	 logger.info("invalid !");
             	 balcony  =s.nextLine();
                 ynValid = yesNoValidator(balcony);
             }
             ap.balcony = balcony ;
             
             logger.info("floor:");
             String floor  =s.nextLine();
             valid = digitsValidator(floor);
             while(!valid) {
                logger.info("invalid !");
            	 floor=s.nextLine();
            	 valid = digitsValidator(floor);
             }
             ap.floor= floor ; 

             logger.info("number of apartments in the floor:");
             String numberOfAppartments =s.nextLine();
             valid = digitsValidator( numberOfAppartments);
             while(!valid) {
            	 logger.info("invalid !");
            	 numberOfAppartments = s.nextLine();
            	 valid = digitsValidator( numberOfAppartments);
             }
             ap.numberOfApartmentsInFloor=  numberOfAppartments ;
             
             apartmentList.add(ap);

             //inforamation for building
             logger.info("building id:");
             String buildingId =s.nextLine();
             valid = digitsValidator(buildingId);
             while(!valid) {
            	 logger.info("invalid !");
            	 buildingId=s.nextLine();
            	 valid = digitsValidator(buildingId);
             }            
             ap.buildingId = buildingId ; 
 
             logger.info("building name:");
             String buildingName =s.nextLine();

             logger.info("building floors:");
             String buildingFloors =s.nextLine();
             valid = digitsValidator(buildingFloors);
             while(!valid) {
            	 logger.info("invalid !");
            	 buildingFloors=s.nextLine();
            	 valid = digitsValidator(buildingFloors);
             }            
    
            // check if the building in the array list
             buildingExists = false;
             for (Apartment a :  apartmentList  ) {
                 if (a.buildingId.equals(buildingId)) {
                	 buildingExists = true;
                     break;
                 }
             }
            if(!buildingExists) {
             Building bu = new Building();

             bu.buildingId =buildingId ; 

             bu.buildingName = buildingName ; 
             
             bu.buildingFloors = buildingFloors ;    
             
             buildingList.add(bu);
            }
        
          
             
          }          
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