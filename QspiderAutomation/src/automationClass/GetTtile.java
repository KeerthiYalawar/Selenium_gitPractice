package automationClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTtile {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			
			System.out.println("Navigated Successfully!");
		}
		
		else
		{
			System.out.println("Navigation not successful");
		}
		
		
		}

}
