package com.xworkz.method;

public class LaptopSpecifications {
	
	public static  void ramsize(int ram) {
		
		System.out.println("The RAM of HP Windows 10 laptop is "+ram+"GB" );
	}

	public static void main(String[] args) {
		
	int ram = 16;
	LaptopSpecifications.ramsize(ram);
		
	}

}
