import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestClass 
{
	public WebDriver driver;
	
	@Test
	public void launchBrowser()
	{
		driver.get("https://www.facebook.com");
	}
	
	@BeforeTest
	public void installDriver()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLatest\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void quiteDriver()
	{
		driver.quit();
	}
}
