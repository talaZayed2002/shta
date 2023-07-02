package mainclasses;

import java.util.ArrayList;
import java.util.List;

public class owner {
	
       String address;
	   public String email;
	   String name;
	   String id;
	   public  String password;
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
		this.id="3";
		this.password="123";
		this.phone="056998527";
		this.name="Ragheb";
	
		ownerarray.add(this);
   	}
   	public static int checkuser(String string1, String string2) {
		if((string1.equals("ragheb@gmail.com") && string2.equals("ragheb123")) )
				{
					return 1;
				}
		return 0;
	}
	



}
