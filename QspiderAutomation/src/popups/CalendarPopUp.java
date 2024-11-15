package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://www.abhibus.com/");
		
	 while(true)
		 try {
			 driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
			WebElement month = driver.findElement(By.xpath("//div[@class='container month ']//span[text()='January']"));
			if(month.getText()=="January")
			{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='2']")).click();
			 break;
			}
			
				//WebElement year = driver.findElement(By.xpath("//div[@class='container month ']//span[text()='January']/following-sibling::span[text()='2025']"));
			
		} catch (Exception e) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[@class='year']//following::span[@class='calender-month-change']")).click();
			}
		

		
		

  
		
		
  
		

	}

}
