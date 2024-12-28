package homeassignments.List;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.ajio.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement Search = driver.findElement(By.xpath("//input[@name='searchVal']"));
		Search.sendKeys("bags"+Keys.ENTER);
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@name='l1l3nestedcategory']/following-sibling::label)[3]")).click();
		Thread.sleep(1000);
		
		WebElement Count = driver.findElement(By.xpath("//div[@class='filter']//strong"));
		System.out.println("No.of items :"+Count.getText());
		
		//List the number of Brands displayed in the page
		List<WebElement> Brand = driver.findElements(By.xpath("//div[@class='brand']//strong"));
		int Size = Brand.size();
		System.out.println("Number of Brands: "+Size);
		System.out.println("List of Brands as follows:");
		for(int i=0;i<Size;i++) {
			
			WebElement webElement = Brand.get(i);
			String BRN = webElement.getText();
			System.out.println(BRN);
					}
		Thread.sleep(2000);
		
		List<WebElement> BagName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		int Size1 = BagName.size();
		System.out.println("Number of Bags: "+Size1);
		System.out.println("List of Bags name as follows:");
		for(int i=0;i<Size1;i++) {
			
			WebElement webElement = BagName.get(i);
			String BN = webElement.getText();
			System.out.println(BN);
					}
		Thread.sleep(1000);
		
		driver.close();
	}

}
