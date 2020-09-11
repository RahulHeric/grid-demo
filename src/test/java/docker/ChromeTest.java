package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	@Test
	public static void grid1() throws MalformedURLException, InterruptedException{
DesiredCapabilities dc=DesiredCapabilities.chrome();
		
		
		URL url=new URL("http://localhost:4545/wd/hub");
		
		RemoteWebDriver driver=new RemoteWebDriver(url,dc);
		String drive = driver.toString();
		System.out.println(drive);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		String text = driver.findElement(By.id("logInPanelHeading")).getText();
		System.out.println(text);
		System.out.println("title of page : "+driver.getTitle());
		driver.quit();
		
	}
}
