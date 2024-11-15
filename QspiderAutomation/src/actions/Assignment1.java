package actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Right Click")).click();
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//p[contains(text(),'Are you satisfied')]/../button"));
		wait.until(ExpectedConditions.visibilityOf(button));
		Actions action = new Actions(driver);
		action.contextClick(button).perform();
		driver.findElement(By.xpath("//div[text()='No']")).click();
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots./ActionAssignment1.png");
		FileHandler.copy(temp, dest);

	}

}
