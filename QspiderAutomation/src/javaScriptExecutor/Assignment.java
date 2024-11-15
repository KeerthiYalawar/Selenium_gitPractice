package javaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.abhibus.com/");
		WebElement we = driver.findElement(By.xpath("//h2[text()='Online Bus Booking Services']"));
		js.executeScript("arguments[0].scrollIntoView(false)", we);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/JSExecutorAssignment.png");
		FileHandler.copy(src, dest);
	}

}
