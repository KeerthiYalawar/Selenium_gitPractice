package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wiat = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		WebElement menLink = driver.findElement(By.partialLinkText("MEN"));
		
		Actions action = new Actions(driver);
		action.moveToElement(menLink).perform();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("T-Shirts")).click();
		driver.findElement(By.linkText("Jeans")).click();
		
		

	}

}
