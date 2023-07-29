/*package najah.edu.acceptance;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Logger;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainclasses.Apartment;
import mainclasses.Building;
import mainclasses.main;
import mainclasses.owner;

public class OwnerSteps {
	
	static boolean flag;
    private static String storedOwnerEmail , storedOwnerPassword;

	
	
    @Given("the owner signed up with new email and password")
    public static void theOwnerSignedUp(String email, String password) {
        Assert.assertTrue(email != null && !email.isEmpty());
        Assert.assertTrue(password != null && !password.isEmpty());
        storedOwnerEmail = email;
        storedOwnerPassword = password;
        assertTrue(flag);
        
        
        
    }

    @When("the owner enter valid information")
    public static void theOwnerEnterValidInformation() {
        Assert.assertTrue(storedOwnerEmail.contains("@"));
        Assert.assertTrue(storedOwnerPassword.length() > 8);
    }

    @When("the owner enter invalid information")
    public static void theOwnerEnterInvalidInformation(String idOrPhone) {
        if (owner.idAndPhoneValidator(idOrPhone)) {
            Assert.assertFalse(idOrPhone == null ||  idOrPhone.isEmpty());
        }
    }

    @Then("the system store this owner")
    public static void theSystemStoreThisOwner() {
        Assert.assertTrue( storedOwnerEmail != null && !storedOwnerEmail.isEmpty());
        Assert.assertTrue( storedOwnerPassword != null && !storedOwnerPassword.isEmpty());
    }
    }




@Given("the owner is logged in to the system")
public void theOwnerIsLoggedInToTheSystem() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("the owner has a choice list with two choices \\(add new appartment and dashboard)")
public void theOwnerHasAChoiceListWithTwoChoicesAddNewAppartmentAndDashboard() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("the owner selects {string}")
public void theOwnerSelects(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("the owner enter valid information")
public void theOwnerEnterValidInformation() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("the system store this appartment")
public void theSystemStoreThisAppartment() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



}*/




