package mainclasses;

import java.util.ArrayList;
import java.util.List;
public class user {
       String address;
	   public String email;
	   String name;
	   String id;
	   public  String password;
	   String phone;
	   float point=0;
	
		user u1;
 static List <user> userarray=new  ArrayList <user> ();
		 boolean log=false;
			 static database db=new database();
			
		 
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
		
			userarray.add(this);
				}
	
		public static int checkuser(String string1, String string2) {
			if((string1.equals("minna@gmail.com") && string2.equals("minna67")) )
					{
						return 1;
					}
			return 0;
		}
		
		

		
	}

