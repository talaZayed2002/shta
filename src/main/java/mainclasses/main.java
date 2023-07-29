package mainclasses;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
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
public static String type="0";
static int age=0;
static String id="0";
static String phone_number="0";

public static user user1=new user();


static Database db=new Database();
static Apartment ap = new Apartment();
static String furniture;
static Furniture furniture1=new Furniture();
static String cost_furniture;

static List <Apartment> db_Apartment=new ArrayList <Apartment>(); //new !
static List <Building> db_building = new ArrayList <Building> ();
static List <owner> db_owner   = new ArrayList <owner> ();
public static List <Apartment> db_Advertisment   = new ArrayList <Apartment> ();




public static boolean addNewApartmentChoice = false ;
public static boolean modifyChoice = false  ;
public static boolean dashboardChoice = false ;
public static boolean validInformation = false ;
public static boolean loginAdmin = false ;
public static boolean requestPrinted = false ;
public static boolean requestAccepted = false ;
public static boolean requestRejected = false ;
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
			ViewAdmin()	;
			break;
		}// end case 1
		
		case 2:
		{ 
			 logger.info("\n \n Now please log in as tenant to book an apartment ! \n");
	         TenantStart(); //continue as tenant		
			 break;
		}// end case 2
		
		case 3:
		{
			 logger.info("\n ");

		     logger.info("Please enter your email as owner:"); 
		     email=s.nextLine();
		     email=s.nextLine();

		     
		     
		     while(!(email.contains("@"))) {
			     logger.info("Please this is not an invalid email\n reenter ur email"); 
		         email=s.nextLine();
	         }	
	         logger.info("\nPlease enter your password:"); 
	         password=s.nextLine();	
	         int res= owner.checkowner(email, password);   
	         logger.info("\nPlease enter your phone number:"); 
	         phone_number=s.nextLine();
	         owner own=new owner();
	         own.setPhone(phone_number);
	         
	         
	         //sign up 
	         if (res !=1) {//new user 	    	 
                 //owner.signUp(email , password);
	         }
	         //list
	         logger.info("1.Add new appratment:\n2.Dashboard:");
	         num = s.nextInt() ;
	         //add new apartment  	      
             if (num == 1){
                 Apartment.addApartment();
                 //okay well stored in the list!
                Apartment.viewDashboard();
                // for(int i=0;i<db_Apartment.size();i++) {
                	// logger.info(db_Apartment.get(i).getRent());
               //  }
                 
                admin.viewRequests();
                 
             }
             //Dash board
             else if (num ==2) {
                 Apartment.viewDashboard();
             }
             //modify
             else if (num ==3 ) {  
        	     Apartment.modify();
             } 
             
             break;
		}    	
			
		
		default :
		{
			 logger.info("The enteryis not correct!.");
		}//end default
		
			
		
		}//end switch
  }// end start1 function

