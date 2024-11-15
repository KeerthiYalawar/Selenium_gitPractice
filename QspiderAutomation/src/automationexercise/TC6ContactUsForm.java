package automationexercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import popups.AlertPopup;
import webElement.SendKey;

public class TC6ContactUsForm {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testdata/automationexerciseData.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String name = prop.getProperty("name");
		String email = prop.getProperty("email");
		//1. Launch browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//2. Navigate to url 'http://automationexercise.com'
		driver.get(url);
		//3. Verify that home page is visible successfully
		System.out.println("The home Page title is: " +driver.getTitle());
		//4. Click on 'Contact Us' button
		driver.findElement(By.xpath("//a[contains(text(),'Contact us')]")).click();
		//5. Verify 'GET IN TOUCH' is visible
		String msg = driver.findElement(By.xpath("//h2[text()='Get In Touch']")).getText();
		System.out.println("Message displayed is : " +msg);
		//6. Enter name, email, subject and message
		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("subject")).sendKeys("TestSubject");
		//7. Upload file
		driver.findElement(By.name("upload_file")).sendKeys("C:\\Users\\yalaw\\OneDrive\\Desktop\\MyFiles\\LoginPage.txt");
		//8. Click 'Submit' button
		driver.findElement(By.name("submit")).submit();
		//. Click OK button
		Alert popup = driver.switchTo().alert();
		popup.accept();
		//10. Verify success message 'Success! Your details have been submitted successfully.' is visible
		String message = driver.findElement(By.xpath("//h2[text()='Get In Touch']//following-sibling::div[contains(text(),'submitted successfully')]")).getText();
		System.out.println("Message displaed is : "+message);
		//11. Click 'Home' button and verify that landed to home page successfully
		driver.findElement(By.xpath("//span[text()=' Home']")).click();
		//Click 'Home' button and verify that landed to home page successfully
		String title = driver.getTitle();
		System.out.println("The title of the page is: "+title);
	}

}
