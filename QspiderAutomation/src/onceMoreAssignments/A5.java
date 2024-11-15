package onceMoreAssignments;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement drop = driver.findElement(By.xpath("//div[@class='information closable']/following::p/select"));
		Select country = new Select(drop);
		List<WebElement> allOptions = country.getOptions();
		System.out.println(allOptions.size());
		TreeSet<String> tree=new TreeSet<String>();
		for(WebElement e:allOptions)
		{
			tree.add(e.getText());
			if(e.getText().equals(e))
			{
				
			}
			
		}
		
		System.out.println(tree.first().toString());
	}

}
