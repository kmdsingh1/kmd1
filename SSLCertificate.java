import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// TODO Auto-generated method stub
			DesiredCapabilities ch=DesiredCapabilities.chrome();
			ch.acceptInsecureCerts();
			ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			ChromeOptions cromebrowswer=new ChromeOptions();
			cromebrowswer.merge(ch);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sid\\Downloads\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(cromebrowswer);
	}

}
