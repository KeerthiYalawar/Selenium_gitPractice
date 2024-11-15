package ClassAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("TestFirstName");
		driver.findElement(By.id("LastName")).sendKeys("TestLastName");
		driver.findElement(By.id("Email")).sendKeys("TestUser2@demo.com");
		driver.findElement(By.name("Password")).sendKeys("Password123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Password123");
		driver.findElement(By.id("register-button")).click();
		
	}

}
