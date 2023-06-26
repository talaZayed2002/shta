package najah.edu.acceptance;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginFeatureSteps {

	Myapp obj;

	public LoginFeatureSteps(Myapp obj) {
		super();
		this.obj = obj;
	}
	@Given("that the administrator is not logged in to the system")
	public void thatTheAdministratorIsNotLoggedInToTheSystem() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		obj.flag=false;
	    
	}
	@Given("the password is equal to {string}")
	public void thePasswordIsEqualTo(String pass) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		assertTrue(pass.equals(obj.passw));
		
		
	}
	@Then("the administrator should login to teh system")
	public void theAdministratorShouldLoginToTehSystem() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@Then("the adminstrator is logged in to the system")
	public void theAdminstratorIsLoggedInToTheSystem() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}



}
