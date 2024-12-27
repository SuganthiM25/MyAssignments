package week3.day2;

public class Edge extends Browser{
	
	public void takeSnap()
	{
		System.out.println("Take the Snap");
	}
	public void clearCookies()
	{
		System.out.println("Clear the cookies");
	}

	public static void main(String[] args) {
		Edge EBro = new Edge();
		EBro.browserName = "Edge";
		EBro.browserVersion = 4.8;
		EBro.openURL();
		EBro.takeSnap();
		EBro.clearCookies();
		EBro.closeBrowser();
	}

}
