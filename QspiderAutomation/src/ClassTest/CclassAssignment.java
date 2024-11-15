package ClassTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class CclassAssignment {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Actions action = new Actions(driver);
		String parentTitle = driver.getTitle();
		//TakesScreenshot ts = (TakesScreenshot) driver;
		//File temp = ts.getScreenshotAs(OutputType.FILE);
		//File dest = new File("./Screenshots/ClassTest.png");
		//FileHandler.copy(temp, dest);
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Vtiger")).click();
		Set<String> windows = driver.getWindowHandles();
		for(String s:windows)
		{
			driver.switchTo().window(s);
			String actltitle = driver.getTitle();
			if(!actltitle.equals(parentTitle))
			{
				break;
			}
		}
		WebElement company = driver.findElement(By.xpath("//li[@class='nav-item dropdown'][5]"));
		
		action.moveToElement(company).perform();
		
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String phone = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]//following-sibling::p")).getText();
		System.out.println(phone);
		
		
		
	

	}

}
