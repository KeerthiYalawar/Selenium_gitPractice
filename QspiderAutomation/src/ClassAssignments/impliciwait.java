package ClassAssignments;

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

public class impliciwait {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String time = LocalDateTime.now().toString().replaceAll(":", "");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		WebElement webtable = driver.findElement(By.xpath("//section[text()='Web Table']"));
		System.out.println("Is WebTable displayed? " +webtable.isDisplayed());
		webtable.click();
		WebElement dynamicwebtable = driver.findElement(By.xpath("//a[text()='Dynamic Web Table']"));
		System.out.println("Is DynamicWebTable displayed? " +dynamicwebtable.isDisplayed());
		dynamicwebtable.click();
		String price = driver.findElement(By.xpath("//th[text()='Apple iPhone']//following-sibling::td[4]")).getText();
		System.out.println(price);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Screenshots/price"+time +".png");
		FileHandler.copy(temp, dest);
		driver.close();
		
		
		
	}

}
