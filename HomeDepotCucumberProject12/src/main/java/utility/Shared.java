package utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shared {
	
	public static void clickOnMultipleLinks(WebDriver driver,List<WebElement> eles) {
		int size=eles.size();
		for(int x=0; x<size; x++) {
			eles.get(x).click();
			driver.navigate().to("https://www.homedepot.com");
		}
	}

}
