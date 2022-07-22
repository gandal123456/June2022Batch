package trial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt
{

	public static void main(String[] args) throws InterruptedException 
	{     
	  System.setProperty("webdriver.chrome.driver","G:\\Automation Support\\chromedriver.exe");                     //browserLaunch
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	      
	  driver.get("https://www.flipkart.com/");                                                                        //openApplication
	      
	  driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();                        //locator               //click()                       6 times 
	  
	  Actions act=new Actions(driver);
	  
      WebElement a=driver.findElementByXPath("//*[text()='Login']");                                                       //moveToElement()
      act.moveToElement(a).build().perform();
	  
	  driver.findElementByXPath("//*[text()='My Profile']").click();                                                            //click()
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("9168313434");                                         //sendKeys()                   7 times 
	  driver.findElementByXPath("//*[@class='_2IX_2- _3mctLh VJZDxU']").sendKeys("abcd@321");                                   //sendKeys()
	  driver.findElementByXPath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']").click();                                               //click()
/*	  
	  Thread.sleep(5000);
	  driver.findElementByXPath("//*[text()='Manage Addresses']").click();                                                          //click()
	  driver.findElementByXPath("//*[@class='_1QhEVk']").click();                                                                    //click()
	  driver.findElementByXPath("//*[@name='name']").sendKeys("Rahul Kharade");                     //locator and text                                    //sendKeys()
	  driver.findElementByXPath("//*[@name='phone']").sendKeys("8668365485");                                                          //sendKeys()
	  driver.findElementByXPath("//*[@name='pincode']").sendKeys("413739");                                                            //sendKeys()
	  driver.findElementByXPath("//*[@name='addressLine2']").sendKeys("Shrirampur");                                                  //sendKeys()
	  driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("Bhokar");                                                          //sendKeys()
	  driver.findElementByXPath("//*[@type='button'][2]").click();                                                                       //click()
	*/ 
	}

}