package takesScreenShotAs;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		 String time = LocalDateTime.now().toString().replace(":", "-");
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		File temp = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).getScreenshotAs(OutputType.FILE);
		
		File dest = new File ("./Screenshots/element"+time+".png");
		FileHandler.copy(temp, dest);
	}

}
