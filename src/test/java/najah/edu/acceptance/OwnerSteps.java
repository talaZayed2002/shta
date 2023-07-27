package najah.edu.acceptance;
import static org.junit.Assert.assertTrue;

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
    private static String storedOwnerEmail , storedOwnerPassword;
    @Given("the owner signed up with new email and password")
    public static void theOwnerSignedUp(String email, String password) {
        Assert.assertTrue(email != null && !email.isEmpty());
        Assert.assertTrue(password != null && !password.isEmpty());
        storedOwnerEmail = email;
        storedOwnerPassword = password;
        
        
        
        
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
