package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathContains {

		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.instagram.com/");
			driver.findElement(By.xpath("//span[text()='Sign up']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Contact Uploading & Non-Users')]")).click();
			List<WebElement> alllinks = driver.findElements(By.tagName("a"));
			for(WebElement i : alllinks)
			{
				System.out.println(i.getText());		
				}
			
			
			
		
			
	}

}
