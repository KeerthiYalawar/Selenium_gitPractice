package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnDataProvider1 {
	
	@Test(dataProviderClass=DataStorage.class,dataProvider="loginData")
	public void login(String[] cred)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		driver.findElement(By.id("email")).sendKeys(cred[0]);
		driver.findElement(By.id("password")).sendKeys(cred[1]);
		driver.findElement(By.id("last")).click();
		Assert.assertEquals(driver.getTitle(), "SkillRary Ecommerce","UserFailed to Login");
		Reporter.log("User Logged in Successfully!",true);
}
}
