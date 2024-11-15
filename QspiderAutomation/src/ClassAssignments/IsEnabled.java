package ClassAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		 WebElement subscriber = driver.findElement(By.className("form-control"));
		
		 System.out.println("WebElement is enabled? : " +subscriber.isEnabled());
		 
		
	}

}
