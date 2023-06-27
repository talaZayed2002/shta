package mainclasses;

public class admin {
	
		 String address;
		 public String email;
		 String name;
		 String id;
		 public String password;
		 String phone;

		public static int check(String string1, String string2) {
       if((string1.equals("shafiqa@gmail.com") && string2.equals("shafiqa123")) ||
					(string1.equals("tala@gmail.com") && string2.equals("tala1234")) )
					{			
				return 1;			
						
					}
					
			return 0;
			
			
		}

		/*public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		
		
		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}*/
		
	}


