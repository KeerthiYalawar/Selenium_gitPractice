package testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	public Workbook workbook;
	@BeforeTest
	public void fetchData() throws IOException
	{	//Properties file
		FileInputStream fis = new FileInputStream("./testdata/commondata.properties");
		 prop = new Properties();
		prop.load(fis);
		//ExcelFile
		FileInputStream eFis=new FileInputStream("./testdata/testScript1.xlsx");
		workbook=WorkbookFactory.create(eFis);
	
	}
@AfterTest
public void closeObject() throws IOException
{
	workbook.close();
}
	
	@BeforeClass
	public void launchBrowser()
	{
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("url"));
	}
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("Password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@AfterMethod
	public void logOut()
	{
		driver.findElement(By.linkText("Log out")).click();
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
