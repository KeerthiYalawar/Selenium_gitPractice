package automationClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		Thread.sleep(150000);
		driver.findElement(By.id("browserButton3")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		for(String s :windowHandles )
		{
			System.out.println(s);
		}

	}

}
