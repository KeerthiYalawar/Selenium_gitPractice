package onceMoreAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownOneByOne {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		 WebElement monthdr = driver.findElement(By.id("month"));
		 Select sel = new Select(monthdr);
		 List<WebElement> allOptions = sel.getOptions();
		 for(WebElement s:allOptions)
		 {
			 sel.selectByVisibleText(s.getText());
		 }
		 WebElement yeardr = driver.findElement(By.id("year"));
		 Select sel1 = new Select(yeardr);
		 List<WebElement> allYears = sel1.getOptions();
		 System.out.println("Total options available in year dropdown are: " +allYears.size());
		 for(WebElement e:allYears)
		 {
			 sel1.selectByVisibleText(e.getText());
			 System.out.println(e.getText());
		 }
		

	}

}
