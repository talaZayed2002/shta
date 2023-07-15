package test.resources.java.najah.edu.acceptance;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainclasses.Apartment;
import mainclasses.Building;
import mainclasses.main;
import mainclasses.owner;

public class OwnerSteps {
	private static final Logger logger = Logger.getLogger(main.class.getName());
	
	static boolean valid ;
	static boolean ynValid ;
	static boolean buildingExists ;
    
	static int num ; 
    static Scanner s = new Scanner(System.in);
   
    public static owner ow ;  
    
    public static String id ;   
    public static String phone ;
    public static String name ;
    public static String address ;
        
	@Given("the owner signed up with new email and password")
	public static void theOwnerSignedUp(String email , String password) {
	    ow = new owner();           
        ow.email = email ; 
        ow.password= password ; 
        enterYourInformationStatementIsPrinted();
	}

	@Given("enter your infornation statement is printed")
	public static void enterYourInformationStatementIsPrinted() {
	    logger.info("Enter Your Information :\n");
	    theOwnerEnterValidInformation();
	}
		
	@When("the owner enter valid information")
	public static void theOwnerEnterValidInformation() {
   	    //id
		logger.info("\nid:");
        id =s.nextLine();
        valid = owner.idAndPhoneValidator(id);
        if(!valid) {
        	theOwnerEnterInvalidInformation(id,true);	
        }	        
        //name
        logger.info("\nname:");
        name =s.nextLine();
        ow.setName(name) ; 
        //phone
        logger.info("\nphone number:");
        phone =s.nextLine();
        valid = owner.idAndPhoneValidator(phone);
        if(!valid) {
        	theOwnerEnterInvalidInformation(phone,false);	
        }	        
        //address        
        logger.info("\naddress:");
        address  =s.nextLine();
        ow.setId(address) ;                         
	}


	@When("the owner enter invalid information")
	public static void theOwnerEnterInvalidInformation(String idOrPhone ,boolean f  ) {		
		if (f==true) {
		   while( !valid ) {
       	     logger.info("invalid phone number !");
       	     id =s.nextLine();
       	     valid = owner.idAndPhoneValidator(id);
           }
		}
		else{
		    while( !valid ) {
	       	 logger.info("invalid phone number !");
	       	 phone =s.nextLine();
	       	 valid = owner.idAndPhoneValidator(phone);
	        }
		}		
		theSystemStoreThisOwner();
	}

	@Then("the system store this owner")			
	public static void theSystemStoreThisOwner() {
		ow.setId(id);
		ow.setName(name);
		ow.setAddress(address);
		ow.setPhone(phone);
	}



}
