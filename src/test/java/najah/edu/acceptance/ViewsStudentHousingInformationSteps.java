/*package najah.edu.acceptance;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainclasses.database;
import mainclasses.main;
public class ViewsStudentHousingInformationSteps {
	// Implementing the step definitions using Cucumber and Java
	@Given("the housing is designated for students")
	public void housingDesignatedForStudents() {
		for(int i=0;i<database.db_user.size();i++) {
		assertEquals("student",database.db_user.get(i).type="student");
		}
	}

	@When("the tenant clicks on {string}")
	public void clickViewStudentData(String button) {
	    // Code to click the "View Student Data" button for the selected housing option
	}

	@Then("general data about the current occupants is displayed, including ages and university majors")
	public void verifyStudentDataDisplayed() {
	    // Code to verify that the general data about the student occupants is displayed
	}

}
*/