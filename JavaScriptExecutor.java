import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sid\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("Beng");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String script= "return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
	
		 int i=0;
		while(i<10) {
			if(text.equalsIgnoreCase("BENGALURU AIPORT"))
			{System.out.println("text found");
				System.out.println(text);
			break;}
			
			else
			{ System.out.println("Text not found");
				System.out.println(text);
				driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
				script= "return document.getElementById(\"fromPlaceName\").value;";
				text=(String) js.executeScript(script);
							
			}	
		
			i++;	
		}
		
	}
	}

