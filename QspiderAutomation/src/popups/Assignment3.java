package popups;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/23");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		Set<String> allWindows = driver.getWindowHandles();
		for(String e:allWindows)
		{
			driver.switchTo().window(e);
			String title = driver.getCurrentUrl();
			if(title.contains("amazon"))
			{
				break;
			}
		}
		Actions action = new Actions(driver);
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		action.scrollByAmount(300, 800).perform();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/PopUpsAssignment3.png");
		FileHandler.copy(temp, dest);
		
				
	}

}
