package com.xworkz.method;

public class Phone {

	
	public static void homeScreen() {
		System.out.println(" Whatsapp \n Instagram \n Email \n Contact");
	}
	public static void phoneCall() {
		System.out.println("call list");
	}
	
	public static void instagram() {
		System.out.println("login to instagram succesfully");
	}
	public static void whatsapp() {
		System.out.println("new notifications");
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("login to phone");
		Phone.homeScreen();
		Phone.phoneCall();
		Phone.instagram();
		Phone.whatsapp();
		System.out.println("logout to phone");
		
	}

}
