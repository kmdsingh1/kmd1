import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColoumnSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sid\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		
		java.util.List<WebElement> coloum=driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		ArrayList<String> coloumValues=new ArrayList<String>();
		
		System.out.println("************OriginalList*****************");
		for(int i=0;i<coloum.size();i++)
		{
			
			coloumValues.add(coloum.get(i).getText());
			System.out.println(coloumValues.get(i));
			
		}
		
	
		ArrayList<String> CopiedColoum=new ArrayList<String>();
		
		for(int i=0;i<coloum.size();i++)
		{
			
			CopiedColoum.add(coloumValues.get(i));
			System.out.println(CopiedColoum.get(i));
			
		}
	
		Collections.sort(CopiedColoum);
		Collections.reverse(CopiedColoum);
		System.out.println("************SortedList*****************");
		for(String s:CopiedColoum) {
			System.out.println(s);
		}
		assertTrue(coloumValues.equals(CopiedColoum)); 
		
	}

}
