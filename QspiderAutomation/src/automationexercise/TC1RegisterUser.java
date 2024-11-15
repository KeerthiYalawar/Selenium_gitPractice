package automationexercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC1RegisterUser {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testdata/automationexerciseData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String password = prop.getProperty("password");
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
		//2. Navigate to url 'http://automationexercise.com'
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//3.Verify that home page is visible successfully
		System.out.println("The home Page displayed is: " +driver.getTitle());
		//4.Click on 'Signup / Login' button
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		//5.Verify 'New User Signup!' is visible
		String text = driver.findElement(By.xpath("//h2[text()='New User Signup!']")).getText();
		System.out.println("The visible text is: " +text);
		//6. Enter name and email address
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Keerti");
		driver.findElement(By.xpath("//input[@placeholder='Name']/following-sibling::input[@placeholder='Email Address']")).sendKeys("TestEmail@mail.com");
		//7. Click 'Signup' button
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
		String Text1 = driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
		System.out.println("The Visible Text is : " +Text1);
		//9.Fill details: Title, Name, Email, Password, Date of birth
		driver.findElement(By.xpath("//input[@name='title' and @value='Mrs']")).click();
		WebElement name = driver.findElement(By.id("name"));
		name.clear();
		name.sendKeys("KeertiYalawar");
		driver.findElement(By.id("password")).sendKeys(password);
		WebElement dayDropdown = driver.findElement(By.id("days"));
		Select selectDay = new Select(dayDropdown);
		selectDay.selectByVisibleText("27");
		WebElement monthDropdown = driver.findElement(By.id("months"));
		Select selectmonth =new Select(monthDropdown);
		selectmonth.selectByVisibleText("July");
		WebElement yearDropdown = driver.findElement(By.id("years"));
		Select selectyear= new Select(yearDropdown);
		selectyear.selectByVisibleText("1990");
		// 10.Select checkbox 'Sign up for our newsletter!'
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement sighUpCheckBox =driver.findElement(By.xpath("//label[text()='Sign up for our newsletter!']/..//input"));
	    js.executeScript("arguments[0].click()",sighUpCheckBox);
		//11.Select checkbox 'Receive special offers from our partners!'
	    WebElement specialOfferCheckbox = driver.findElement(By.id("optin"));
	    js.executeScript("arguments[0].click()",specialOfferCheckbox);
		//12.Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
		driver.findElement(By.id("first_name")).sendKeys("Keerti");
		driver.findElement(By.id("last_name")).sendKeys("Yalawar");
		driver.findElement(By.id("company")).sendKeys("TestCompany");
		driver.findElement(By.id("address1")).sendKeys("TestAddress");
		WebElement countrydropdown = driver.findElement(By.id("country"));
		Select selectCountry= new Select(countrydropdown);
		selectCountry.selectByVisibleText("India");
		driver.findElement(By.id("state")).sendKeys("Karnataka");
		driver.findElement(By.id("city")).sendKeys("Bengaluru");
		driver.findElement(By.id("zipcode")).sendKeys("560076");
		driver.findElement(By.id("mobile_number")).sendKeys("9005006001");
		//13. Click 'Create Account button'
		WebElement createButton = driver.findElement(By.xpath("//button[text()='Create Account']"));
		wait.until(ExpectedConditions.elementToBeClickable(createButton));
		createButton.submit();
		//14. Verify that 'ACCOUNT CREATED!' is visible
		String createdText = driver.findElement(By.xpath("//h2[@class='title text-center']")).getText();
		System.out.println("Account created message: " +createdText);
		//15. Click 'Continue' button
		driver.findElement(By.linkText("Continue")).click();
		//16. Verify that 'Logged in as username' is visible
		String loggedInUser = driver.findElement(By.xpath("//a[contains(text(),'Logged in as')]/b")).getText();
		System.out.println("Logged in User is : " +loggedInUser);
		//17. Click 'Delete Account' button
		driver.findElement(By.xpath("//a[text()=' Delete Account']")).click();
		//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
		String deleteMsg = driver.findElement(By.xpath("//h2[@class='title text-center']/b")).getText();
		System.out.println("Account Deleted Message : "+deleteMsg);
		driver.findElement(By.linkText("Continue")).click();

	}

}



