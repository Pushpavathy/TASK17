package task17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch browser
		
		WebDriver driver = new ChromeDriver();
		
		//Get the URL
		
		driver.get("https://demoblaze.com/index.html");
		
		// maximize the window.
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Locate laptop option & click
		
		WebElement laptop = driver.findElement(By.partialLinkText("Laptops"));
		laptop.click();
	
		
		// CLick on first laptop 
		
		WebElement cartadd = driver.findElement(By.xpath("//a[contains(text(),'Sony vaio i5')]"));
		cartadd.click();
		
		// add to card button
		
		WebElement addcart = driver.findElement(By.partialLinkText("Add to cart"));
		addcart.click();
		
		

	}

}
