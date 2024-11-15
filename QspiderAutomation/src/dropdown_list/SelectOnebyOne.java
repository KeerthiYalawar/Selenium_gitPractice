package dropdown_list;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOnebyOne {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthDropdown);
		
		List<WebElement> allOptions = monthSelect.getOptions();
		/* using for loop selecting drop down options one by one
		 * 
		 * for(int i=0;i<=allOptions.size()-1;i++)
		{
			monthSelect.selectByIndex(i);
		}*/
		
		/* using for each selecting drop down options one by one */
		for(WebElement e : allOptions )
		{
			monthSelect.selectByVisibleText(e.getText());
			
		}

	}

}
