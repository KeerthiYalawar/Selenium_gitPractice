package onceMoreAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Durations;

public class SelectOptionsOneByOne {

	public static void main(String[] args) {
		// SelectOptionsOneByOne from the dropdown
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement monthdrp = driver.findElement(By.id("month"));
		Select month = new Select(monthdrp);
		List<WebElement> allOptions = month.getOptions();
		
		for(WebElement e:allOptions)
		{
			month.selectByVisibleText(e.getText());
		}

	}

}
