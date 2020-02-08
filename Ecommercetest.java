import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommercetest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sid\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w= new WebDriverWait(driver, 5);
		driver.get(" https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		String[] orderItemNames = { "Cucumber", "Brinjal" };	
		//Ecommercetest obj1=new Ecommercetest();
		addItemToCart(driver, orderItemNames);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}
public static void addItemToCart(WebDriver driver,String[] orderItemNames )
{
	
	List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
	int q = 0;

	for (int a = 0; a < items.size(); a++) {

		String[] itemName = items.get(a).getText().split("-");
		String fromattedItemName = itemName[0].trim();
		List<String> al = Arrays.asList(orderItemNames);

		if (al.contains(fromattedItemName)) {
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(a).click();
			q++;
			if (q > orderItemNames.length) {
				break;
			}
			System.out.println("this is" + q + "item");
		}

		System.out.println("this is loop number" + a);
	}	
}
}
