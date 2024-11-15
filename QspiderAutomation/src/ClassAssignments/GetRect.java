package ClassAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Rectangle subscribe = driver.findElement(By.id("newsletter-subscribe-button")).getRect();
		System.out.println("x coordinate: " +subscribe.getX());
		System.out.println("Y coordinate: " +subscribe.getY());
		System.out.println("Height is : " +subscribe.getHeight());
		System.out.println("Width is : " +subscribe.getWidth());
		driver.close();





	}

}
