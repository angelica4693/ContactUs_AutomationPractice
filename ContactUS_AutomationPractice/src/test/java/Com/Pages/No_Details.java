package Com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import ExcelUtility.Excel;

public class No_Details {
	WebDriver driver;
	String browser;
    public No_Details(WebDriver driver)       
	 { 
		 this.driver = driver; 
	 }
	 
	public void Launch(String URL)                             //For Launching the URL in the particular browser
	{
		
			 try {
				 if(browser.equalsIgnoreCase("chrome"))       //For Launching the Chrome browser
				 {
				 System.setProperty("webdriver.chrome.driver", "D:\\LOGA\\ContactUS_AutomationPractice\\Drivers\\chromedriver.exe");
				 driver=new ChromeDriver();
				 
				 }
				 else if(browser.contains("Firefox"))        //For Launching the firefox browser
				 {
					 System.setProperty("webdriver.gecko.driver", "D:\\Selenium Jars\\Firefox driver\\geckodriver.exe");
					 driver=new FirefoxDriver();
				 }
			 }
				 catch (WebDriverException e) {
					System.out.println("Not found");
				}
			 driver.manage().window().maximize();               //Maximizing the window
			 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			 driver.get(URL);                                   //Launching the URL
		}
	
	public void Signin(String xpath)                           //Clicking the SignIn Option
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void usernameandpassword(int i) throws IOException           //Reading the User name and Password from ExcelSheet
	{
		Excel e=new Excel();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(e.excel_username(i));
		WebElement d = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		d.click();
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(e.excel_password(i));
		WebElement f = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		f.click();
	}
	
	public void Click_Signin(String xpath)                                   
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void Click_Contactus(String xpath)                    //Clicking the ContactUs Option
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void Click_Sendbutton(String send)                   //Clicking the Send Button Option
	{
		driver.findElement(By.xpath(send)).click();
	}
	
	public void Screenshot() throws IOException                //Taking the Screenshot
	{
		TakesScreenshot t = (TakesScreenshot)driver;
		File f = t.getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File("D:\\LOGA\\ContactUS_AutomationPractice\\Screenshots\\No_Details.PNG"));
	}
}
