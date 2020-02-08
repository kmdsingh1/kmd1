import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sid\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.cssSelector("#travel_date")).click();
		
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']//thead//tr[1]//th[2]")).getText().contains("April")) {
			driver.findElement(By.xpath("//div[@class='datepicker-days']//thead//tr[1]//th[3]")).click();
			
		}
		
		List<WebElement> date=driver.findElements(By.xpath("//td[contains(@class,'day')]"));
		
		int i=driver.findElements(By.xpath("//td[contains(@class,'day')]")).size();
		for(int c=1;c<=i;c++)
		{
			String dateSelect=driver.findElements(By.xpath("//td[contains(@class,'day')]")).get(c).getText();
			if(dateSelect.equalsIgnoreCase("27")) {
				driver.findElements(By.xpath("//td[contains(@class,'day')]")).get(c).click();
				break;
			}
		}
	
}
}