package ClassAssignments;

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

public class GlobalSqa {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement photoframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photoframe);
		WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement trash = driver.findElement(By.id("trash"));
		Actions action = new Actions(driver);
		action.dragAndDrop(img1, trash).perform();
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("(//a[text()='CheatSheets'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='SQL Cheat Sheet']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		for(String w:allWindows)
		{
			if(!w.equals(parentWindow))
			{
				driver.switchTo().window(w);
			break;
			}
		}
		//System.out.println(driver.findElement(By.xpath("//h1[text()='SQL Cheat Sheet']")).getText());
		WebElement element = driver.findElement(By.xpath("(//img[@data-id='6452'])[2]"));
		action.moveToElement(element).perform();
		//action.scrollByAmount(0, 500).perform();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/sql.png");
		FileHandler.copy(temp, dest);
		
		
	}
	
	
	}


