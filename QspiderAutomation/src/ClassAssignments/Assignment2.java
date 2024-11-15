package ClassAssignments;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Point position = driver.manage().window().getPosition();
		System.out.println("The X & Y coordinates of the page are: " +position);
		driver.quit();
	}

}
