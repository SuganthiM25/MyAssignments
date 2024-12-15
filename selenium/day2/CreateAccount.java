package selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		
		//Click on the "Accounts" tab
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(2000);
		
		//Create an Account
		
		//Section1
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Suganthi");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Sugan");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps");
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("2000000");
		
		WebElement PreCurr = driver.findElement(By.xpath("//select[@id='currencyUomId']"));
		Select PreCurrDrop = new Select(PreCurr);
		PreCurrDrop.selectByValue("INR");
		Thread.sleep(2000);
		
		WebElement Industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select Indudrop = new Select(Industry);
		Indudrop.selectByVisibleText("Telecommunications");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("50");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		
		//Contact Information
		
		WebElement ConCode = driver.findElement(By.xpath("//input[@id='primaryPhoneCountryCode']"));
		ConCode.clear();
		ConCode.sendKeys("+91");
		
		//
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		//get the Title of the page
		
		String Title = driver.getTitle();
		
		System.out.println("Title is: "+Title);
		
		//Close the Browser
		
		driver.close();
		
		
	}

}
