package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoveByOffSet {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wiat = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement SearchLink = driver.findElement(By.linkText("Search"));
		
		Actions action = new Actions(driver);
	action.scrollToElement(SearchLink).perform();
	action.scrollByAmount(0, 500).perform();
	Thread.sleep(2000);
	action.scrollByAmount(500, 0).perform();
	}

}
