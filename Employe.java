package method;

public class Employe {

	public static int salary(int hours,int perday) {
		 
		int permonth = hours*perday;
		return permonth;
		
		
	}
	
	public static void main(String[] args) {
		
		int hours = 10;
		int perday= 1000;
		int totalamount;
		totalamount=Employe.salary(hours, perday);
		
		System.out.println(totalamount);
		

	}

}
