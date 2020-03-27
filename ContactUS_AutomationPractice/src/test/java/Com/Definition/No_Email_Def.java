package Com.Definition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Com.Pages.No_Email;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class No_Email_Def {
	
	WebDriver driver;
	No_Email email = new No_Email(driver);  
	@Given("Open URL in the browser")
	public void open_URL_in_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    email.Launch("http://automationpractice.com/index.php");                             //Calling the Launch method from No_Email class
	}

	@When("Click the Contact Us Option")
	public void click_the_Contact_Us_Option() {
	    // Write code here that turns the phrase above into concrete actions
	   email.Click_ContactUs();                                                             //Calling the Click_ContactUs method from No_Email class
	}

	@Then("Enter all the details except e-mail")
	public void enter_all_the_details_except_e_mail() {
	    // Write code here that turns the phrase above into concrete actions
		email.Subject_Heading();                                                           //Calling the Subject_Heading method from No_Email class
		email.Order_Refrence();                                                            //Calling the Order_Refrence method from No_Email class
	    email.Message();                                                                   //Calling the Message method from No_Email class
	    
	}

	@Then("Click the Send button")
	public void click_the_Send_button() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    email.Click_SendButton();                                                         //Calling the Click_SendButton method from No_Email class
	    email.Screenshot();                                                               //Calling the Screenshot method from No_Email class
	}

}
