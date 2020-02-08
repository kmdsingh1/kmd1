import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ATSTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sid\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spec.atsspecsolutions.com/login?redirect=%2F");
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	//WebElement loginpan=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root-655 MuiTab-root-645 MuiTab-textColorPrimary-648 Mui-selected MuiTab-fullWidth-652']"));
	//loginpan.click();
		Thread.sleep(2000);
	WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("dovini5510@one-mail.top");
	Thread.sleep(2000);
	WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("Ats123456");
	Thread.sleep(2000);
	WebElement Login=driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
	Login.click();
	Thread.sleep(2000);
	WebElement newProect=driver.findElement(By.xpath("//span[contains(text(),'New Project')]"));
	//Thread.sleep(2000);
	newProect.click();
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Testing1");
	WebElement Country=driver.findElement(By.cssSelector("div.MuiGrid-root-1480.MuiGrid-item-1482.MuiGrid-grid-sm-4-1532:nth-child(3) div.MuiFormControl-root-1848.MuiFormControl-fullWidth-1851 div.ats-1908:nth-child(2) div.MuiInputBase-root-1884.MuiInput-root-1872.MuiInput-underline-1876.MuiInputBase-fullWidth-1893.MuiInput-fullWidth-1879.MuiInputBase-formControl-1885.MuiInput-formControl-1873"));
	Country.click();
	Country.sendKeys("CANADA");
	Thread.sleep(2000);
	Country.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	WebElement State=driver.findElement(By.xpath("//div[@class='MuiDialog-root-818']//div[4]//div[1]//div[1]//div[1]//input[1]"));
	State.click();
	State.sendKeys("ON");
	Thread.sleep(2000);
	Country.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	WebElement City=driver.findElement(By.xpath("//div[@class='MuiDialog-root-818']//div[5]//div[1]//div[1]//div[1]//input[1]"));
	City.click();
	City.sendKeys("TORO");
	Thread.sleep(2000);
	Country.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);Thread.sleep(2000);
	}

}
