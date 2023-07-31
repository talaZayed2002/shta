package najah.edu.acceptance;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ViewDetailsTenantSteps {
    private boolean housingOptionSelected = false;
    private boolean detailsButtonClicked = false;
    @Given("the tenant has selected a specific housing option")
    public void selectSpecificHousingOption() {
        housingOptionSelected = true;
    }
    
    @When("the tenant clicks on {string}")
    public void clickViewDetails(String button) {
        if (button.equals("View Details")) {
            detailsButtonClicked = true;
        }
    }
    
    @Then("the housing details, amenities, and pictures are displayed")
    public void verifyHousingDetailsDisplayed() {
        Assert.assertTrue("The tenant should have selected a specific housing option.", housingOptionSelected);
        Assert.assertTrue("The tenant should have clicked the 'View Details' button.", detailsButtonClicked);
        boolean detailsDisplayed = areDetailsDisplayed();
        Assert.assertTrue("The housing details, amenities, and pictures should be displayed.", detailsDisplayed);
    }
    private boolean areDetailsDisplayed() {
        return false ;
    }
}