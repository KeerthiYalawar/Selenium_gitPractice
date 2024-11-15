package onceMoreAssignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouserightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    driver.get("https://www.google.com/");
	    Thread.sleep(2000);
	    Actions action = new Actions(driver);
	    action.contextClick().perform();
	   

	}

}
