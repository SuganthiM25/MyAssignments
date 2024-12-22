package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com");
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Java wait =1000 milliseconds = 1 sec
		Thread.sleep(1000);
		 String title = driver.getTitle();
		 System.out.println("Title is: "+title);
		 
		//Enter the username as ‘demosalesmanager'
		WebElement UN = driver.findElement(By.id("username"));
		UN.sendKeys("demosalesmanager");
		WebElement PW = driver.findElement(By.id("password"));
		PW.sendKeys("crmsfa");
		
		//locate an element by class and click on button to login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//locate an element by linkText
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Filling mandatory fields
		
		//locate the company name field and enter the company name as Testleaf
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test leaf ");
		//locate the first name field and enter the first name 
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sugan23");
		//locate the last name field and enter the last name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Mani");
				
		
		//Select Employee in the source dropdown (using index)
		
		WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select SourceDrop = new Select(Source);
		SourceDrop.selectByIndex(4);
		
		//Select Automobile in the Marketing Campaign (using visibleText)
		
		WebElement MarketCam = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select MarketDrop = new Select(MarketCam);
		MarketDrop.selectByVisibleText("Automobile");
		
		//Select Corporation in Ownership (using value)
		
		WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select OwnerDrop = new Select(Ownership);
		OwnerDrop.selectByValue("OWN_CCORP");
		
		//Click on the Create Lead button.
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
