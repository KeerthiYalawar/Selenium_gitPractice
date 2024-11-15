package SelfPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwap {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.shoppersstack.com/products_page/23");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		String ParentWindow = driver.getWindowHandle();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='compare']")).click();
		Set<String> allhandles = driver.getWindowHandles();
		for(String s : allhandles)
		{
			driver.switchTo().window(s);		
			String url = driver.getCurrentUrl();
			System.out.println(url);
			System.out.println("-----------------------");
			if(url.contains("flipkart"))

			{
				Point position = driver.manage().window().getPosition();
				System.out.println(" X : " + position.getX());
				int flipkartX = position.getX();
				System.out.println(" Y : " + position.getY());
				int flipkartY = position.getY();
				driver.manage().window().setPosition(new Point (800,250));
			}
			if(url.contains("ebay"))
			{
				
					Point position = driver.manage().window().getPosition();
					System.out.println(" X : " + position.getX());
					int ebayX = position.getX();
					System.out.println(" Y : " + position.getY());
					int ebaY = position.getY();
					driver.manage().window().setPosition(new Point (10,250));
			
			}
		}




	}}
