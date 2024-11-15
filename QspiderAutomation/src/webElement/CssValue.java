package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");
		WebElement register = driver.findElement(By.linkText("Register"));
		String color = register.getCssValue("color");
		String size = register.getCssValue("font-size");
		System.out.println("colour is :" + color +"\n" + "Font Size is :" +size);
		
	}

}
