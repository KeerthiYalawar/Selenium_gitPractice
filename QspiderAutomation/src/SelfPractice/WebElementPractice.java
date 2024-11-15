package SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.name("username")).sendKeys("TestUser");
		//driver.findElement(By.name("password")).sendKeys("Testpwd");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(login.isEnabled());
		System.out.println(login.isDisplayed());
		driver.close();
	}

}
