package ClassAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountImages {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		List<WebElement> totalImages = driver.findElements(By.tagName("img"));
		System.out.println("Image counts is " +totalImages.size());
		totalImages.get(totalImages.size()-1).click();
		for(WebElement i : totalImages)
		{
			System.out.println(i.getText());
			
		}
		driver.close();
	}

}
