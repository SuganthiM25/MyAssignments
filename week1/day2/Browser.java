package week1.day2;

public class Browser {
	
	 double browserVerison;
	
	public void launchBrowser() {
		System.out.println("Browser Launched Successfully");
	}
	public void loadUrl() {
		System.out.println("URL Loaded Successfully");
	}
		
	public static void main(String[] args) {
		Browser chrome = new Browser();
		Browser edge = new Browser();
		
		chrome.browserVerison = 3.2;
		System.out.println("Chrome version " + chrome.browserVerison);
		chrome.launchBrowser();
		chrome.loadUrl();
		
		System.out.println("----------------------");
		
		edge.browserVerison = 1.2;
		System.out.println("Edge version " + edge.browserVerison);
		edge.launchBrowser();
		edge.loadUrl();
		
			}
}
