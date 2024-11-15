package ClassAssignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asignment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		String title = driver.getTitle();
		System.out.println("The title of the page is: " + title);
		driver.manage().window().maximize();
		Dimension size = driver.manage().window().getSize();
		System.out.println("Height and width of the page: " + size);
		driver.close();
		
	}

}
