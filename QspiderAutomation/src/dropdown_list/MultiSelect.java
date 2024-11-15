package dropdown_list;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		WebElement price = driver.findElement(By.id("cars"));
		
		Select priceListbox = new Select (price);
		priceListbox.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		priceListbox.selectByValue("399");
		
	}

}
