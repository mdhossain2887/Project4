import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class BaseTest {
	WebDriver driver;

	
	public   void open() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public  HomePage goToUrl() {
		driver.get("https://www.homedepot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return new HomePage(driver);
	}
}
