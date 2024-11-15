package onceMoreAssignments;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/");
		String title = driver.getTitle();
		System.out.println("Title of the page is: " +title);
		Dimension windowSize = driver.manage().window().getSize();
		System.out.println("The window size is : " +windowSize);

	}

}
