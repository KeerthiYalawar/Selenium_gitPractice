package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoWebShop {

	public static void main(String[] args) throws IOException {
		//Create Object for FileInputScteam
				FileInputStream fis = new FileInputStream("./testdata/democommondata.properties");
				//Create respective file type object
				Properties prop= new Properties();
				//call read methods
				prop.load(fis);
				String url1 = prop.getProperty("url1");
				 String email = prop.getProperty("email");
				 String pwd = prop.getProperty("pwd");
				 
				 WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					driver.get(url1);
					driver.findElement(By.id("Email")).sendKeys(email);
					driver.findElement(By.id("Password")).sendKeys(pwd);
					driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
