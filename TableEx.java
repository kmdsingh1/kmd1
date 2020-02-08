import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sid\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		List<WebElement> table = driver
				.findElements(By.cssSelector("div[id='innings_1'] div.cb-col.cb-col-100.cb-ltst-wgt-hdr:nth-child(1) div.cb-col.cb-col-100.cb-scrd-itms"));
		
	
		int score=0;
		int rowcount = table.size();
		System.out.println(rowcount);
		for (int i = 0; i < rowcount-2; i++) {
			String IndividualScore = table.get(i).findElement(By.cssSelector("div.cb-col.cb-col-8.text-right.text-bold:nth-child(3)")).getText();
			System.out.println(IndividualScore);
			int playerScore=Integer.parseInt(IndividualScore);
			score=score+playerScore;
		}
		System.out.println(score);
		String Extras=driver.findElement(By.xpath("//div[@id='innings_1']//div[text()='Extras']/following-sibling::div[1]")).getText();
		int intExtras=Integer.parseInt(Extras);
		
		score=score+intExtras;
		System.out.println(intExtras);
		
		String Total=driver.findElement(By.xpath("//div[@id='innings_1']//div[text()='Total']/following-sibling::div[1]")).getText();
		int intTotal=Integer.parseInt(Total);
		System.out.println(Total);
		
		System.out.println(score);
		
		
	}

}

	