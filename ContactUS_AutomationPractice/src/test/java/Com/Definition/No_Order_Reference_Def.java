package Com.Definition;

import org.openqa.selenium.WebDriver;

import Com.Pages.No_Order_Reference;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class No_Order_Reference_Def {
	WebDriver driver;
	No_Order_Reference order = new No_Order_Reference(driver);
	@Given("Open the Url")
	public void open_the_Url() {
	    // Write code here that turns the phrase above into concrete actions
	    
		order.Launch("http://automationpractice.com/index.php");               //Calling the Launch method from No_Order_Reference class
		
	}

	@When("Click on Contact Us option")
	public void click_on_Contact_Us_option() {
	    // Write code here that turns the phrase above into concrete actions
	    
		order.Click_ContactUs();                                              //Calling the Click_ContactUs method from No_Order_Reference class
	}

	@Then("Enter all the details except order reference")
	public void enter_all_the_details_except_order_reference() {
	    // Write code here that turns the phrase above into concrete actions
	    
		order.Subject_Heading();                                             //Calling the Subject_Heading method from No_Order_Reference class
		order.Entering_Email();                                              //Calling the Entering_Email method from No_Order_Reference class
		order.Message();                                                     //Calling the Message method from No_Order_Reference class
	}

	@Then("Click Send button")
	public void click_Send_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
		order.Click_SendButton();                                           //Calling the Click_SendButton method from No_Order_Reference class
	}
}
