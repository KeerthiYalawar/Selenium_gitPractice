package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//span[text()='Login']")).isSelected());
		//WebElement excellentCheckbox = driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']"));
		//System.out.println(excellentCheckbox.isSelected());
		
	}

}
