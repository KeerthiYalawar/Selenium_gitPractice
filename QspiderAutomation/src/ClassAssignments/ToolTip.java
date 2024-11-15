package ClassAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.name("q"));
		System.out.println(search.getAttribute("placeholder"));
		//WebElement SearchBox=driver.findElement(By.linkText("Become a Seller"));
		//System.out.println(SearchBox.getAttribute("title"));
				
	}

}
