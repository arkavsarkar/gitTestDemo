import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	@Test
	public void HomepageCheck() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		// caps.setPlatform(platform.);
		// caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.6:4444"), caps);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("arkav Sarkar");
		System.out.println(driver.getTitle());
		
		driver.close();
	}
	@Test
	public void HomepageCheck2() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		// caps.setPlatform(platform.);
		// caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.6:4444"), caps);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("arkav Sarkar");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
