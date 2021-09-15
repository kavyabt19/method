package  com.xworkz.method;

public class Tollgate {

	public static void payment() {
		System.out.println("Amount is paid");
	}
	public static void openGate() {
		System.out.println("Gate is opened");
	}
	public static void closeGate() {
		System.out.println("Gate is closed");
	}
	
	public static void main(String[] args) {
		
		Tollgate.payment();
		Tollgate.openGate();
		Tollgate.closeGate();
		
	}

}
