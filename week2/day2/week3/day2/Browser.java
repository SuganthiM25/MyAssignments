package week3.day2;

public class Browser {
	
	String browserName ;
	double browserVersion ;
	
	public void openURL()
	
	{
		
		System.out.println("Launch the Browser " +browserName+":"+browserVersion);
	}
	
	public void closeBrowser()
	
	{
		System.out.println("Close the Browser");
	}
	
	public void navigateBack()
	
	{
		System.out.println("Navigate back to the window");
	}
	
}
