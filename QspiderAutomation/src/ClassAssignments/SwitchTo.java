package ClassAssignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		
		 SwitchToWindow(driver, "NopCommerce");
		 System.out.println(driver.getTitle());
		
		  driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		SwitchToWindow(driver, "Sign");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tanvi and Roohi are sisters !");
		
		
	} 

	public static void SwitchToWindow(WebDriver driver,String title)
	{
		Set<String> allwindows = driver.getWindowHandles();
		for(String s : allwindows)
		{
			driver.switchTo().window(s);
			String actltitle = driver.getTitle();
			if(actltitle.equals(title))
			{
				break;
			}
		} 
	}
}
