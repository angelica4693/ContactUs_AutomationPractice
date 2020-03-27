package Com.Definition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Com.Pages.No_Message;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class No_Message_Def 
{
	WebDriver driver;
	No_Message msg = new No_Message(driver);
	@Given("Open the Url in the browser")
	public void open_the_Url_in_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
        msg.Launch("http://automationpractice.com/index.php");                 //Calling the Launch method from No_Message class
	}

	@When("Click on the Contact us option")
	public void click_on_the_Contact_us_option() {
	    // Write code here that turns the phrase above into concrete actions
	    msg.Click_ContactUs();                                                //Calling the Click_ContactUs method from No_Message class
	}

	@Then("Enter all the details except message details")
	public void enter_all_the_details_except_message_details() {
	    // Write code here that turns the phrase above into concrete actions
	    msg.Subject_Heading();                                               //Calling the Subject_Heading method from No_Message class
	    msg.Entering_Email();                                                //Calling the Entering_Email from No_Message class
	    msg.Order_Refrence();                                                //Calling the Order_Refrence method from No_Message class
	}

	@Then("Click send button")
	public void click_send_button() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	   msg.Click_SendButton();                                              //Calling the Click_SendButton method from No_Message class
	   msg.Screenshot();                                                    //Calling the Screenshot method from No_Message class
	}
}
