package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendarclick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		int count=0;
		Actions action = new Actions(driver);
		while(true)
			try {
				WebElement dateToSelect = driver.findElement(By.xpath("//span[text()='January']/../../..//span[text()='2']"));
				action.click(dateToSelect).perform();
				break;
			}
		catch (Exception e) 
		{
			if(count==0)
			{
				WebElement arrow = driver.findElement(By.xpath("//span[@class='calender-month-change']"));
				action.click(arrow).perform();
				count++;
			}
			else
			{
				driver.findElement(By.xpath("(//span[@class='calender-month-change'])[2]")).click();
			}

		}


	}

}
