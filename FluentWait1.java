import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class FluentWait1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sid\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2));
		WebElement text= wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()) {return driver.findElement(By.cssSelector("[id='finish'] h4"));}
				else return null;
			}
					});
		
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
		
		
		
	}

}
