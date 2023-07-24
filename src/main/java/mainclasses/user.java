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
	   int age;
	 
	
	   String major;
	   String type; // student or not .
	  
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
			this.email="sht@gmail.com";
			this.id="1";
			this.password="1";
			this.phone="056998521";
			this.name="shafiqaTala";
			this.major="Computer Engineering";
			this.type="student";
			
		
			userarray.add(this);
			
				}
	
		public static int checkuser(String string1, String string2) {
			if((string1.equals("haya@gmail.com") && string2.equals("haya123")) )
					{			  logger.info("\n u logged in sucessfully as tenant"); 
					db.login(string1,string2);
						return 1;
						
					}
			else {
				
				db.login(string1,string2);
		    	
				
			}
			   return 0;
		}
		
		
		public void signup(String str1,String str2) {
	       u1.email=str1;
	       u1.password=str2;
	       userarray.add(this); // back plz !	
			
		}
//String email,String password,String name,String type,String major)
		public user( String email, String password, String name, String type, String major, int age,String id) {
			super();

			this.email = email;
			this.name = name;
			this.password = password;
			this.age = age;
			this.major = major;
			this.type = type;
			this.id=id;
	
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getMajor() {
			return major;
		}

		public void setMajor(String major) {
			this.major = major;
		}

		public boolean isLog() {
			return log;
		}

		public void setLog(boolean log) {
			this.log = log;
		}
		
	
		
		
	}
