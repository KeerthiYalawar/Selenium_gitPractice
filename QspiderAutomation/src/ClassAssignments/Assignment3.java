package ClassAssignments;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://flipkart.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().setPosition(new Point(200, 250));
	}

}
