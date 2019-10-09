package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class HomePage {
	@FindBy(xpath="//*[@id=\"TasklinkList\"]/li ") List<WebElement> multipleLinks;
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnAllHeaderLinks() {
		Shared.clickOnMultipleLinks(driver, multipleLinks);
	}

}
