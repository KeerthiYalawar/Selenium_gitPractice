package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		driver.findElement(By.xpath("//p[contains(text (),'I have work experience')]")).click();
		WebElement upload = driver.findElement(By.xpath("//input[@type='file' and @id='resumeUpload']"));
		Actions action = new Actions(driver);
		action.moveToElement(upload).perform();
		upload.sendKeys("C:\\Users\\yalaw\\OneDrive\\Desktop\\Akshata\\Keerti Yalawar.pdf");
				

	}

}
