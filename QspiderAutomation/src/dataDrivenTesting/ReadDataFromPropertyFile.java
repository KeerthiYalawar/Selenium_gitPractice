package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//Create Object for FileInputScteam
		FileInputStream fis = new FileInputStream("./testdata/democommondata.properties");
		//Create respective file type object
		Properties prop= new Properties();
		//call read methods
		prop.load(fis);
		String url = prop.getProperty("url");
		 String username = prop.getProperty("username");
		 String password = prop.getProperty("password");
		 
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
		
		
	}

}
