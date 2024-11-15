package popups;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.abhibus.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		
		String targetmonth ="January";
		String targetdate="2";
		   String monthYearLabel = "//div[@class='container month ']";
		
		boolean dateSelected = false;
		
		while(!dateSelected)
		{
			WebElement monthYearElement = driver.findElement(By.xpath(monthYearLabel));
			String displayedMonth = monthYearElement.getText();
			if(displayedMonth.contains(targetmonth))
			{
				String dateXpath = "//span[text()='"+targetdate+"']";
				WebElement dateElement = driver.findElement(By.xpath(dateXpath));
				dateElement.click();
				dateSelected=true;
				System.out.println("Selected desired date!");
				File temp = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("./Screenshots/BusBookingdate..png");
				FileHandler.copy(temp, dest);
				
			}
			else
			{
				WebElement nextarrow = driver.findElement(By.xpath("//span[@class='year']//following::span[@class='calender-month-change']"));
				if(nextarrow.isEnabled())
				{
					nextarrow.click();
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("You Cant select beyond this month : Next button is disabled");
					break;
				}
			}
			
		}
		
		
		 
		
		
		

	}

}