public static void ViewForTenant() {
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

static void ViewAdmin(){
	 logger.info("Please enter your email as admin"); 
	 email=s.nextLine();
	 while(!(email.contains("@"))) {
			logger.info("Please this is not an invalid email\n reenter ur email"); 
			email=s.nextLine();
	 }		
     logger.info("\nPlease enter your password:"); 
     password=s.nextLine();
     admin.check(email, password);

}
static void ViewAdminMenu1(){

				String str ;

    	    str = s.nextLine();
    	    str = s.nextLine();
		    if(str.equals("admin")) 
		    {
		    	main.ViewAdmin();
		    	logger.info(" \n                               Admin Menue  \n"+ 
		    			"1-Scenes of requests for advertisement of housing and the ability to accept and reject it\n"+
		    		    "2-Watching reservations via the system\n");
		    	
		    	
		    	
	num=s.nextInt();
switch(num) {	
		    case 1:
		    {  	
	       logger.info("\n now u can refused or accept it"+"\n");
		    str = s.nextLine();
		    str = s.nextLine();
		    while(!str.equals("a") && !str.equals("r")) {
			    logger.info("invalid!");
			    }
	                  	
		    if(str.equals("a")) 
		    {
		    
		         ap.setAccept(true);
		            logger.info("Accepted !!,now enter as an admin to book , please enter the word:  "+ "tenant"+"\n");
				    str = s.nextLine();
		          if (str.equals("tenant")) {
		        	main.TenantStart(); 
		        	
		        	 
		         }
		    }
		    
		     
		    
		    else if (str.equals("r"))
		    {	
		    	logger.info("Refused,try to request again ");
              Apartment.addApartment();
              Apartment.viewDashboard();

		    	
		    }
		    else {
		    	logger.info("try again!");

     	 
      }
		    }
		     
		    	     case 2:{
		    	    	 
		    	    	 
		    	    	 break;
		    	    	 
		    	     }
		    	     default :
		    	     {
		    	    	 
		    	     }
		    }
      
		    }
	
}
public static void ViewTenantMenuStudent(){
	logger.info(" \n                               Tenant Menue - Student \n"+ 
	"1-View the available housing contains Picture,Price,location, and services available in them\n"+
    "2-Book according to the ID of the available \\n"+
    "3-Info about this apartment contains people who live in it, such as ages and university majors\n"+
	"4-Advertise furniture \n"+
	"5-Your final book report (dashboard)\n");
	//personal data , name of the residence owner and his contact information
	// When the rent is paid (time to pay).
	
	 num=s.nextInt();
     switch(num) {
     case 1:
     {
    	String str;
    	admin.viewRequestsForAdmin();
    	 
	
		logger.info("please write the number 2 to continue booking !\n");
	    str = s.nextLine();
	    str = s.nextLine();
	    if(str.equals("2")) {
	    logger.info("please write the number of the department u like!");
	    str = s.nextLine();
	    for(int i=0;i<db_Apartment.size();i++) {
	    db_Apartment.get(i).setBuildingId(str);
	        String d=str;
	    	
		    logger.info("r u sure to book the department that has the id="+d+"\n" +
		    "if yes write the word(yes)");
		    str = s.nextLine();
		    if(str.equals("yes")) {
	    	//user1.book=str;
		    logger.info("u have book the department with the id ="+d+"\n" +"Please write number :3 to view it's information"+"\n");
		    str = s.nextLine();

		    //Apartment foundApart = new Apartment() ;
	                for (Apartment person : db_Apartment) {
	               if (person.getBuildingId().equals(d)) {
	            	   
	               logger.info("The student/s in your apertment is/are with thier informations :\n"+
	               "Name of the Apartment  Name of the student  Major of the student   age of the student"+"\n"
	   +person.getName()+"                  "+ person.getnameـtenant()+"               "+person.getStudentMajor()+
	   "                          "+person.getage_tenant());	 
	            	
	                
	               }
	           }
	    
		    }	// logger.info(database.db_user.get(i).type+  db_Apartment.get(i).getBuildingId());		
			
		    else {
			    logger.info("choose another department to book ! :) \n");

		    }
           // break;

	    }
	    String f;
	

	    logger.info("please enter(4) if u want to advartise a furniture ");
	    
	    f=s.nextLine();
	    if(f.equals("4")) {
	    	
	    
	    logger.info("Please write what type of furniture u wnat to adertise \n");
    	 furniture=s.nextLine();
    	 furniture=s.nextLine();
    	 furniture1.type1=furniture;
    	 logger.info("Please write the cost \n");
         cost_furniture=s.nextLine();
         furniture1.cost=cost_furniture;
         db.addFurniture(furniture,cost_furniture);
	    }
	    
    	 logger.info("Please enter (5)to show ur final dashboard :  \n");
    	 String s1;
    	    s1=s.nextLine();
    	    if(s1.equals("5")) {
    	  TenantDashboard();}
	    ///TALA 
	    
	    }

    	
    	break;
      } //end case 1
     case 2:
     {
    	 
    	 break;
     }//end case 2
     case 3:
     {
    	 
         TenantDashboard();

  	 
    	 break;
     }//end case 3
      case 4:
      {
    	 
    	 break;
     }//end case 4
     case 5:{
	 
	 break;
     }//end case 5
     
     default:
     {}
     }
	
	

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