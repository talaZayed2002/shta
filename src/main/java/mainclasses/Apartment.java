package mainclasses;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Apartment {	
	private static final Logger logger = Logger.getLogger(Apartment.class.getName());


	   private String id;
	   private String picture;
	   private String rent;	  
	   private String location; 	   
	   private String water;
	   private String electric;
	   private String balcony;
	   private String internet;
	   private String bathrooms;
	   private String bedrooms;
	   private String floor; 
	   private String numberOfApartmentsInFloor;       
	   private String buildingId;
	   private String name;
		Boolean accept;

	   String date;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}


	public String getRent() {
		return rent;
	}


	public void setRent(String rent) {
		this.rent = rent;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getWater() {
		return water;
	}


	public void setWater(String water) {
		this.water = water;
	}


	public String getElectric() {
		return electric;
	}


	public void setElectric(String electric) {
		this.electric = electric;
	}


	public String getBalcony() {
		return balcony;
	}


	public void setBalcony(String balcony) {
		this.balcony = balcony;
	}


	public String getInternet() {
		return internet;
	}


	public void setInternet(String internet) {
		this.internet = internet;
	}


	public String getBathrooms() {
		return bathrooms;
	}


	public void setBathrooms(String bathrooms) {
		this.bathrooms = bathrooms;
	}


	public String getBedrooms() {
		return bedrooms;
	}


	public void setBedrooms(String bedrooms) {
		this.bedrooms = bedrooms;
	}


	public String getFloor() {
		return floor;
	}


	public void setFloor(String floor) {
		this.floor = floor;
	}


	public String getNumberOfApartmentsInFloor() {
		return numberOfApartmentsInFloor;
	}


	public void setNumberOfApartmentsInFloor(String numberOfApartmentsInFloor) {
		this.numberOfApartmentsInFloor = numberOfApartmentsInFloor;
	}


	public String getBuildingId() {
		return buildingId;
	}


	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}
    public  Boolean getAccept() {
		return accept;
	}

	public void setAccept(Boolean accept){
		this.accept = accept;
	}
    


	public static void addApartment() {
		String p ;
		String location;
		String rent ;
		String  water  ;
		String  internet ;
		String electricety ;
		String bathrooms ;
		String bedrooms ;
		String balcony ;
		
		boolean valid ;
		boolean ynValid ;
		boolean buildingExists ;
		
		Scanner s = new Scanner(System.in);
		
		Apartment ap = new Apartment();
		
   	    logger.info("photo link:");
        p =s.nextLine();
    
        ap.setPicture(p) ; 
        //validation
     
     
        logger.info("location:");
        location =s.nextLine();
        ap.setLocation(location) ; 

        logger.info("rent:");
        rent =s.nextLine();
        valid = owner.digitsValidator(rent);
        while(!valid) {
        	rent=s.nextLine();
    	    valid = owner.digitsValidator(rent);
        }
        ap.setRent(rent) ;

     
        logger.info("services(only yes or no)\n");
    
        logger.info("water:");             
        water  =s.nextLine();
        ynValid = owner.yesNoValidator(water);
        while(!ynValid) {
            water  =s.nextLine();
            ynValid = owner.yesNoValidator(water);
        }
        ap.setWater(water);

       logger.info("internet");     
       internet  =s.nextLine();
       ynValid =owner.yesNoValidator(internet);
       while(!ynValid) {
            internet  =s.nextLine();
            ynValid = owner.yesNoValidator(internet);
       }  
       ap.setInternet(internet);
     
   
       logger.info("electricety:");    
       electricety  =s.nextLine();
       ynValid = owner.yesNoValidator(electricety);
       while(!ynValid) {
     	    electricety  =s.nextLine();
            ynValid = owner.yesNoValidator(electricety);
       }
       ap.setElectric(electricety);
     
       logger.info("#bathrooms:");
       bathrooms =s.nextLine();
       valid = owner.digitsValidator(bathrooms);
       while(!valid) {
    	    bathrooms=s.nextLine();
    	    valid = owner.digitsValidator(bathrooms);
       }
       ap.setBathrooms(bathrooms) ;
     
       logger.info("#bedrooms:");
       bedrooms =s.nextLine();
       valid = owner.digitsValidator(bedrooms);
       while(!valid) {
    	    bedrooms=s.nextLine();
    	    valid = owner.digitsValidator(bedrooms);
       }
       ap.setBedrooms(bedrooms) ;
      
     
       logger.info("balcony:yes or no");
       balcony =s.nextLine();
       ynValid = owner.yesNoValidator(balcony);
       while(!ynValid) {
     	    balcony  =s.nextLine();
            ynValid = owner.yesNoValidator(balcony);
       }
       ap.setBalcony(balcony) ;
     
       //inforamation for building
       logger.info("building id:");
       String buildingId =s.nextLine();
       valid = owner.yesNoValidator(buildingId);
              
       ap.setBuildingId(buildingId) ; 

       logger.info("building name:");
       String buildingName =s.nextLine();
       ap.setName(buildingName) ; 


       logger.info("building floors:");
       String buildingFloors =s.nextLine();
       valid = owner.yesNoValidator(buildingFloors);
       ap.setFloor(buildingFloors) ; 

       main.db_Apartment.add(ap);   
       

       // check if the building in the array list
       buildingExists = false;
       for (Apartment a : main.db_Apartment  ) {
           if (a.getBuildingId().equals(buildingId)) {
        	   buildingExists = true;
        	     //  viewDashboard();
               break;
           }
       }  
    
       if(!buildingExists) {  
       Building bu = new Building();
       bu.setBuildingId(buildingId) ; 
       bu.setBuildingName(buildingName) ; 
       bu.setBuildingFloors(buildingFloors) ;    
  
    }   

		
	}


	public static void viewDashboard() {
		Scanner s = new Scanner(System.in);
		
       //dash board for owner -start
       String currentEnterdBuildingfloors = null ;            
       logger.info("------------------------------------ MY Dash Board ------------------------------------\n");
       //display buildings
       logger.info("Buildings:\n");
       for(Apartment b  : main.db_Apartment ) {
    	   logger.info("building "+ b.getBuildingId());              
       }
       //get specific building id and check it 
       logger.info("Enter the id of building to show more details ..");
       String currentEnterdBuildingId =s.nextLine();
       //convert the arrayList to array and search for this building id in array 
       int c = main.db_building.size();
       Building[] buildingArray= main.db_building.toArray(new Building[main.db_building.size()]);
       for(int i = 1 ; i<=c ; i++ ) {
    	  if( currentEnterdBuildingId.equals(buildingArray[i].getBuildingId())) {
    	    	currentEnterdBuildingfloors = buildingArray[i].getBuildingFloors();            		
    	  }     
    	  else if (i==c && currentEnterdBuildingfloors.equals(null)) {
    	        logger.info("invalid building id !");
    	  }
       }            
       //display floors
    /* 
       int floorsInt = Integer.parseInt(currentEnterdBuildingfloors);            
       logger.info(floorsInt +" floors\n");            
       //get specific floor and check it 
       logger.info("Enter the floor number .. ");
       String currentEnterdFloor = s.nextLine();
       int currentEnterdFloorInt = Integer.parseInt(currentEnterdFloor);            
       while (currentEnterdFloorInt >floorsInt ){
           logger.info("invalid floor !");
           currentEnterdFloor = s.nextLine();
           currentEnterdFloorInt = Integer.parseInt(currentEnterdFloor); 
         
       }
    
      //convert department arrayList to array
      int c1 = main.db_Apartment.size();
      Apartment[]  apartmentArray = main.db_Apartment.toArray(new Apartment[main.db_Apartment.size()]);
      for(int i = 1 ; i<=c1 ; i++ ) {
    	  if( currentEnterdBuildingId.equals(apartmentArray[i].getBuildingId()) && currentEnterdFloor.equals(apartmentArray[i].getFloor())) {
               logger.info(apartmentArray[i].getId()+"\n");     
    	  }     
    	  else if (i==c && currentEnterdBuildingfloors.equals(null)) {
    	      logger.info("invalid building id !");
    	  }
      } */
     
 

     
      //dash board for owner -end
             
		
	}


	public static void modify() {
		String p ;
		String location;
		String rent ;
		String  water  ;
		String  internet ;
		String electricety ;
		String bathrooms ;
		String bedrooms ;
		String balcony ;
		Boolean accept;
		
		boolean valid ;
        boolean flag = true ; 

		Scanner s = new Scanner(System.in);
		
        String currentId= null;
  	    logger.info("Enter Appartment id :");
  	    currentId = s.nextLine();
        int count = main.db_Apartment.size();
        
    
        
        
        

        for (Apartment ap : main.db_Apartment  ) {
        	
        	if(ap.getId() == currentId ) {
                flag = true ; 
        		logger.info("1.rent"+"\n"+"2.location"+"\n"+"3.picture"+"\n"+"4.internet"+"\n"+"5.water"+"\n"+"6.electric"+"\n"+"7.balcony"+"\n"
        	                +"8.bathrooms"+"\n"+"9.bedrooms"+"\n");  
                int modify = s.nextInt();           		
        		
                if(modify ==1){
        			rent = s.nextLine();
        			valid = owner.digitsValidator(rent);
        			while(!valid) {
        				logger.info("inalid!");
        				valid  = owner.digitsValidator(rent);
            			rent = s.nextLine();
        			}
        			ap.setRent(rent);
        		}
        		else if (modify ==2) {
        			location = s.nextLine();
        			ap.setLocation(location);              	
        	    }
        		else if(modify ==3) {
        			p = s.nextLine();
        			valid = owner.urlValidator(p);
        			while(!valid) {
        				logger.info("inalid!");
            			valid = owner.urlValidator(p);
            			p = s.nextLine();
        			}
        			ap.setPicture(p);              	                       
        		}
        		else if(modify ==4) {
        		    internet = s.nextLine() ;
        			valid = owner.yesNoValidator(internet);
        			while(!valid) {
        				logger.info("inalid!");
            			valid = owner.yesNoValidator(internet);
            		    internet = s.nextLine() ;
        			}
        			ap.setInternet(internet);              	                       
        		}
        		else if(modify ==5) {
        		    water = s.nextLine() ;
        			valid = owner.yesNoValidator(water);
        			while(!valid) {
        				logger.info("inalid!");
            			valid = owner.yesNoValidator(water);
            			water = s.nextLine() ;
        			}
        			ap.setWater(water);              	                       
        		}
        		else if(modify ==6) {
        			electricety = s.nextLine() ;
        			valid = owner.yesNoValidator(electricety);
        			while(!valid) {
        				logger.info("inalid!");
            			valid = owner.yesNoValidator(electricety);
            			electricety = s.nextLine() ;
        			}

        			ap.setElectric(electricety);              	                       
        		}
        		else if(modify ==7) {
        			balcony = s.nextLine() ;
        			valid = owner.yesNoValidator(balcony);
        			while(!valid) {
        				logger.info("inalid!");
            			valid = owner.yesNoValidator(balcony);
            			balcony = s.nextLine() ;
        			}
        			ap.setBalcony(balcony);              	                       
        		}
        		else if(modify ==8) {
        			bathrooms = s.nextLine() ;
        			valid = owner.digitsValidator(bathrooms);
        			while(!valid) {
        				logger.info("inalid!");
        				valid  = owner.digitsValidator(bathrooms);
        				bathrooms = s.nextLine();
        			}
        			ap.setBathrooms(bathrooms);              	                       
        		}
        		else if(modify ==9) {
        			bedrooms = s.nextLine() ;
        			valid = owner.digitsValidator(bedrooms);
        			while(!valid) {
        				logger.info("inalid!");
        				valid  = owner.digitsValidator(bedrooms);
        				bedrooms = s.nextLine();
        			}
        			ap.setBathrooms(bedrooms);              	                       
        		}
              
        	}
        } 
        if(!flag) {
        	logger.info("invalid!");
        }
        

	}


	
}
