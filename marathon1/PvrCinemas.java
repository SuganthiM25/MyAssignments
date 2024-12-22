package marathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch the Browser
		
		driver.get("https://www.pvrcinemas.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//h6[@class='cities-name pointer'])[6]")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
		Thread.sleep(2000);
		
			
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		Thread.sleep(1000);
				
		WebElement Movie = driver.findElement(By.xpath("(//span[text()='MUFASA: THE LION KING'])[2]"));
		Movie.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='10:55 PM']")).click();
		Thread.sleep(2000);
		//Book
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//Accept the terms
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(2000);
		
		/*driver.findElement(By.xpath("//button[@class='sc-iBPTVF eafRB reject-terms']")).click();
		Thread.sleep(1000);*/
		//Select the Seat &proceed
		driver.findElement(By.xpath("//span[@id='CL.CLUB|K:14']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(1000);
		//print the seat number , price and proceed
		String SeatNumber = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		System.out.println("Seat number " +SeatNumber);
		Thread.sleep(2000);
		
		String GrandTotal = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//span")).getText();
		System.out.println("Grand Total is :" +GrandTotal);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='sc-dQpIV kXNFEA btn-proceeded']")).click();
		Thread.sleep(1000);
		//Close the popup
		driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]//i")).click();
		Thread.sleep(1000);
		
		String title = driver.getTitle();
		System.out.println("Title is: "+title);
		
		driver.close();
		
	}

}
