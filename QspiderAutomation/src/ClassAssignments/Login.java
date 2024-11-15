package ClassAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("TestUser2@demo.com");
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("Password123");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
 
	}

}
