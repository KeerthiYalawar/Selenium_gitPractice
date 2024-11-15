package onceMoreAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CopyPaste {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.freshersworld.com/user/register?src=homeheader");
		WebElement firstName = driver.findElement(By.id("firstname"));
		Actions action = new Actions (driver);
		action.sendKeys(firstName, "FirstNamebyAction").perform();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).keyDown("A").keyDown("C").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		action.keyDown(Keys.TAB).keyDown(Keys.CONTROL).keyDown("V").perform();
		

	}

}
