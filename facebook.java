import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sid\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("kmdsingh1@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("xxxxx");
		driver.findElement(By.cssSelector("input[value=\"Log In\"]")).click();
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.quit();
	}

	
}
