package Com.Definition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Com.Pages.No_Details;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class No_Details_Def {
	WebDriver driver;
	No_Details details = new No_Details(driver); 
	@Given("Open Url in the browser and Login in to the application")
	public void open_Url_in_the_browser_and_Login_in_to_the_application() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		
		details.Launch("http://automationpractice.com/index.php");                  //Calling the Launch method from No_Details class
		details.Signin("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");          //Calling the Sign_in method from No_Details class
		details.usernameandpassword(2);                                             //Calling the username_and_password method from No_Details class
		details.Click_Signin("//*[@id=\"SubmitLogin\"]/span");                      //Calling the Click_Signin method from No_Details class
	}

	@When("Click on contact us option")
	public void click_on_contact_us_option() {
	    // Write code here that turns the phrase above into concrete actions
	    
		details.Click_Contactus("//*[@id=\"contact-link\"]/a");                    //Calling the Click_Contactus method from No_Details class
		
	   }

	@Then("Click on send button")
	public void click_on_send_button() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		
		details.Click_Sendbutton("//*[@id=\"submitMessage\"]/span");               //Calling the Click_Sendbutton method from No_Details class
		details.Screenshot();                                                       //Calling the Screenshot method from No_Details class
	}
}
