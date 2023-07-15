package test.resources.java.najah.edu.acceptance;

import java.util.Scanner;
import java.util.logging.Logger;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainclasses.Apartment;
import mainclasses.Building;
import mainclasses.main;
import mainclasses.owner; 

public class AppartmentSteps {
	private static final Logger logger = Logger.getLogger(main.class.getName());
	
	static boolean valid ;
	static boolean ynValid ;
	static boolean buildingExists ;
    
	static int num ; 
    static Scanner s = new Scanner(System.in);

    static Apartment ap ; 
    
	static String apartmentId;
	static String picture;
	static String rent;	  
    static String location; 	   
	static String water;
	static String electricety;
	static String balcony;
	static String internet;
	static String bathrooms;
	static String bedrooms;
    static String floor; 
    static String numberOfAppartments ;    
    static String buildingId;
    static String buildingFloors;    
    static String buildingName;  
   
    
    
	//background: 
	
    @Given("the owner is logged in to the system")
    public static void theOwnerIsLoggedInTOTheSystem(){
    	main.ownerLoggedIn = true ;
    }
    	
    @Given("the owner has a choice list with two choices")
    public static void theOwnerHasAChoiceListWithTwoChoices() {
	     logger.info("1.Add new appratment:\n2.Dashboard:");    	
	     
    }
    
    @When("the owner selects add new appartment ")
    public static void theOwnerSelectsAddNewAppartment() {   	 
    	theOwnerEnterValidInformation();
    }
    
    @And("the owner enter valid information")
    public static void theOwnerEnterValidInformation() {
     
        logger.info("Appartment id:");
        apartmentId =s.nextLine();
        valid = owner.digitsValidator(apartmentId);
        if(!valid ) {
        	enterInvalidNumericInput(apartmentId , "id");
        }
	 
	    logger.info("photo link:");
        picture =s.nextLine();
        valid = owner.urlValidator(picture);     
        if(!valid) {
        	addAPhotoWithAnInvalidFormat(picture);        
        }
    
        logger.info("location:");
        location =s.nextLine();
    
        logger.info("rent:");
        rent =s.nextLine();
        valid = owner.digitsValidator(rent);
        if(!valid) {
        	enterInvalidNumericInput(rent , "rent");
        }
     
        logger.info("services(only yes or no)\n");
   
        logger.info("water:");             
        water  =s.nextLine();
        ynValid = owner.yesNoValidator(water);
        if(!ynValid) {
        	enterInvalidYesOrNoInput(water,"water");
        }

        logger.info("internet");     
        internet  =s.nextLine();
        ynValid = owner.yesNoValidator(internet);
        if(!ynValid) {
        	enterInvalidYesOrNoInput(internet,"internet");
        }
  
        logger.info("electricety:");    
        electricety  =s.nextLine();
        ynValid = owner.yesNoValidator(electricety);
        if(ynValid) {
        	enterInvalidYesOrNoInput(electricety,"electricity");
        }
    
        logger.info("#bathrooms:");
        bathrooms =s.nextLine();
        valid = owner.digitsValidator(bathrooms);
        if(!valid) {
        	enterInvalidNumericInput(bathrooms , "#bathrooms");
        }
    
        logger.info("#bedrooms:");
        bedrooms =s.nextLine();
        valid = owner.digitsValidator(bedrooms);
        if(!valid) {
        	enterInvalidNumericInput(bedrooms, "#bedrooms");
        }
                 
        logger.info("balcony:yes or no");
        balcony =s.nextLine();
        ynValid = owner.yesNoValidator(balcony);
        if(!valid) {
        	enterInvalidYesOrNoInput(balcony,"balcony");
        }
  
        logger.info("floor:");
        floor  =s.nextLine();
        valid = owner.digitsValidator(floor);
        if(!valid) {
        	enterInvalidNumericInput(floor, "floor");
        }
 
        logger.info("number of apartments in the floor:");
        numberOfAppartments =s.nextLine();
        valid = owner.digitsValidator( numberOfAppartments);
        if(!valid) {
        	enterInvalidNumericInput(numberOfAppartments , "#appartments");
        }
    
        main.apartmentList.add(ap);

        //information for building
        logger.info("building id:");
        buildingId =s.nextLine();
        valid = owner.digitsValidator(buildingId);
        if(!valid) {
        	enterInvalidNumericInput(buildingId ,"buildingId");
        }
    
        logger.info("building name:");
        buildingName =s.nextLine();

        logger.info("building floors:");
        buildingFloors =s.nextLine();
        valid = owner.digitsValidator(buildingFloors);
        if(!valid) {
        	enterInvalidNumericInput(buildingFloors ,"buildingFloors");
    	
        }
    
    
        // check if the building in the array list
        buildingExists = false;
        for (Apartment a :  main.apartmentList  ) {
           if (a.getBuildingId().equals(buildingId)) {
           	  buildingExists = true;
              break;
            }          
        }       
    
        if(!buildingExists) {
          Building bu = new Building();

          bu.setBuildingId(buildingId) ; 

          bu.setBuildingName(buildingName) ; 
    
          bu.setBuildingFloors(buildingFloors) ;    
    
          main.buildingList.add(bu);
        }
    }
    @And("add a photo with an invalid format")
    public static void addAPhotoWithAnInvalidFormat(String p ) {
    	   while(!valid) {
    		   	 logger.info("invalid link !");
    		   	 picture =s.nextLine();
    		   	 valid = owner.urlValidator(p);     
    	   }
    }
    
