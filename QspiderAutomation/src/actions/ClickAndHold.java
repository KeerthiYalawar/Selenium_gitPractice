package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("userName")).sendKeys("Testing");
		driver.findElement(By.id("password")).sendKeys("password");
		WebElement eyeicon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		Actions action = new Actions(driver);
		action.clickAndHold().perform();
		Thread.sleep(2000);
		action.release().perform();
	}

}
