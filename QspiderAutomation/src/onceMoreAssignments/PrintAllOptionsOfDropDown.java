package onceMoreAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionsOfDropDown {

	public static void main(String[] args) {
		// Print all the available options of dropdown
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement yeardrp = driver.findElement(By.id("year"));
		Select year= new Select(yeardrp);
		List<WebElement> allOptions = year.getOptions();
		System.out.println("Total available Options in the Year dropdown : " +allOptions.size());
		
		for(WebElement e : allOptions)
		{
			System.out.println(e.getText());
		}

	}

}
