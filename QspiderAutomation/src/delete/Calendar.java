package delete;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) {
		// Select a perticular date from calendar
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.abhibus.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		while(true)
		{
			try {
				
		
			WebElement month = driver.findElement(By.xpath("//div[@class='container month ']//span[text()='October']"));
			if(month.getText()=="October")
			{
				driver.findElement(By.xpath("//div[@class='container date ']//span[text()='26']")).click();
				break;
			}	
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//span[@class='calender-month-change']")).click();
			}
		}
		
	
	
	}
	

}
