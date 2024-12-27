package week3.day2;

public class Chrome extends Browser {
	
	public void openIncognito()
	{
		System.out.println("Open the Incognito tab");
	}
	public void clearCache()
	{
		System.out.println("Clear the cache");
	}

	public static void main(String[] args) {
		
		Chrome cbro = new Chrome();
		cbro.browserName = "Chrome";
		cbro.browserVersion = 3.8;
		cbro.openURL();
		cbro.openIncognito();
		cbro.clearCache();
		cbro.navigateBack();
		cbro.closeBrowser();
	}

}
