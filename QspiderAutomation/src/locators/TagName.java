package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.navigate().to("https://demowebshop.tricentis.com/");
 List<WebElement> allLinks = driver.findElements(By.tagName("a"));//anchor tag
 System.out.println(allLinks.size());
 allLinks.get(allLinks.size()-1).click(); // Clicking on the last link of the page
 for(WebElement link : allLinks)
 {
	 System.out.println(link.getText()); 
 }

 driver.close();
	}

}
