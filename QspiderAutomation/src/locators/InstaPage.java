package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[contains(@aria-label, 'Phone number')]")).sendKeys("TestName");
		driver.findElement(By.xpath("//input[contains(@aria-label, 'Password')]")).sendKeys("Test123");
	}

}
