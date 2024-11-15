package onceMoreAssignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		int xCoordinate = driver.manage().window().getPosition().getX();
		System.out.println(xCoordinate);
		int yCoordinate = driver.manage().window().getPosition().getY();
		System.out.println(yCoordinate);

	}

}
