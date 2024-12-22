package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class AmazonBagsforBoys {

	public static void main(String[] args) throws InterruptedException {

		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//Launch the Browser
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Search for "Bags for boys"
		
		WebElement Search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Search.sendKeys("Bags for boys");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		
		//Print the Bags of Boys Result in console
		
		String Result = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span[1]")).getText();
		System.out.println(Result +" Bags for Boys");
		Thread.sleep(2000);
		
		//Select the first 2 brands of Bags in left menu
		
		driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[2]")).click();
		Thread.sleep(3000);
		
		//Choose New Arrivals in sorting
		
		WebElement Sort = driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
		Select Sorting = new Select(Sort);
		Sorting.selectByVisibleText("Newest Arrivals");
		Thread.sleep(2000);
		
		//Print the first resulting bag info (name, discounted price)

		String Bagname1 = driver.findElement(By.xpath("(//h2[@class='a-size-mini s-line-clamp-1'])[1]/span")).getText();
		System.out.println("First bag name is :" + Bagname1);
		Thread.sleep(2000);
		
		String Bagprice1 = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("First bag discounted price is :" + Bagprice1);
		Thread.sleep(2000);
		
		/*String Bagname2 = driver.findElement(By.xpath("(//h2[@class='a-size-mini s-line-clamp-1'])[2]/span")).getText();
		System.out.println("First bag name is :" + Bagname2);
		Thread.sleep(2000);
		
		/*String Bagprice2 = driver.findElement(By.xpath("(//h2[@class='a-size-mini s-line-clamp-1'])[1]/span")).getText();
		System.out.println("First bag price is :" + Bagprice2);
		Thread.sleep(2000);*/
		
		String title = driver.getTitle();
		System.out.println("Title is: "+title);
		
		driver.close();
	}

}
