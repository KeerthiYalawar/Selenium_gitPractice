package ClassAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.vtiger.com/vtigercrm");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("TestUser");
		driver.findElement(By.id("password")).sendKeys("TestPwd");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		WebElement msg= driver.findElement(By.id("validationMessage"));
		String color = msg.getCssValue("color");
		System.out.println(color);
		
	}

}
