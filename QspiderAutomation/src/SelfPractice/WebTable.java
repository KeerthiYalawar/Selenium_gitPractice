package SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
		//Click Checkbox wrt item
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/table/tableWithCheck");
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//td[text()='APPLEIPhone']/preceding-sibling::td/input[@type='checkbox']"));
		Thread.sleep(2000);
		name.click();
		
		
	}

}
