package method;

public class PhonePe {

	public static String balanceEnquiry(int amount, int UPI) {

		return " Your Balance is " + amount;

	}

	public static String mobileRecharge(long phonenumber, int plan) {

		return " you have succesfully recharge to "+phonenumber;

	}
	public static String dthRecharge(String name, int No) {

		return " you have succesfully recharge tata Sky "+phonenumber;
;

	}
	
	public static String payToAccount(String Accountnumber, String IFSC) {

		return " Transaction Successfully done to Account" + Accountnumber;

	}
	public static String payToContact(String Name, long phoneno) {

		return " Transaction Successfully done to contact" + phoneno;

	}
	public static String bookCylinder(String gastype, int consumerno) {

		return " your" +gastype+ " cylinder as booked Successfully to"+ consumerno;

	}
	
	
	

	public static void main(String[] args) {
		String balanceEnquiry = PhonePe.balanceEnquiry(30000, 1234);
		System.out.println(balanceEnquiry);
		String mobileRecharge = PhonePe.mobileRecharge(987654210L, 199);
		System.out.println(mobileRecharge);
		
		
	}

}
