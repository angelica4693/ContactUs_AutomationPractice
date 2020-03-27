package Com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class No_Message {
	WebDriver driver;
	String browser;
	
	public No_Message(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Launch(String URL)                             //For Launching the URL in the particular browser
	{
		
			 try {
				 if(browser.equalsIgnoreCase("chrome"))        //For Launching the Chrome browser
				 {
				 System.setProperty("webdriver.chrome.driver", "D:\\LOGA\\ContactUS_AutomationPractice\\Drivers\\chromedriver.exe");
				 driver=new ChromeDriver();
				 
				 }
				 else if(browser.equalsIgnoreCase("Firefox"))   //For Launching the firefox browser
				 {
					 System.setProperty("webdriver.gecko.driver", "D:\\Selenium Jars\\Firefox driver\\geckodriver.exe");
					 driver=new FirefoxDriver();
				 }
			     }
				 catch (WebDriverException e) 
			    {
					System.out.println("browser Not found");
				}
			 driver.manage().window().maximize();              //Maximizing the window
			 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			 driver.get(URL);                                  //Launching the URL
		 
	}
	
	public void Click_ContactUs()                               //Clicking the ContactUs Option
	{
		driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
	}
	
	public void Subject_Heading()                               //Entering the value in Subject heading box
	{
		driver.findElement(By.xpath("//*[@id=\"id_contact\"]")).sendKeys("Customer service");
	}
	
	public void Entering_Email()                               //Entering the E_Mail
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("simoma@gmail.com");
	}
	
	public void Order_Refrence()                              //Entering the Order reference value
	{
		driver.findElement(By.xpath("//*[@id=\"id_order\"]")).sendKeys("1324D");
	}
	
	public void Click_SendButton()                           //Clicking the Send Button
	{
		driver.findElement(By.xpath("//*[@id=\"submitMessage\"]/span")).click();
	}
	
	public void Screenshot() throws IOException             //Taking the Screenshot
	{
		TakesScreenshot t = (TakesScreenshot)driver;
		File f = t.getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("D:\\LOGA\\ContactUS_AutomationPractice\\Screenshots\\No_Message.PNG"));
	}

}
