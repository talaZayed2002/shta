package test.resources.java.najah.edu.acceptance;
import static org.junit.Assert.assertTrue;
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
public class AppartmentSteps {
    static boolean b = false;
    @Given("the owner is logged in to the system")
    public static void theOwnerIsLoggedInToTheSystem() {
        Assert.assertTrue( LoginFeatureSteps.flag_login);
    }

    @When("the owner selects add new apartment")
    public static void theOwnerSelectsAddNewApartment() {
        Assert.assertTrue(main.addNewApartmentChoice); 
    }
 
    @And("add a photo with an invalid format")
    public static void addAPhotoWithAnInvalidFormat(String p) {
        Assert.assertFalse(owner.urlValidator(p));
    }

    @And("enter invalid numeric input")
    public static void enterInvalidNumericInput(String s) {
        Assert.assertFalse(owner.digitsValidator(s));
    }
         
    @And("enter invalid yesNo input")
    public static void enterInvalidYesNoInput(String s) {
        Assert.assertFalse(owner.yesNoValidator(s));
    }       
    
    @And("the owner enter valid information")
    public static void theOwnerEnterValidInformation() {
        Assert.assertTrue(main.validInformation = true );
    }    
    
    @When("the owner selects Dashboard")
    public static void theOwnerSelectsDashboard() {
        Assert.assertTrue(main.dashboardChoice= true );
    }

    @When("the owner selects modify")
    public static void theOwnerSelectsModify() {
        Assert.assertTrue(main.modifyChoice= true );
    }    
  }
