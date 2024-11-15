package automationClass;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHeightWidth {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		int height = size.getHeight();
		int width = size.getWidth();
		
	}

}
