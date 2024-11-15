package ClassAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshersworld.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		WebElement regbutton = driver.findElement(By.id("reg_new_btn"));
		System.out.println(regbutton.isDisplayed());
		regbutton.click();
		
		WebElement currentcitydropdown = driver.findElement(By.id("currentCity"));
		Select drdown = new Select(currentcitydropdown);
		drdown.selectByVisibleText("Bangalore");
		
		WebElement qualificationdrdown = driver.findElement(By.id("course"));
		Select qualification = new Select(qualificationdrdown);
		
		qualification.selectByVisibleText("BE/B.Tech");
		
	}

}
