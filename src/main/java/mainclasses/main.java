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
static user user1=new user();
static owner owner1;
static database db=new database();
static boolean valid ;
static boolean ynValid ; 
static String furniture;
static Furniture furniture1=new Furniture();
static int cost_furniture;
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
             valid = containsOnlyDigits(phone);
             while(!valid) {
            	 phone =s.nextLine();
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
             
             logger.info("services(only yes or no)\n");
            
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
             
             
             logger.info("balcony:yes or no");
             String balcony =s.nextLine();
             ynValid = yesNoValidation(balcony);
             while(!ynValid) {
             	   balcony  =s.nextLine();
                  ynValid = yesNoValidation(balcony);
             }
             ap.balcony = balcony ;

             logger.info("residence name:");
             String residence_name =s.nextLine();
             ap.residence_name = residence_name ; 
             
             logger.info("residence id:");
             String residence_id  =s.nextLine();
             valid = containsOnlyDigits(residence_id);
             while(!valid) {
            	 residence_id=s.nextLine();
            	 valid = containsOnlyDigits(residence_id);
             }
             ap.residence_id= residence_id ; 
             
             logger.info("floor:");
             String floor  =s.nextLine();
             valid = containsOnlyDigits(floor);
             while(!valid) {
            	 floor=s.nextLine();
            	 valid = containsOnlyDigits(floor);
             }
             ap.floor= floor ; 

             logger.info("number of apartments in the floor:");
             String number_of_appartments =s.nextLine();
             valid = containsOnlyDigits( number_of_appartments);
             while(!valid) {
            	 number_of_appartments = s.nextLine();
            	 valid = containsOnlyDigits( number_of_appartments);
             }
             ap.number_of_apartments=  number_of_appartments ;                          
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
    		logger.info("Please enter your name\n"); 
    	 	name=s.nextLine();
    	 	name=s.nextLine();
    	 	user1.name=name;
    	
    	 	logger.info("Please enter your age\n"); 
    		age=s.nextInt();
    		user1.age=age;

    		
    		logger.info("Please enter your major\n"); 
    		major=s.nextLine();
    		major=s.nextLine();
    		user1.major=major;
    	
    	
    	
    		db.AddTenantStudent(email,password,name,type,major,age);
    		
    		
           ViewTenantMenuStudent();
           
    		
    		break;
 	 
     } //student
     case 2:
     {
    	  
 		logger.info("Hello student!\n"); 
 		logger.info("Please enter your name\n"); 
 	 	name=s.nextLine();
 	 	name=s.nextLine();
 	 	user1.name=name;
 	
 		db.AddTenantNotStudent(email,password,name,type,major,age);
    	 
    	 ViewTenantMenuNotStudent();
    	 break;
     }//not student
     default:
     {
    	 logger.info("The enteryis not correct!.");
    	 
     }// otherwise
     }
	
}


static void ViewAdminMenu(){
	logger.info(" \n                               Admin Menue  \n"+ 
	"1-Scenes of requests for advertisement of housing and the ability to accept and reject it\n"+
    "2-Watching reservations via the system\n"+
	"3-The ability to add and advertise housing units through the system\n");
	 num=s.nextInt();
     switch(num) {
     case 1:
     {
    	 
    	 
    	break;
      }
     case 2:{
    	 
    	 break;
     }
     case 3:{
    	 
    	 break;
     }
     
     default:
     {
    	 logger.info("The enteryis not correct!.");
     }
     }
	
}
static void ViewTenantMenuStudent(){
	logger.info(" \n                               Tenant Menue - Student \n"+ 
	"1-View the available housing contains Picture,Price,location, and services available in them\n"+
    "2-Book according to the ID of the available housing\n"+
    "3-Info about this apartment contains people who live in it, such as ages and university majors\n"+
	"4-Advertise furniture \n"+
	"5-Your final book report (dashboard)\n");
	//personal data , name of the residence owner and his contact information
	// When the rent is paid (time to pay).
	
	 num=s.nextInt();
     switch(num) {
     case 1:
     {
    	 
    	 
    	break;
      } //end case 1
     case 2:
     {
    	 
    	 break;
     }//end case 2
     case 3:
     {
    	 logger.info("Please write what type of furniture u wnat to adertise \n");
    	 furniture=s.nextLine();
    	 furniture=s.nextLine();
    	 furniture1.type1=furniture;
    	 logger.info("Please write the cost \n");
         cost_furniture=s.nextInt();
         furniture1.cost=cost_furniture;
         db.addFurniture(furniture,cost_furniture);

  	 
    	 break;
     }//end case 3
      case 4:
      {
    	 
    	 break;
     }//end case 4
     case 5:{
	 
	 break;
     }//end case 5
     
     default:
     {
    	 logger.info("The enteryis not correct!.");
     }
     }
	
	
	

}
static void ViewTenantMenuNotStudent(){
	logger.info(" \n                               Tenant Menue - Not Student \n"+ 
	"1-View the available housing contains Picture,Price,location, and services available in them\n"+
    "2-Book according to the ID of the available housing\n"+
	"3-Advertise furniture \n"+
	"4-Your final book report (dashboard)\n"); 

	 num=s.nextInt();
    switch(num) {
    case 1:
    {
   	 
   	 
   	break;
     } //end case 1
    case 2:
    {
   	 
   	 break;
    }//end case 2
    case 3:
    {
   	 
   	 break;
    }//end case 3
     case 4:
     {
   	 
   	 break;
    }//end case 4
    
    default:
    {
   	 logger.info("The enteryis not correct!.");
    }
    }
}



public static void main(String[] args) 
{	
	start1();

		
}//end public static void main(String[] args) 



}// end main class 