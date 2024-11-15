package utility;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCorrectWindowHandle {

	//Swap the window position

	public static void SwitchToWindow(WebDriver driver,String url)
	{
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		for(String id : allwindows)
		{
			driver.switchTo().window(id);
			//If matching switch to matching window 
			String actlUrl = driver.getCurrentUrl();
			if(actlUrl.contains(url))
			{
				break;
			}
			//If no matching window switch back to parent window
			driver.switchTo().window(parentwindow);
			break;
		}
		

		

	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.shoppersstack.com/products_page/23");
		driver.manage().window().maximize();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//button[@id='compare']")).click();
		SwitchToWindow(driver, "flipkart");
		Point FlipKartPosition = driver.manage().window().getPosition();
		SwitchToWindow(driver, "ebay");
		Point ebayPosition = driver.manage().window().getPosition();
		driver.manage().window().setPosition(FlipKartPosition);
		SwitchToWindow(driver, "flipkart");
		driver.manage().window().setPosition(FlipKartPosition);		
	}
}