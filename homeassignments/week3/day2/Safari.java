package week3.day2;

public class Safari extends Edge {
	
	public void readerMode()
	{
		System.out.println("Read the content in Read mode");
	}
	public void fullScreenMode()
	{
		System.out.println("Read the content in fullscreen mode");
	}

	public static void main(String[] args) {
		
		Safari SBro = new Safari();
		SBro.browserName = "Safari";
		SBro.browserVersion = 4.3;
		SBro.openURL();
		SBro.takeSnap();
		SBro.clearCookies();
		SBro.readerMode();
		SBro.fullScreenMode();
		SBro.closeBrowser();

	}

}
