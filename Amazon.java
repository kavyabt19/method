package method;

public class Amazon {

	
	    public static void categories() {
		  System.out.println("  electronic accessories\n" +"  footwear\n" + "  womens & mens clothing");
	    }
		

		public static void addToCart() {
			System.out.println("  Items is added to Cart ");
		}

		public static void paymentmethod() {
			System.out.println("  payment method\n"+ "  COD \n" +"  Phonepay \n" + "  amazon pay \n" + "  g-pay \n");
		}
		public static void OrderAndReturns() {
			System.out.println("  order placed successfull" + "\n  return are refund");
		}

		public static void main(String[] args) {
			System.out.println("  Login to Amazon\n" + "  successfully login :)");
			Amazon.categories();
			Amazon.OrderAndReturns();
			Amazon.addToCart();
			Amazon.paymentmethod();
			System.out.println("  logout\n" + "  your logout  successfully");
		}

	

}


