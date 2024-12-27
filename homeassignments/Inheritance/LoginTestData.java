package homeassignments.Inheritance;

public class LoginTestData extends TestData {
	
	public void  enterUsername() 
    {
			System.out.println("Enter the Username");
    }
	public void  enterPassword()
    {
			System.out.println("Enter the password");
    }

	public static void main(String[] args) {
		
		LoginTestData Login = new LoginTestData();
		Login.enterCredentials();
		Login.enterUsername();
		Login.enterPassword();
		Login.navigateToHomePage();

	}

}
