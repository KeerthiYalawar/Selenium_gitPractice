package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void sample()
	{
		Reporter.log("sample Test Case Executed", true);
	}
	@Test
	public void demo()
	{
		Reporter.log("demo Test Case Executed", true);
	}
	@Test
	public void add()
	{
		Reporter.log("add Test Case Executed", true);
	}
}
