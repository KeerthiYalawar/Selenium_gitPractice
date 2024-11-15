package automationexercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC3LoginUserWithIncorrectEmailPassword {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testdata/automationexerciseData.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
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
		//6. Enter Incorrect email address and password
		driver.findElement(By.xpath("//input[@name='password']/preceding::input[@name='email']")).sendKeys("Test@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test1234567890");
		//7. Click 'login' button
		driver.findElement(By.xpath("//button[text()='Login']")).submit();
		//8. Verify error 'Your email or password is incorrect!' is visible
		String errorMsg = driver.findElement(By.xpath("//p[contains(text(),'incorrect!')]")).getText();
		System.out.println("Error message Dispalyed is : " +errorMsg);


	}

}
