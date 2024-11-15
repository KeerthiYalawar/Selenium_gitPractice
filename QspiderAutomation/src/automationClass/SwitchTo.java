package automationClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.id("")).click();
		Set<String> allwindowIds = driver.getWindowHandles();
		for(String id:allwindowIds)
		{
			System.out.println(id);
			driver.switchTo().window(id);
			driver.close();
		}
	}

}
