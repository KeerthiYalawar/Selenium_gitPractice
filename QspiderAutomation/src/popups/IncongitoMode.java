package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncongitoMode {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		//Opens browser in incognito mode
		options.addArguments("--incognito");
		//Maximizes the brwoser window
		//options.addArguments("--start-maximized");
		options.addArguments("--start-fullscreen");
		//the Options setti ngs will be applied to Chrome Browser on launching
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.myntra.com/");
		driver.findElement(By.className("desktop-main")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();

	}

}
