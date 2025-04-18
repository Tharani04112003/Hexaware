package com.userservice;

public class userService  implements UserService {
	


		
		public void validateUsername(String username) {
			if(username.equals("Tharu"))
				System.out.println("Welcome");
			else
			System.out.println("Nothing");
			
		}

		public void checkPassword(String password) {
			if(password.length()<5) 
				System.out.println(" Short");
			else if(password.length()>15) 
				System.out.println(" Long");
			else {
				System.out.println("crct Password");
			}
			
		}
	}
}
