package week2.day2;

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
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Sugan2");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Sugan");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps");
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("2000000");
		
		WebElement PreCurr = driver.findElement(By.xpath("//select[@id='currencyUomId']"));
		Select PreCurrDrop = new Select(PreCurr);
		PreCurrDrop.selectByValue("INR");
		Thread.sleep(2000);
		
		WebElement Industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select Indudrop = new Select(Industry);
		Indudrop.selectByVisibleText("Computer Software");
		Thread.sleep(2000);
		
		WebElement Ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select Owndrop = new Select(Ownership);
		Owndrop.selectByVisibleText("S-Corporation");
		Thread.sleep(2000);
		
		WebElement Source = driver.findElement(By.id("dataSourceId"));
		Select SourceDrop = new Select(Source);
		SourceDrop.selectByValue("LEAD_EMPLOYEE");
		Thread.sleep(2000);
		
		WebElement MarketCam = driver.findElement(By.id("marketingCampaignId"));
		Select MarketDrop = new Select(MarketCam);
		MarketDrop.selectByIndex(6);
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		

		WebElement State = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select StateDrop = new Select(State);
		StateDrop.selectByValue("TX");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		Thread.sleep(2000);
		
		//Locate the account name ,Retrieve & Verify Account name text
		
		String Accountname = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		
		//Another xpath: "//span[text()='Account Name']/following::span[1]" (Elder to younger cousin)
				
		System.out.println("Account name is : "+Accountname);
		
		//Close the Browser
		
		driver.close();
		
		
	}

}
