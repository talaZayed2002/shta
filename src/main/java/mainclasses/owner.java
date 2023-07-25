package mainclasses;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class owner {
	   public String email;
       public  String password;     
	 public  String address;
	   public String name;
	    String id;	   
	   String phone;
	
	   owner o;
       static List <owner> ownerarray=new  ArrayList <owner> ();
       boolean log=false;
       public owner() {
    	   this.initialuser();
       }

   	public  void initialuser() {
   		this.address="nablus";
		this.email="Ragheb@gmail.com";
		this.setId("3");
		this.password="123";
		this.phone="056998527";
		this.setName("Ragheb");
	
		ownerarray.add(this);
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

	public static void signUp(String email2, String password2) {
		// TODO Auto-generated method stub
		
	}

   	
}
