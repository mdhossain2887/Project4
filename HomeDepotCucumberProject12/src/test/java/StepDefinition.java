import org.junit.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.HomePage;

public class StepDefinition {


	
	BaseTest bt;
	HomePage hp;
	
	@Before
	@Given("^open browser(\\d+)$")
	public void open_browser(int arg1) throws Throwable {
		
	   bt=new BaseTest();
	   bt.open();
	}
	@Before
	@Given("^navigate to url(\\d+)$")
	public void navigate_to_url(int arg1) throws Throwable {
	   hp=bt.goToUrl();
	
	}

	@When("^user clik on header link$")
	public void user_clik_on_header_link() throws Throwable {
	    hp.clickOnAllHeaderLinks();
	}
}
