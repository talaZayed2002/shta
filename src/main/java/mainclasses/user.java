package mainclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
public class user {
	private static final Logger logger = Logger.getLogger(user.class.getName());

       String address;
	   public String email;
	   String name;
	   String id;
	   public  String password;
	   String phone;
	   float point=0;
	   String major;
	
		 user u1;
         static List <user> userarray=new  ArrayList <user> ();
		 boolean log=false;
		 static database db=new database();
			
	// tenant =user	 
		 public user()
		 {
			 this.initialuser();
		 }
		 	
		public  void initialuser() {
			this.address="nablus";
			this.email="ahmad@gmail.com";
			this.id="1";
			this.password="1";
			this.phone="056998521";
			this.name="ahmadjabe";
			this.major="Computer Engineering";
		
			userarray.add(this);
				}
	
		public static int checkuser(String string1, String string2) {
			if((string1.equals("haya@gmail.com") && string2.equals("haya123")) )
					{			  logger.info("\n u logged in sucessfully as admain"); 

						return 1;
					}
			else {
		    	   logger.info("\n admin please try again"); 
				return 0;
			}
		
		}
		
		
		public void signup(String str1,String str2) {
	       u1.email=str1;
	       u1.password=str2;
	       userarray.add(this); // back plz !	
			
		}
		
		

		
	}

