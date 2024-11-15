package ClassAssignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.shoppersstack.com/products_page/23");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String ParentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@name='compare']")).click();
		Set<String> handles =driver.getWindowHandles();
		System.out.println("All Handles : " + handles);
		System.out.println("Parent Window : " +ParentWindow);
		for(String s : handles)
		{
			driver.switchTo().window(s);
			String url = driver.getCurrentUrl();
			if(url.contains("flipkart")) {
				break;
			}
				
			
			
		}
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("mobiles");
		
		
		driver.switchTo().window(ParentWindow);
		
		driver.findElement(By.id("loginBtn")).click();
		
	}

} 
