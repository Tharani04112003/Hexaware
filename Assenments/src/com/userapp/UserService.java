package com.userapp;

package Userservice{

public class UserService implements IUserService {


	
	public void validateUsername(String username) {
		if(username.equals("tharu"))
			System.out.println("Welcome");
		else
		System.out.println("wrong");
		
	}

	public void checkPassword(String password) {
		if(password.length()<5) 
			System.out.println(" Short");
		else if(password.length()>15) 
			System.out.println("Long");
		else {
			System.out.println("crct Password");
		}
		
	}
}