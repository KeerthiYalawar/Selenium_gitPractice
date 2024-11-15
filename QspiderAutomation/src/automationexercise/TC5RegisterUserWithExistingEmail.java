package automationexercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5RegisterUserWithExistingEmail {

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
		//2. Navigate to url 'http://automationexercise.com'
		driver.get(url);
		//3. Verify that home page is visible successfully
		System.out.println("The home Page displayed is: " +driver.getTitle());
		//4. Click on 'Signup / Login' button
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		//5. Verify 'New User Signup!' is visible
		String text = driver.findElement(By.xpath("//h2[text()='New User Signup!']")).getText();
		//6. Enter name and already registered email address
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Keerti");
		driver.findElement(By.xpath("//input[@placeholder='Name']/following-sibling::input[@placeholder='Email Address']")).sendKeys(email);
		//7. Click 'Signup' button
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		//8. Verify error 'Email Address already exist!' is visible
		String errMsg = driver.findElement(By.xpath("//p[contains(text(),'already exist!')]")).getText();
		System.out.println("Error Message displayed is : "+errMsg);
		
		

	}

}
