package method;

public class WhereIsMyTrain {

	public static String hubliExpress(int Trainno, String time) {

		return " Hubli Express Arrives at" + time + " train number " + Trainno;

	}

	public static String ticketBooking(String coach, int seatnumber) {

		return coach + " coach and seat number " + seatnumber;

	}

	public static void main(String[] args) {

		String hubliExpress = WhereIsMyTrain.hubliExpress(06567, " 9AM");
		System.out.println(hubliExpress);
		String ticketBooking = WhereIsMyTrain.ticketBooking(" A036", 28);
		System.out.println(ticketBooking);

	}

}
