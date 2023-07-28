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



    @Given("the owner signed up")
    public void ownerSignedUp() {
        // Implement the code for owner sign up
    }

    @And("enter your information statement is printed")
    public void enterInfoStatementPrinted() {
        // Implement the code to print the information statement
    }

    @Then("the owner enter valid information")
    public void ownerEntersValidInformation() {
        // Implement the code for entering valid information
    }

    @And("the system store this owner")
    public void systemStoresOwner() {
        // Implement the code to store the owner's information
    }

    @And("add the owner enter invalid phone number or id")
    public void addOwnerEntersInvalidPhoneOrId() {
        // Implement the code for entering invalid phone number or id
    }

    @Then("the system should display an error message")
    public void systemDisplaysErrorMessage() {
        // Implement the code to display an error message
    }

    @And("the system should read a new phone number or id")
    public void systemReadsNewPhoneNumberOrId() {
        // Implement the code to read a new phone number or id
    }
}*/




