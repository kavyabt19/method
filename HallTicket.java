package method;

public class HallTicket {
	
	public static void hallTicket(String name1, int num ) {
		
		String username = "kavya";
		int usn = 1001;
		if (username== name1 && usn == num) {
			System.out.println("Line is open");
			
		} else {
			System.out.println("Incorrect username are usn ");

		}
		
		
	}

	public static void main(String[] args) {
		
		HallTicket.hallTicket("kavya", 1001);

	}

}
