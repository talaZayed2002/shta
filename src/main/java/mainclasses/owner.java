package mainclasses;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
public class owner {
	    private static final Logger logger = Logger.getLogger(main.class.getName());
	    public String email;
        public  String password;     
	    private String address;
	    private String name;
	    private String id;	   
	    private String phone;
	   	
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

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

   	    public static int checkowner(String string1, String string2) {
		  if((string1.equals("ragheb@gmail.com") && string2.equals("ragheb123")) )
		  {
			 return 1 ;
		  }
		
		  return 0;
	    }
   	    
        public static boolean idAndPhoneValidator(String idAndPhone)
        {
   	 	  if(!digitsValidator(idAndPhone)) {
   			 return false ;
   		  }
   		  if(idAndPhone.length() !=10) {
   		 	 return false ;
   		  }  
   		  return true ;
   	    }
        
   	    public static boolean urlValidator(String url)
        {
   	       try {
   	          new URL(url).toURI();
   	          return true;
   	       }
   	       catch (URISyntaxException exception) {
   	          return false;
   	       }
   	       catch (MalformedURLException exception) {
   	          return false;
   	       }
   	    }
  	    
        public static boolean yesNoValidator(String str){
        
   		  if( str.equals("yes") || str.equals("no")) {
   		      return true ;
   		  }
   		  else 
   	 	      return false ;
        }
   	
   	    public static boolean digitsValidator(String str) { 
   	      for (int i = 0; i < str.length(); i++) {
   	        if (!Character.isDigit(str.charAt(i))) { // in case that a char is NOT a digit, enter to the if code block
   	           return false;
   	        }
   	       }    
   	    	return true ; 
        }
   	
	    public static void signUp(String email , String password) {
		  boolean valid ;
		  boolean ynValid ;
		  boolean buildingExists ;
		  Scanner s = new Scanner(System.in);
		
          owner ow = new owner ();             
          ow.email = email ; 
          ow.password= password ; 
   
   	      logger.info("Please enter your information:\n");
   	    
   	      //id
   	      logger.info("\nid:");
          String id =s.nextLine();
          valid = owner.digitsValidator(id);
          while(!valid) {
       	      id =s.nextLine();
       	      valid = owner.digitsValidator(id);
          }
          ow.setId(id) ; 
          //name
          logger.info("\nname:");
          String name =s.nextLine();
          ow.setName(name) ; 
          //phone
          logger.info("\nphone:");
          String phone =s.nextLine();
          valid = owner.digitsValidator(phone);
          while(!valid) {
       	      phone =s.nextLine();
       	      valid = owner.digitsValidator(phone);
          }
          ow.setPhone(phone) ; 
          //address
          logger.info("\naddress:");
          String address  =s.nextLine();
          ow.setId(address) ;                         
          main.db_owner.add(ow);	
	 }
   	
}
