package mainclasses;

import java.util.Scanner;
import java.util.logging.Logger;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
public class main {
private static final Logger logger = Logger.getLogger(main.class.getName());
static Scanner s=new Scanner(System.in);
static void start1() {
	  logger.info(" \n"+"                                    HELLO\n"+
	  		      "                            WELCOME TO SAKANCCOM \n"+
                  "                    Please choose your type: \n" +
			      "                    1-Admin \n"+
                  "                    2-Tenant\n"+
			      "                    3-Owner\n") ;
	 
}


public static void main(String[] args) 
{	
	start1();
	
}//end public static void main(String[] args) 



}// end main class 