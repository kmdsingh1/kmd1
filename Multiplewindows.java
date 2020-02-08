import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sid\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//span[@id='fsr']/a[1]")).click();
		System.out.println(driver.getTitle());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html[1]/body[1]/c-wiz[1]/div[1]/div[1]/c-wiz[1]/div[1]/ul[1]/li[6]/a[1]")).click();
		System.out.println(driver.getTitle());
		Set<String> windowID=driver.getWindowHandles();
				java.util.Iterator<String> it=windowID.iterator();
				String googleMain=it.next();
		String privacy=it.next();
		driver.switchTo().window(privacy);
		System.out.println(driver.getTitle());
		driver.switchTo().window(googleMain);
		
		System.out.println(driver.getTitle());
	}

}
