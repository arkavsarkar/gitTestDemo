

	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.remote.CapabilityType;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.testng.annotations.Test;

	public class ASTest {
		@Test
		public void HomepageCheck() throws MalformedURLException {
			DesiredCapabilities caps = new DesiredCapabilities();
			// caps.setBrowserName("chrome");
			// caps.setPlatform(platform.);
			// caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
			caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
			WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.6:4444"), caps);
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			System.out.println(driver.getTitle());
			System.out.println("we are checking grid & git ");
			driver.close();
		}
		@Test
		public void HomepageCheck2() throws MalformedURLException {
			DesiredCapabilities caps = new DesiredCapabilities();
			// caps.setBrowserName("chrome");
			// caps.setPlatform(platform.);
			// caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
			caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
			WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.6:4444"), caps);
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			System.out.println(driver.getTitle());
			System.out.println("we are checking grid & git ");
			driver.close();
		}
	}


