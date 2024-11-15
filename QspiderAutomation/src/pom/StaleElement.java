package pom;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
		
		SkillRaryPage sk=new SkillRaryPage(driver);
		sk.getSearchField().sendKeys("selenium",Keys.ENTER);
		Thread.sleep(2000);
		sk.getSearchField().sendKeys("Testing");
		
		
	}

}
