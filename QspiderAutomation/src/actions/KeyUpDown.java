package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement firstName = driver.findElement(By.id("FirstName"));
		Actions action = new Actions(driver);
		action.sendKeys(firstName, "testfirstname");
		action.keyDown(Keys.CONTROL).keyDown("a").keyDown("c").perform();
		//action.keyUp(Keys.CONTROL).perform();
		
		action.keyDown(Keys.TAB).keyDown(Keys.CONTROL).keyDown("v").perform();
		
	

	}

}
