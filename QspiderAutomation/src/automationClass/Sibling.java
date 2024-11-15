package automationClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sibling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/yalaw/OneDrive/Desktop/table.html");
		String Imdb= driver.findElement(By.xpath("//td[text()='KGF']/following-sibling::td[2]")).getText();
		String position = driver.findElement(By.xpath("//td[text()='KGF']/preceding-sibling::td")).getText();
		System.out.println("Imdb rating is:  " +Imdb);
		System.out.println("Position is:  " +position);
	}

}
