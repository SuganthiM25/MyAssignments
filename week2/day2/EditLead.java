package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com");
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Java wait =1000 milliseconds = 1 sec
		Thread.sleep(1000);
		 
		 
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
		
		//locate the first name (loca1) field and enter the local name		
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Mani");
		
		//locate the Department field and enter 		
		driver.findElement(By.name("departmentName")).sendKeys("DecemberBatch");
		
		//locate the Description field and enter 		
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Class of selenium webdriver");
		
		//locate the Email field and enter 
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("wwee@gmail.com");
		
		//Select the state Province
		
		WebElement State = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select StateDrop = new Select(State);
		StateDrop.selectByVisibleText("New York");
		Thread.sleep(1000);
		
		//Click on the Create Lead button.
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		
		//Click on Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		Thread.sleep(2000);
		
		//Clear Description and fill Important note
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.name("importantNote")).sendKeys("Important notes to remember");
		Thread.sleep(1000);
		//click on update button
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(1000);
		//Print the title of the page
		String title = driver.getTitle();
		System.out.println("Title is: "+title);
		driver.close();
	}

}
