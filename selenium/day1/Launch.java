package selenium.day1;

import org.openqa.selenium.edge.EdgeDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Java wait =1000 milliseconds = 1 sec
		Thread.sleep(1000);
		driver.quit();
		System.out.println("page Loaded successfully");
	
	}

}
