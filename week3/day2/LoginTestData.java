package week3.day2;

public class LoginTestData extends TestData {

	public void enterUsername() {
		System.out.println("User name Entered");

	}
	public void enterPassword() {
		System.out.println("Password Entered");

	}
	
	public static void main(String[] args) {
		LoginTestData loginDetails = new LoginTestData();
		loginDetails.enterCredentials();
		loginDetails.enterUsername();
		loginDetails.enterPassword();
		
	}

}
