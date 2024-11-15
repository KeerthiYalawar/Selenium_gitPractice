package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTestScript {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream fis = new FileInputStream("./testdata/RegisterCommonData.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		
		FileInputStream fis1 = new FileInputStream("./testdata/RegisterPageData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis1);
		Sheet sheet = workbook.getSheet("Sheet1");
		 String firstName = sheet.getRow(1).getCell(0).getStringCellValue();
		 String lastName = sheet.getRow(1).getCell(1).getStringCellValue();
		String email = sheet.getRow(1).getCell(2).getStringCellValue();
		String password = sheet.getRow(1).getCell(3).getStringCellValue();
		String confirmPassword = sheet.getRow(1).getCell(4).getStringCellValue();
		
		driver.get(url);
		LoginPage lp = new LoginPage(driver);
		lp.getRegisterLink().click();
		
		RegisterPage rp=new RegisterPage(driver);
		rp.getFemaleRadioButton().click();
		rp.getFirstNameTextField().sendKeys(firstName);
		rp.getLastNameTextField().sendKeys(lastName);
		rp.getEmailTextField().sendKeys(email);
		rp.getPasswordTextField().sendKeys(password);
		rp.getConfirmPasswordTextField().sendKeys(confirmPassword);
		rp.getRegisterButton().click();
		
		
		
		
	}

}
