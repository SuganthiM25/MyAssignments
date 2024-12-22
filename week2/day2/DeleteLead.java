 package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Login to the TestLeaf
		
		WebElement UN = driver.findElement(By.id("username"));
		UN.sendKeys("demosalesmanager");
		WebElement PW = driver.findElement(By.id("password"));
		PW.sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		
		//Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		
		//Click on the Leads tab
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(1000);
	
		//Click on the find leads from shortcut
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(1000);
		
		//click on the phone tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		Thread.sleep(1000);
		
		//Enter the phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("318");
		Thread.sleep(1000);
		
		//Click on Findleads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		
		//Capture the lead ID of the first resulting lead and click on same.
		
	    WebElement LeadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		Thread.sleep(1000);
		String id = LeadId.getText();
		System.out.println("First Lead ID is :"+id);
		LeadId.click();
		
		//Delete the first resulting ID
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		Thread.sleep(1000);
		
		//go to find lead
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(id);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		
		//Verify the presence of the message "No records to display" in the Lead List.
		
		WebElement verify = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
		String actual = verify.getText();
		String expected = "No records to display";
		
		if (actual.equals(expected))
		{
			System.out.println("Record Deleted Successfully");
		}
		else
		{
			System.out.println("Record not Deleted Successfully");	
		}
		driver.close();
	}

}
