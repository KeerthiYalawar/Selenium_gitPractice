package ClassAssignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.org.antlr.v4.runtime.tree.Tree;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.abhibus.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()='Hyderabad to Bangalore Bus'])[2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text()='Bus Partner']")).click();
		driver.findElement(By.xpath("//label[text()='BSR TOURS & TRAVELS']/../input")).click();
		List<WebElement> totalbuses = driver.findElements(By.xpath("//h5[text()='BSR TOURS & TRAVELS']"));
		System.out.println("Total available buses for the selected Operator: " +totalbuses.size());
		List<WebElement> busFare = driver.findElements(By.xpath("//strong[@class='h5 fare']"));
			//Listing all the prices
		System.out.println("Various bus Prices are as below : " );
		System.out.println("-------------------");
		TreeSet<String> tree=new TreeSet<String>();
		
		for(WebElement ele:busFare)
		{
			tree.add(ele.getText().replace(",", ""));
		}
		System.out.println(tree.first());
		
//		System.out.println();
//	
//		TreeSet<WebElement> minBusFare = new TreeSet<WebElement>(busFare);
//		System.out.println(minBusFare.first()); //Tree values by default in Ascending order
//		
//		ArrayList<WebElement> busFare1 = new ArrayList<WebElement>(busFare);
//		
	//Collections.min(busFar);
//		
//		  WebElement min =busFare.get(0);
//		  
//		for(int i=0;i<=busFare.size();i++)
//		{
		//if(busFare.get(i) < min)
//			
//				min=busFare1.get(i);
//			
//		}
//		System.out.println("Lowest bus price is: " +min); 



	}

}
