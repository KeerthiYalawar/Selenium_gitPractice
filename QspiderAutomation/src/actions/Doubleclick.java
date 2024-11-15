package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demoapp.skillrary.com/product.php?product=selenium");
			Actions act = new Actions(driver);
			WebElement addicon = driver.findElement(By.id("add"));
		act.doubleClick(addicon).perform();
		act.doubleClick(addicon).perform();

	}

}
