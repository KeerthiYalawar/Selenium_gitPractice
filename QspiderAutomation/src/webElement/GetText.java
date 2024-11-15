package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String errmsg = driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful')]")).getText();
		System.out.println("message displayed on webpage:" +errmsg);
		if(errmsg.contains("unsuccessful"))
		{
			System.out.println("err msg Validation Successful!");
		}
		else
		{
			System.out.println("err msg validation Not Successful");
		}
	}

}
