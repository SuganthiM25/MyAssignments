package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		//Initialize the driver
		ChromeDriver driver = new ChromeDriver();
		
		//Launch Url and maximize the browser		
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Click on the Checkboxes and Verify the checkboxes are checked
		
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		Thread.sleep(2000);
		
		WebElement verify = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		String actual = verify.getText();
		String expected = "Checked";
		
		if (actual.equals(expected))
		{
			System.out.println("Basic Checkboxes are checked");
		}
		else
		{
			System.out.println("Basic Checkboxes are not checked");	
		}
		Thread.sleep(3000);
		
		//Click on your favorite language (assuming it's related to checkboxes).
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		//driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		Thread.sleep(2000);
		
		//Click on the "Tri-State Checkbox."
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]")).click(	);
		Thread.sleep(2000);
		WebElement TriOption = driver.findElement(By.xpath("//div[@class='ui-growl-message']/p"));
		String option = TriOption.getText();
		System.out.println("Option selected for Tristate is: "+option);
		Thread.sleep(1000);
		
		//Click on the "Toggle Switch.
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
	
		
		WebElement dis = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]"));
		 if (dis.isDisplayed()) {
             System.out.println("The checkbox is displayed.");
         } else {
             System.out.println("The checkbox is not displayed.");
         }
		 driver.close();
	}
	
	

}
