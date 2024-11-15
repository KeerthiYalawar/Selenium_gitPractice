package listners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplimentation extends BaseClass implements ITestListener 
//Base class is extended just to get the driver ref to take screen shot which is taken from Base class
{


	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Script is Fail",true);
		
		String methodName=result.getName();
		ITestNGMethod name=result.getMethod();
		System.out.println("method Name"+methodName);
		System.out.println(name);
	
	
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+methodName+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	

	
}
