package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToLearnSoftAssert {

	@Test(dependsOnMethods="login1",priority=2)
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(driver.getTitle(), "Demo Web ", "Welcome page not displayed");
		Reporter.log("Welcome page displayed",true);
		
		driver.findElement(By.linkText("Log in")).click();
		
		soft.assertEquals(driver.getTitle(), "Demo Web Shop. Login","Login page not displayed");
		Reporter.log("Login page displayed",true);
		
		soft.assertAll();
		
		
		
	}
	
	@Test(priority=1)
	public void login1()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com1/");
	}
}
