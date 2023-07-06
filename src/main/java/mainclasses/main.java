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
static admin admin1;
static user user1;
static owner owner1;
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
		}		
      logger.info("\nPlease enter your password:"); 
      	password=s.nextLine();	
    	user1.checkuser(email, password);
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
	    	owner1.checkowner(email, password);
		
			break;
		} // end of case 3 for owner 
	
		default :
		{
			logger.info("The enteryis not correct!");
		}//end default
		
			
		
		}//end switch
		
}// end start1 function


public static void main(String[] args) 
{	
	start1();

		
}//end public static void main(String[] args) 



}// end main class 