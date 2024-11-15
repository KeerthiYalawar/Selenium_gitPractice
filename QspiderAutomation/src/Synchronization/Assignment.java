package Synchronization;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 String time = LocalDateTime.now().toString().replaceAll(":", "");
		driver.navigate().to("https://demowebshop.tricentis.com/141-inch-laptop");
		WebElement addtocart = driver.findElement(By.xpath("//div[@class='product-name']/following::div[@class='add-to-cart-panel']//input[@value='Add to cart']"));
		addtocart.click();
		
		WebElement notification = driver.findElement(By.xpath("//div[@id='bar-notification']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(notification));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/addtocartNotification"+time+".png");
		FileHandler.copy(temp, dest);
		wait.until(ExpectedConditions.invisibilityOf(notification));
		driver.findElement(By.xpath("//a[text()='Log in']")).click();	
		driver.close();
		
		
	}

}
