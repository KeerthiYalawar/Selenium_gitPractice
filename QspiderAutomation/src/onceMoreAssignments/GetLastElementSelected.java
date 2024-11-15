package onceMoreAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetLastElementSelected {
// Get the last element from the dropdown and select it
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement monthdrp = driver.findElement(By.id("month"));
		Select month = new Select (monthdrp);
		int monthlastelement = month.getOptions().size()-1;
		month.selectByIndex(monthlastelement);
		
		WebElement yeardrop = driver.findElement(By.id("year"));
		Select year = new Select(yeardrop);
		int yearlastoption = year.getOptions().size()-1;
	
		year.selectByIndex(yearlastoption);
		
	}

}
