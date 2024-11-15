package listners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplimentation.class)
public class TestScript extends BaseClass{
	@Test
	public void login()
	{
		Reporter.log("Click on Login link",true);
		driver.findElement(By.linkText("Log in")).click();
		
		Reporter.log("Enter Valid credentials",true);
		driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhis1234");
		
		Reporter.log("Click on Login button",true);
		driver.findElement(By.xpath("//input[@value='Log in']")).submit();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Home Page is not displayed");
		Reporter.log("Home Page is displayed",true);
		
		
	}
}
