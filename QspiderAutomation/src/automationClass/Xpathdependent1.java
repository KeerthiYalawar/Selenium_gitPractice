package automationClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdependent1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.dunzo.com/search");
		driver.findElement(By.xpath("//input[@placeholder='Search for item or a store']")).sendKeys("apples");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//p[text()= 'Apple - Kashmiri'])[1]/../..//p[contains(text(),'₹')]")).click();
	}

}
