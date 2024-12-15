package selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLead {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com");
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Java wait =1000 milliseconds = 1 sec
		Thread.sleep(1000);
		
	    //Print the title of the page
		 String title = driver.getTitle();
		 System.out.println("Title is: "+title);
		 
		//Login page
		WebElement UN = driver.findElement(By.id("username"));
		UN.sendKeys("demosalesmanager");
		
		WebElement PW = driver.findElement(By.id("password"));
		PW.sendKeys("crmsfa");
	
			
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		
		//Click on the Leads tab
		
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on the find leads from shortcut
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Search by First name
		
		driver.findElement(By.xpath(("(//input[@name='firstName'])[3]"))).sendKeys("Gokul");
		Thread.sleep(2000);
		driver.findElement(By.xpath(("//button[text()='Find Leads']"))).click();
		driver.findElement(By.xpath(("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']"))).click();
		driver.findElement(By.xpath(("//div[@class='x-grid3-body']/div[1]"))).click();
	}

}
