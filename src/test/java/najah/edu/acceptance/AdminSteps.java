package najah.edu.acceptance;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainclasses.main;
public class AdminSteps {	
	   @Given("the admin is log in to the system")
	   public static void theAdminIsLogInToTheSystem()
	   {
		   Assert.assertTrue(main.loginAdmin);  
	   }
       
	   @When("the system view the requests")
	   public static void theSystemViewTheRequests()
	   {
		   Assert.assertTrue(main.requestPrinted);
	   }
	   
	   @Then ("the admin can accept some request")
	   public static void theAdminCanAcceptSomeRequest()
	   {
		   Assert.assertTrue(main.requestAccepted);
	   }
	   
	   @And ("the admin can reject some request")
	   public static void theAdminCanRejectSomeRequest()
	   {
		   Assert.assertTrue(main.requestRejected);

	   }
}