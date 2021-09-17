package com.xworkz.method;

public class VtuResult {

          public static String result(String Usn ,int percentage ) {
		
		   return  "your total percentage is "+percentage;
		     
          }

	public static void main(String[] args) {
		
	String result = VtuResult.result("4su17cs030", 75);
	System.out.println(result);

	}

}
