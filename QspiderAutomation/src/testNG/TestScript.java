package testNG;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass{
	@Test
	public void clickOnBooks()
	{
		driver.findElement(By.partialLinkText("BOOKS")).click();
		String actualTitle = driver.getTitle();
		 String expectedTitle = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		 
		if(actualTitle.equals(expectedTitle))
		{
			Reporter.log("Books Page is displayed",true);
		}else {
			Reporter.log("Books Page is not displayed",true);
		}
	}
}
