package dropdown_list;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownOptionsStartingWithSpecificLetter {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement monthdr = driver.findElement(By.id("month"));
		Select select = new Select(monthdr);
		List<WebElement> allOptions = select.getOptions();
		int count=0;
		for (WebElement e: allOptions)
		{
			String monthText = e.getText();
			if(monthText.startsWith("J"))
				count++;
			
		
		}
		System.out.println("The number of Months starting with J are" +count);
	
	}

}
