import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeRahulAcademyLimitingWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sid\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement footerColoumn=footerdriver.findElement(By.xpath("//div[@id='gf-BIG']//td[1]"));
		System.out.println(footerColoumn.findElements( By.tagName("a")).size());
		for(int i=0;i<footerColoumn.findElements( By.tagName("a")).size();i++)
		{
			String clickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerColoumn.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			Thread.sleep(2000);
		}
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	
	
	}

}
