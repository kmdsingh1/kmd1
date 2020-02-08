import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sid\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		org.testng.Assert.assertFalse(
				driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());

		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
		System.out.println(
				driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		Assert.assertTrue(
				driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath(
				"//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[contains(text(),'Chennai (MAA)')]"))
				.click();
		Thread.sleep(2000L);
		// driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();

		driver.findElement(By.cssSelector(
				"div.ui-datepicker.ui-widget.ui-widget-content.ui-helper-clearfix.ui-corner-all.ui-datepicker-multi.ui-datepicker-multi-2:nth-child(9) div.ui-datepicker-group.ui-datepicker-group-first:nth-child(1) table.ui-datepicker-calendar tbody:nth-child(2) tr:nth-child(2) td.ui-datepicker-week-end.ui-datepicker-days-cell-over.ui-datepicker-current-day.ui-datepicker-today:nth-child(7) > a.ui-state-default.ui-state-highlight.ui-state-active"))
				.click();
		System.out.println(driver.findElement(By.id("Div1")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
		}
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		driver.findElement(By.xpath("//div[@class='row1 adult-infant-child']//div[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//p[@id='adultDropdown']")).click();
		;

		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']//option[contains(text(),'5')]"))
				.click();
		;

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
