package najah.edu.acceptance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class TenantbooksaccommodationSteps {
    private boolean housingSelected = false;
    private boolean bookNowButtonClicked = false;
    @Given("the tenant has selected the desired housing")
    public void selectDesiredHousing() {
        housingSelected = true;
    }
    @When("the tenant clicks on {string}")
    public void clickBookNow(String button) {
        if (button.equals("Book Now")) {
            bookNowButtonClicked = true;
        }
    }
    @Then("a confirmation message is displayed for successful booking")
    public void verifyBookingConfirmationDisplayed() {
        Assert.assertTrue(housingSelected);
        Assert.assertTrue( bookNowButtonClicked);
        boolean confirmationDisplayed = isConfirmationDisplayed();

        Assert.assertTrue("A confirmation message for successful booking should be displayed.", confirmationDisplayed);
    }
    private boolean isConfirmationDisplayed() {
        return false;
    }
}
