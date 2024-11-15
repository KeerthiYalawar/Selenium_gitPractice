package onceMoreAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement countrydrp = driver.findElement(By.id("select-multiple-native"));
		Select countyOptions = new Select(countrydrp);
		
		//Check if the dropdown is multiselect or not
		boolean isit = countyOptions.isMultiple();
		System.out.println("Is the dropdown multiselect: " +isit);
		
		//Select the options from dropdown
		
		countyOptions.selectByIndex(0);
		countyOptions.selectByVisibleText("Canada");
		countyOptions.selectByValue("India");
		//Print Selected dropdownOptions
		
		List<WebElement> allselected = countyOptions.getAllSelectedOptions();
		System.out.println("The selected options are");
		for (WebElement e:allselected)
		{
		System.out.println(e.getText());
	
		}
		//Check for selected options after deselect:
		countyOptions.deselectAll();
		System.out.println("The selected options after deselect: " +countyOptions.getAllSelectedOptions().size());
		
		
		}

}
