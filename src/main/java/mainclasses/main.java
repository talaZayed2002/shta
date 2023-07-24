package mainclasses;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
public class main {
private static final Logger logger = Logger.getLogger(main.class.getName());
static Scanner s=new Scanner(System.in);
static int num ;
static String email="0";
static String password="0";
static String name="0";
static String major="0";
static String type="0";
static int age=0;
static String id="0";
static admin admin1;
static user user1=new user();
static owner owner1;
static database db=new database();
static Apartment ap = new Apartment();
static String furniture;
static Furniture furniture1=new Furniture();
static int cost_furniture;

static List <Apartment> db_Apartment=new ArrayList <Apartment>(); //new !
static List <Building> db_building = new ArrayList <Building> ();



static boolean valid ;
static boolean ynValid ;
static boolean buildingExists ;


static List <owner> ownerList   = new ArrayList <owner> ();






static void start1() {
	  logger.info(" \n"+"                                    HELLO\n"+
	  		      "                            WELCOME TO SAKANCOM \n"+
                  "                    Please choose your type: \n" +
			      "                    1-Admin \n"+
                  "                    2-Tenant\n"+
			      "                    3-Owner\n") ;
		
	    num=s.nextInt();
		switch(num)
		{
		case 1:
		{
			
			 logger.info("Please enter your email as admin"); 
				email=s.nextLine();
				email=s.nextLine();
				while(!(email.contains("@"))) {
					logger.info("Please this is not an invalid email\n reenter ur email"); 
					email=s.nextLine();
				}		
		     logger.info("\nPlease enter your password:"); 
		      	password=s.nextLine();
		      	
		    	admin1.check(email, password);
		 
			break;
		}// end case 1 for admin
		
		case 2:
		{ 

			TenantStart();
    	
			break;
			
		}// end case 2 for tenant(user)
		
		case 3:
		{
			String p ;
			String location;
			String rent ;
			String  water  ;
			String  internet ;
			String electricety ;
			String bathrooms ;
			String bedrooms ;
			String balcony ;
			
			
			
			
			
			
			
		logger.info("Please enter your email as tenant:"); 
			email=s.nextLine();
			email=s.nextLine();
			while(!(email.contains("@"))) {
				logger.info("Please this is not an invalid email\n reenter ur email"); 
				email=s.nextLine();
			}		
	      logger.info("\nPlease enter your password:"); 
	      	password=s.nextLine();	
	    	int res= owner1.checkowner(email, password);	    	
	      //tala	    	
	      if (res !=1) {//new user 
	         owner ow = new owner ();             
             ow.email = email ; 
             ow.password= password ; 
	    
	    	 logger.info("Please enter your information:\n");		    
        	 logger.info("\nid:");
             String id =s.nextLine();
             valid = owner.digitsValidator(id);
             while(!valid) {
            	 id =s.nextLine();
            	 valid = owner.digitsValidator(id);
             }
             ow.setId(id) ; 
            
             logger.info("\nname:");
             String name =s.nextLine();
             ow.setName(name) ; 
             
             logger.info("\nphone:");
             String phone =s.nextLine();
             valid = owner.digitsValidator(phone);
             while(!valid) {
            	 phone =s.nextLine();
            	 valid = owner.digitsValidator(phone);
             }
             ow.setPhone(phone) ; 
             
             logger.info("\naddress:");
             String address  =s.nextLine();
             ow.setId(address) ;                         
          }
	      
	      logger.info("1.Add new appratment:\n2.Dashboard:");
	      num = s.nextInt() ; 	      
          if(num == 1){
           
        	 
        	 logger.info("photo link:");
             p =s.nextLine();
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
             while(!valid) {
            	 logger.info("invalid !");
            	 buildingId=s.nextLine();
            	 owner.yesNoValidator(buildingId);
             }            
             ap.setBuildingId(buildingId) ; 
 
             logger.info("building name:");
             String buildingName =s.nextLine();

             logger.info("building floors:");
             String buildingFloors =s.nextLine();
             valid = owner.yesNoValidator(buildingFloors);
             while(!valid) {
            	 logger.info("invalid !");
            	 buildingFloors=s.nextLine();
            	 valid = owner.yesNoValidator(buildingFloors);
             }            
             db_Apartment.add(ap);             

             // check if the building in the array list
             buildingExists = false;
             for (Apartment a : db_Apartment  ) {
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
             
             db_building .add(bu);
            }   
           }
          else if (num ==2) {
            	
            //dash board for owner -start
            String currentEnterdBuildingfloors = null ;            
            logger.info("------------------------------------ MY Dash Board ------------------------------------\n");
            //display buildings
            logger.info("Buildings:\n");
            for (Building b  : db_building ) {
            	logger.info("building "+ b.getBuildingId());              
            }
            //get specific building id and check it 
            logger.info("Enter the id of building to show more details ..");
            String currentEnterdBuildingId =s.nextLine();
           //convert the arrayList to array and search for this building id in array 
            int c = db_building.size();
            Building[] buildingArray= db_building.toArray(new Building[db_building.size()]);
            for(int i = 1 ; i<=c ; i++ ) {
            	if( currentEnterdBuildingId.equals(buildingArray[i].getBuildingId())) {
            		currentEnterdBuildingfloors = buildingArray[i].getBuildingFloors();            		
            	}     
            	else if (i==c && currentEnterdBuildingfloors.equals(null)) {
            	   logger.info("invalid building id !");
            	}
            }            
            //display floors
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
            int c1 = db_Apartment.size();
            Apartment[]  apartmentArray = db_Apartment.toArray(new Apartment[db_Apartment.size()]);
            for(int i = 1 ; i<=c1 ; i++ ) {
            	if( currentEnterdBuildingId.equals(apartmentArray[i].getBuildingId()) && currentEnterdFloor.equals(apartmentArray[i].getFloor())) {
                   logger.info(apartmentArray[i].getId()+"\n");     
            	}     
            	else if (i==c && currentEnterdBuildingfloors.equals(null)) {
            	   logger.info("invalid building id !");
            	}
            }            
            
            
            
            //dash board for owner -end
                     
             logger.info("\n \n Now please log in as tenant to book an apartment ! \n");
              TenantStart(); //continue as tenant
          }// end (number ==2)

          
          else if (num ==3 ) {  
              String currentId= null;
        	  logger.info("Enter Appartment id :");
        	  currentId = s.nextLine();
              int count = db_Apartment.size();
              Apartment[]  apartmentArray = db_Apartment.toArray(new Apartment[db_Apartment.size()]);
              for(int i = 1 ; i<=count ; i++ ) {
              	if(apartmentArray[i-1].getId() == currentId ) {
                    logger.info("1.rent"+"\n"+"2.location"+"\n"+"3.picture"+"\n"+"4.internet"+"\n"+"5.water"+"\n"+"6.electric"+"\n"+"7.balcony"+"\n"
              	                +"8.bathrooms"+"\n"+"9.bedrooms"+"\n");  
                    int modify = s.nextInt();           		
              		
                    if(modify ==1){
              			rent = s.nextLine();
              			apartmentArray[i-1].setRent(rent);
              		}
              		else if (modify ==2) {
              			location = s.nextLine();
              			apartmentArray[i-1].setLocation(location);              	
              	    }
              		else if(modify ==3) {
              			p = s.nextLine();
              			apartmentArray[i-1].setPicture(p);              	                       
              		}
              		else if(modify ==4) {
              		    internet = s.nextLine() ;
              			apartmentArray[i-1].setInternet(internet);              	                       
              		}
              		else if(modify ==5) {
              		    water = s.nextLine() ;
              			apartmentArray[i-1].setWater(water);              	                       
              		}
              		else if(modify ==6) {
              			electricety = s.nextLine() ;
              			apartmentArray[i-1].setElectric(electricety);              	                       
              		}
              		else if(modify ==7) {
              			balcony = s.nextLine() ;
              			apartmentArray[i-1].setBalcony(balcony);              	                       
              		}
              		else if(modify ==8) {
              			bathrooms = s.nextLine() ;
              			apartmentArray[i-1].setBathrooms(bathrooms);              	                       
              		}
              		else if(modify ==9) {
              			bedrooms = s.nextLine() ;
              			apartmentArray[i-1].setBathrooms(bedrooms);              	                       
              		}
                    
                    
                    
              	}
              	
                    
                  
              	else if (i==count && currentId.equals(null)) {
              	   logger.info("invalid building id !");
              	}
              }   
              
              
              logger.info("String currentId= null;\n");
              
          }
          
          
          
          
          
          
          
          
          
          
          break;
		}    	
			
		
		default :
		{
			logger.info("The enteryis not correct!.");
		}//end default
		
			
		
		}//end switch		
} // end start1 function

static void ViewForTenant() {
	logger.info("Please determine wheather u r a student or not \n 1-Student 2-Not a student"); 
     num=s.nextInt();
     switch(num) {
     case 1:
     {
    	  
    		logger.info("Hello student!\n"); 
    		logger.info("Please enter your name\n"); 
    	 	name=s.nextLine();
    	 	name=s.nextLine();
    	 	user1.name=name;
    	 	
    		logger.info("Please enter your id\n"); 
    	 	id=s.nextLine();
    	
    	 	user1.id=id;
    	
    	 	logger.info("Please enter your age\n"); 
    		age=s.nextInt();
    		user1.age=age;

    		
    		logger.info("Please enter your major\n"); 
    		major=s.nextLine();
    		major=s.nextLine();
    		user1.major=major;
    	
    	
    	
    		db.AddTenantStudent(email,password,name,type,major,age,id);
    		
    		
           ViewTenantMenuStudent();
              		
    		break;
 	 
     } //student
     case 2:
     {    	  
 		logger.info("Hello student!\n"); 
 		logger.info("Please enter your name\n"); 
 	 	name=s.nextLine();
 	 	name=s.nextLine();
 	 	user1.name=name;
 	
 		db.AddTenantNotStudent(email,password,name,type,major,age,id);
    	 
    	 ViewTenantMenuNotStudent();
    	 break;
     }//not student
     default:
     {
    	 logger.info("The enteryis not correct!.");
    	 
     }// otherwise
     }
	
}


static void ViewAdminMenu(){
	logger.info(" \n                               Admin Menue  \n"+ 
	"1-Scenes of requests for advertisement of housing and the ability to accept and reject it\n"+
    "2-Watching reservations via the system\n"+
	"3-The ability to add and advertise housing units through the system\n");
	 num=s.nextInt();
     switch(num) {
     case 1:
     {
    	 
    	 
    	break;
      }
     case 2:{
    	 
    	 break;
     }
     case 3:{
    	 
    	 break;
     }
     
     default:
     {
    	 logger.info("The enteryis not correct!.");
     }
     }
	
}
static void ViewTenantMenuStudent(){
	logger.info(" \n                               Tenant Menue - Student \n"+ 
	"1-View the available housing contains Picture,Price,location, and services available in them\n"+
    "2-Book according to the ID of the available housing\n"+
    "3-Info about this apartment contains people who live in it, such as ages and university majors\n"+
	"4-Advertise furniture \n"+
	"5-Your final book report (dashboard)\n");
	//personal data , name of the residence owner and his contact information
	// When the rent is paid (time to pay).
	
	 num=s.nextInt();
     switch(num) {
     case 1:
     {
    	 
    	 
    	break;
      } //end case 1
     case 2:
     {
    	 
    	 break;
     }//end case 2
     case 3:
     {
    	 

  	 
    	 break;
     }//end case 3
      case 4:
      {
    	  logger.info("Please write what type of furniture u wnat to adertise \n");
     	 furniture=s.nextLine();
     	 furniture=s.nextLine();
     	 furniture1.type1=furniture;
     	 logger.info("Please write the cost \n");
          cost_furniture=s.nextInt();
          furniture1.cost=cost_furniture;
          db.addFurniture(furniture,cost_furniture);
    	 break;
     }//end case 4
     case 5:{
	 
	 break;
     }//end case 5
     
     default:
     {
    	 logger.info("The enteryis not correct!.");
     }
     }
	
     TenantDashboard();
	

}




static void TenantStart() {
logger.info("Please enter your email as tenant:"); 
email=s.nextLine();
email=s.nextLine();
while(!(email.contains("@"))) {
logger.info("Please this is not an invalid email\n reenter ur email"); 
email=s.nextLine();
user1.email=email;

}		
logger.info("\nPlease enter your password:"); 
password=s.nextLine();	
user1.checkuser(email, password);



ViewForTenant();
}
static void ViewTenantMenuNotStudent(){
	logger.info(" \n                               Tenant Menue - Not Student \n"+ 
	"1-View the available housing contains Picture,Price,location, and services available in them\n"+
    "2-Book according to the ID of the available housing\n"+
	"3-Advertise furniture \n"+
	"4-Your final book report (dashboard)\n"); 

	 num=s.nextInt();
    switch(num) {
    case 1:
    {
   	 
   	 
   	break;
     } //end case 1
    case 2:
    {
   	 
   	 break;
    }//end case 2
    case 3:
    {
   	 
   	 break;
    }//end case 3
     case 4:
     {
   	 
   	 break;
    }//end case 4
    
    default:
    {
   	 logger.info("The enteryis not correct!.");
    }
   
    }
    TenantDashboard();
}

static void TenantDashboard() {
	

	 logger.info("\nThis is is for "+	user1.name+" Only :D \n"+
	  		   	" |  Name:"+ user1.name +"    | "+" Age:" +user1.age+"     |  "+"Major:"+user1.major +" |\n "+
	  			"|                    "+"  |  "+"        "+"  |  "+"                   "+"        |\n "+
	  		   	"|-----------------------------------------------------------------|\n ");
	             
	 db.ShowWhichTenant(user1.id,user1.name);
	      
	  			//"|  Owner name:" +ap.rent     +"|"        + "\n "+
	  			//"|                    "+"  |  "+"        "+"  |  "+"                   "+"        |\n "	 
	  			 
	            
	 

// tenant book after owner show his apartments(book comes from the own
	
  	 
}

public static void main(String[] args) 


{

	start1();

		
}//end public static void main(String[] args) 



}// end main class 