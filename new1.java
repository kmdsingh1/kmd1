import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class new1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sid\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("kmdsingh1@gmail.com");
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		driver.navigate().back();
		driver.findElement(By.name("pass")).sendKeys("xxxxx");
		driver.findElement(By.cssSelector("input[value=\"Log In\"]")).click();
		//driver.findElement(By.linkText("Forgot account?")).click();
		int a=5;
		getNumber(driver);
	}
public static void getNumber(WebDriver driver)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sid\\Downloads\\chromedriver\\chromedriver.exe");
	WebDriver driver1 = new ChromeDriver();
	driver1.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.getTitle();	

}
}
