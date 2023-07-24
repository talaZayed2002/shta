package mainclasses;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
public class database {
	 List <user> db_user=new ArrayList <user> ();
	 List <admin> db_order=new ArrayList <admin> ();
	 List <owner> db_product=new ArrayList <owner>();
	 List <Furniture> db_Furniture=new ArrayList <Furniture>();
	 List <Apartment> db_Apartment=new ArrayList <Apartment>();
 private static final Logger logger = Logger.getLogger(database.class.getName());

public  void login(String email,String password)
		{ 
    user obj0=new user();
    db_user.add(obj0);
 	obj0.email="haya@gmail.com";
	obj0.password="haya123";
	db_user.add(obj0);	
	
	  user obj1=new user();

         	obj1.email=email;
			obj1.password=password;
			

		if (!db_user.contains(obj1)) {
			db_user.add(obj1);	
		    logger.info("New tenant !"); 
		for(int i=0;i<db_user.size();i++) {
			 // logger.info(db_user.get(i).email);
			 // logger.info(db_user.get(i).password);		
		}
		}
	
		
		else
			 logger.info("this tenant already exists!"); 

			
		}
public void ShowWhichTenant(String id,String name) {
	user use=new user();
	owner own=new owner();
	Apartment apart =new Apartment();
	for(int i=0;i<db_user.size();i++) {
		if(db_user.get(i).id.equals(id)) {
		
			 logger.info( own.getId()  +             own.getName()     +"\n ");
			
		}
	}
}
  
public  void AddTenantStudent(String email,String password,String name,String type,String major,int age,String id)
{
	user obj0=new user(email, password, name, type, major, age,id);
	 if (!db_user.contains(obj0))
	 {
		    obj0.type="Student";
			db_user.add(obj0);	
		    logger.info("New tenant !");
     }
		for(int i=0;i<db_user.size();i++) {
			 //logger.info(db_user.get(i).type+db_user.get(i).password+db_user.get(i).name+db_user.get(i).major);		
		}
}
public  void AddTenantNotStudent(String email,String password,String name,String type,String major,int age,String id)
{
	user obj0=new user(email, password, name, type, major, age,id);
	 if (!db_user.contains(obj0))
	 {
		    obj0.type="Not Student";
		    obj0.major="";
		    obj0.age=0;
		    obj0.name="";
		    
			db_user.add(obj0);	
			
		    logger.info("New tenant !");
    }
		for(int i=0;i<db_user.size();i++) {
			 //logger.info(db_user.get(i).type+db_user.get(i).password+db_user.get(i).name+db_user.get(i).major);		
		}
}

public void addFurniture(String furniture,int cost_furniture) {
	Furniture obj0=new Furniture();
			obj0.type1=furniture;
			obj0.cost=cost_furniture;
	 if (!db_Furniture.contains(obj0))
		 
	 {
		 db_Furniture.add(obj0);		 
		 for(int i=0;i<db_Furniture.size();i++) {
			// logger.info(db_Furniture.get(i).type1+db_Furniture.get(i).cost);
	 }
	 }	
}



public void addBuilding(Apartment obj) {
 
	 for(int i=0;i<db_Apartment.size();i++) {
		 db_Apartment.add(obj);
		// logger.info("\n" +db_Apartment.get(i).floor);
	 }
}


public void ViewHousing2(Apartment obj1) {
	 for(int i=0;i<db_Apartment.size();i++) {
		 Apartment obj2=new Apartment();
		 obj2.setId(obj1.getId());
		 obj2.setRent(obj1.getRent());
		 obj2.setLocation(obj1.getLocation());
		 obj2.setWater(obj1.getWater());
		 obj2.setElectric(obj1.getElectric());
		 obj2.setBalcony(obj1.getBalcony());
		 obj2.setInternet(obj1.getInternet());
		 obj2.setBathrooms(obj1.getBathrooms());
		 obj2.setBedrooms(obj1.getBedrooms());
		 obj2.setPicture(obj1.getPicture());
		 obj2.setDate(obj1.date);
		 obj2.setBuildingId(obj1.getBuildingId());
		 obj2.setFloor(obj1.getFloor());
		 obj2.setNumberOfApartmentsInFloor(obj1.getNumberOfApartmentsInFloor());
		 db_Apartment.add(obj2);
		 if(obj1.getId().equals(obj2.getId())) {
			 ViewHousing(obj1);
		 }
	 }
	
}




public void ViewHousing(Apartment obj1) {
	 for(int i=0;i<db_Apartment.size();i++) {
		 Apartment obj2=new Apartment();
		 obj2.setId(obj1.getId());
		 obj2.setRent(obj1.getRent());
		 obj2.setLocation(obj1.getLocation());
		 obj2.setWater(obj1.getWater());
		 obj2.setElectric(obj1.getElectric());
		 obj2.setBalcony(obj1.getBalcony());
		 obj2.setInternet(obj1.getInternet());
		 obj2.setBathrooms(obj1.getBathrooms());
		 obj2.setBedrooms(obj1.getBedrooms());
		 obj2.setPicture(obj1.getPicture());
		 obj2.setDate(obj1.date);
		 obj2.setBuildingId(obj1.getBuildingId() );
		 obj2.setFloor(obj1.getFloor());
		 obj2.setNumberOfApartmentsInFloor(obj1.getNumberOfApartmentsInFloor());
		 db_Apartment.add(obj2);
		/* logger.info("\n" +db_Apartment.get(i).id +db_Apartment.get(i).rent + db_Apartment.get(i).location+ 
	 db_Apartment.get(i).water	 +  db_Apartment.get(i).electric+ db_Apartment.get(i).balcony + db_Apartment.get(i).internet+ 
	 db_Apartment.get(i).balcony+ db_Apartment.get(i).bedrooms +db_Apartment.get(i).picture
	 + db_Apartment.get(i).date+db_Apartment.get(i).residence_name +db_Apartment.get(i).residence_id+ 
	 db_Apartment.get(i).floor+ db_Apartment.get(i).number_of_apartments);*/
		 
		 
	 }
	 
}

}