    @And("enter invalid numeric input")
    public static void enterInvalidNumericInput(String s , String type ) {
 	    if(type.equals("id")){
            while(!valid) {
           	     logger.info("invalid!");
           	     apartmentId =s.nextLine();
           	     valid = owner.digitsValidator(apartmentId);
            }
 	    }
 	    
 	    else if (type.equals("rent")) {
            while(!valid) {
              	 logger.info("invalid!");
              	 rent =s.nextLine();
              	 valid = owner.digitsValidator(rent);
            } 	    	
 	    }
 	   
 	    else if (type.equals("#bathrooms")) {
            while(!valid) {
             	 logger.info("invalid!");
             	 bathrooms =s.nextLine();
             	 valid = owner.digitsValidator(bathrooms);
           } 	    		    	
 	    }
 	    
 	    else if(type.equals("#bedrooms")){
            while(!valid) {
            	 logger.info("invalid!");
            	 bedrooms =s.nextLine();
            	 valid = owner.digitsValidator(bedrooms);
            } 	    	
 	    	
 	    }
 	    
	    else if(type.equals("floor")){
	    	while(!valid) {
             	 logger.info("invalid!");
             	 floor =s.nextLine();
           	     valid = owner.digitsValidator(floor);
           } 	
 	    }
 	    
	    else if(type.equals("#appartments")) {
	    	while(!valid) {
            	 logger.info("invalid!");
            	 numberOfAppartments =s.nextLine();
          	     valid = owner.digitsValidator(numberOfAppartments);   
            } 		    	
	    } 	 
 	    
	    else if(type.equals("buildingId")) {
	    	while(!valid) {
           	     logger.info("invalid!");
           	     buildingId =s.nextLine();
         	     valid = owner.digitsValidator(buildingId);   
            } 	
	    }
 	    
        else if(type.equals("buildingFloors")) {
	    	while(!valid) {
          	     logger.info("invalid!");
          	     buildingFloors =s.nextLine();
        	     valid = owner.digitsValidator(buildingFloors );   
            } 
	    }
    }
    
    @And("enter invalid yes or no input")
    public static void enterInvalidYesOrNoInput(String s , String type ) {
 	    if(type.equals("balcony")){
	    	while(!ynValid) {
          	     logger.info("invalid!");
          	     balcony =s.nextLine();
        	     ynValid = owner.yesNoValidator(balcony);
            } 	
 	    }
 	    
 	    else if (type.equals("water")) {
 	    	while(!ynValid) {
         	     logger.info("invalid!");
         	     water =s.nextLine();
        	     ynValid = owner.yesNoValidator(water);
           } 	
 	    }
 	    
 	    else if (type.equals("internet")) {
 	    	while(!ynValid) {
        	     logger.info("invalid!");
        	     internet =s.nextLine();
       	         ynValid = owner.yesNoValidator(internet);
            } 
 	    }
 	    
	    else if(type.equals("electricity")){
	    	while(!ynValid) {
       	         logger.info("invalid!");
       	         electricety =s.nextLine();
      	         ynValid = owner.yesNoValidator(electricety);
            } 
 	    }
 	   theSystemStoreThisAppartment ();
    }
    
    @Then("the system store this appartment")
    public static void theSystemStoreThisAppartment () {
    	ap = new  Apartment()  ;
    	
    	ap.setWater(water);
    	ap.setRent(rent);
    	ap.setPicture(picture);
    	ap.setNumberOfApartmentsInFloor(apartmentId);
    	ap.setLocation(location);
    	ap.setInternet(internet);
    	ap.setId(apartmentId);
    	ap.setFloor(buildingFloors);
    	ap.setElectric(electricety);
    	ap.setBuildingId(buildingId);
        ap.setBedrooms(bedrooms);
        ap.setBathrooms(bathrooms);
        ap.setBalcony(balcony);
    	
    }


}
 	  
 	  

    
    
