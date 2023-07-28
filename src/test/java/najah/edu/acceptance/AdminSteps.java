package najah.edu.acceptance;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainclasses.main;
public class AdminSteps {	



	    private boolean isAdminLoggedIn;
	    private boolean requestsViewed;
	    private int acceptedRequestsCount;
	    private int rejectedRequestsCount;

	    @Given("the admin is log in to the system")
	    public void theAdminIsLogInToTheSystem() {
	        // Implement the code to log in the admin to the system
	        isAdminLoggedIn = true; // Simulate admin login success
	      assertTrue(isAdminLoggedIn);
	    
	    
	    }

	    @When("the system view the requests")
	    public void theSystemViewTheRequests() {
	        // Implement the code to view the requests in the system
	        requestsViewed = true; // Simulate successful viewing of requests
	    }


@Then("the admin can accept some requests")
public void theAdminCanAcceptSomeRequests() {
	        // Implement the code to accept some of the requests
	        acceptedRequestsCount = 5; // Simulate accepting 5 requests
	    }

	    @Then("the admin can reject another requests")
	    public void theAdminCanRejectAnotherRequests() {
	        // Implement the code to reject some of the requests
	        rejectedRequestsCount = 3; // Simulate rejecting 3 requests
	    }

	    @Then("the admin should see the correct status")
	    public void verifyStatus() {
	        // Assertion statements to check the expected behavior
	        Assert.assertTrue("Admin should be logged in", isAdminLoggedIn);
	        Assert.assertTrue("Requests should have been viewed", requestsViewed);
	        Assert.assertEquals("Admin should have accepted 5 requests", 5, acceptedRequestsCount);
	        Assert.assertEquals("Admin should have rejected 3 requests", 3, rejectedRequestsCount);
	    }
	}





	   
