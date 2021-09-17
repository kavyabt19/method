package method;

public class WebsitLogin {
	
	public static String loginPage(String Username ,String Password ) {
		
		   return  "you have successfully login \n  "+ Username+"\n"+ Password;
		     
       }

	public static void main(String[] args) {
		
		String loginPage =  WebsitLogin.loginPage(" kavya", " kavya@123");
		System.out.println(loginPage);

	}

}
