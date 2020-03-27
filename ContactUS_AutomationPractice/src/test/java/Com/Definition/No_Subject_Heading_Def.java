package Com.Definition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Com.Pages.No_Subject_Heading;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class No_Subject_Heading_Def 
{
	WebDriver driver;
	No_Subject_Heading subject = new No_Subject_Heading(driver);
	@Given("Open the URL in the browser")
	public void open_the_URL_in_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		
		subject.Launch("http://automationpractice.com/index.php");                   //Calling the Launch method from No_Subject_Heading class
	}

	@When("Click on the Contact Us option")
	public void click_on_the_Contact_Us_option() {
	    // Write code here that turns the phrase above into concrete actions
		
		subject.Click_ContactUs();                                                 //Calling the Click_ContactUs method from No_Subject_Heading class
	}

	@Then("Enter all the details except subject heading")
	public void enter_all_the_details_except_subject_heading() {
	    // Write code here that turns the phrase above into concrete actions
		
		subject.Entering_Email();                                                  //Calling the Entering_Email method from No_Subject_Heading class
		subject.Order_Refrence();                                                  //Calling the Order_Refrence method from No_Subject_Heading class
		subject.Message();                                                         //Calling the Message method from No_Subject_Heading class
		
	}

	@Then("Click on the Send button")
	public void click_on_the_Send_button() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		subject.Click_SendButton();                                                //Calling the Click_SendButton method from No_Subject_Heading class
		subject.Screenshot();                                                      //Calling the Screenshot method from No_Subject_Heading class
	}

}
