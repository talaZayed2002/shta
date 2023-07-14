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
		
			 logger.info("|"+  own.id                + "|"  + "|" + own.name             +"\n ");
			
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
		 logger.info("\n" +db_Apartment.get(i).floor);
	 }
}

public void ViewHousing() {
	 for(int i=0;i<db_Apartment.size();i++) {
		 Apartment obj0=new Apartment();
		 
		 
	 }
	 
}

}