package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKey {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("navbar-search-input")).sendKeys("Selenium",Keys.ENTER);
		
	}

}
