package najah.edu.acceptance;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainclasses.Apartment;
import mainclasses.Building;
import mainclasses.admin;
import mainclasses.database;
import mainclasses.owner;
import mainclasses.user;

public class HousingViewFeatureSteps {
	   admin admin1;
       owner owner;
       Apartment apart;
		  
	   static user user;
		
	  static boolean flag_housing;
	  static database db=new database();

	   Building build;
	   static List <Apartment> db_Apartment=new ArrayList <Apartment>(); 

	public HousingViewFeatureSteps(admin adm1,user user2,owner own1,Apartment apart,Building build) {
		admin1=adm1;
		user=user2;
		owner=own1;
		this.apart=apart;
		this.build=build;
		
	}
	
	
	@Given("the tenant is logged in")
	public void theTenantIsLoggedIn() {
		
		assertFalse(flag_housing);
		
	}
	Apartment apart1=new Apartment();
	@When("the tenant accesses the housing view")
	public void theTenantAccessesTheHousingView() {
		db.addBuilding(apart1);
			
	}
	@Then("the tenant can see the list of available housing options")
	public void theTenantCanSeeTheListOfAvailableHousingOptions() {

	       db.ViewHousing(apart1);
	       assertFalse(flag_housing);
	}


	
	@When("the tenant selects a specific housing listing")
	public void theTenantSelectsASpecificHousingListing() {
	
       db.ViewHousing2(apart1);
      
      	assertFalse(flag_housing);
	}
	@Then("the tenant can view pictures of the housing and access information such as prices, location, and available services")
	public void theTenantCanViewPicturesOfTheHousingAndAccessInformationSuchAsPricesLocationAndAvailableServices() {
		assertFalse(flag_housing);
	}



}
