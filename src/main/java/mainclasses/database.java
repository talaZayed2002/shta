package mainclasses;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
public class database {
	 List <user> db_user=new ArrayList <user> ();
	 List <admin> db_order=new ArrayList <admin> ();
	 List <owner> db_product=new ArrayList <owner>();
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
			

		if (!db_user.contains(obj1)&&!db_user.contains(obj0)) {
			db_user.add(obj1);	
		    logger.info("New tenant !"); 
		for(int i=0;i<db_user.size();i++) {
			  // logger.info(db_user.get(i).email);
			  // logger.info(db_user.get(i).password);		
		}
		}
		if (!db_user.contains(obj0)) {
			 logger.info("this tenant already exists!"); 

		}
		
		
		
		else
			 logger.info("this tenant already exists!"); 

			
		}
  
public  void AddTenantStudent(String email,String password,String name,String type,String major)
{
	
	
}
public  void AddTenantNotStudent(String email,String password,String name,String type,String major)
{
	type="not student";
	
}

}
