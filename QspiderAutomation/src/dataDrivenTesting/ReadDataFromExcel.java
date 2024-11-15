package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//1. Create FIS object
			
		FileInputStream fis = new FileInputStream("C:/Users/yalaw/OneDrive/Desktop/TestScriptData.xlsx");
		
		//2. Create respective file type object
		
	Workbook workbook = WorkbookFactory.create(fis);

	
	//3 call read methods
	
	String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	String username = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	String password = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	double price = workbook.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
	boolean status = workbook.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();
	LocalDateTime date = workbook.getSheet("Sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(url);
	driver.findElement(By.linkText("LOGIN")).click();
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	System.out.println(date);
	System.out.println(status);
	System.out.println(price);

	
	}

}
