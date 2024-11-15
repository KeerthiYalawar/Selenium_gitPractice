package dropdown_list;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetSelectedOption {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		WebElement price = driver.findElement(By.id("cars"));
		Select priceDropdown=new Select(price);
		priceDropdown.selectByIndex(2);
		priceDropdown.selectByIndex(1);
		priceDropdown.selectByIndex(3);
		
		WebElement firstElement = priceDropdown.getFirstSelectedOption();
		System.out.println(firstElement.getText());
		
		List<WebElement> selectedElements = priceDropdown.getAllSelectedOptions();
		System.out.println(selectedElements.size());
		for(WebElement i :selectedElements)
		{
			System.out.println(i.getText());
		}

	}

}
