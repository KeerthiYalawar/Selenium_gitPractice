package automationexercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4LogoutUser {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testdata/automationexerciseData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
			String email = prop.getProperty("email");
			String password = prop.getProperty("password");
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//2.Navigate to url 'http://automationexercise.com'
		driver.get(url);
		//3. Verify that home page is visible successfully
		System.out.println("The home Page displayed is: " +driver.getTitle());
		//4. Click on 'Signup / Login' button
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		//5. Verify 'Login to your account' is visible
		String loginText = driver.findElement(By.xpath("//h2[text()='Login to your account']")).getText();
		System.out.println("Message visible on Login : " +loginText);
		//6. Enter correct email address and password
		driver.findElement(By.xpath("//input[@name='password']/preceding::input[@name='email']")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		//7. Click 'login' button
		driver.findElement(By.xpath("//button[text()='Login']")).submit();
		//8. Verify that 'Logged in as username' is visible
		String loggedInUser = driver.findElement(By.xpath("//a[contains(text(),'Logged in as')]/b")).getText();
		System.out.println("Logged in User is : " +loggedInUser);
		//9. Click 'Logout' button
		driver.findElement(By.xpath("//a[text()=' Logout']")).click();
		//10. Verify that user is navigated to login page
		
		
		

	}

}
