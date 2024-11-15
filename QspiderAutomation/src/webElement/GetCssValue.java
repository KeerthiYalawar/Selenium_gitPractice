package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		WebElement errmsg = driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful')]"));
		String color = errmsg.getCssValue("color");
		String font = errmsg.getCssValue("font-family");
		System.out.println("color is: " + color +"Font samily is:" +font);
	}

}