package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations 
{
	public static ChromeDriver driver=null;
	
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
	
   public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)	
   {	   
	   try
	   {
	    	 String strBrowserName=(String)inputParameters[0];
	    	 String strExe=(String)inputParameters[1];	    	
	    	  System.setProperty(strBrowserName,strExe);                     
	    	   driver=new ChromeDriver();
	    	  driver.manage().window().maximize();
   
	    	  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	 
	    	  
	   }catch(Exception e)
	   {
		 System.out.println(e);
	   }
	      return outputParameters;
	   }
   
   public static Hashtable<String,Object> openApplication(Object[]inputParameters)
   {
   	 try
   	 {
   	 String path=(String)inputParameters[0];
   	
   	   driver.get(path);
   	 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
   	 
   	 }	catch(Exception e)
	   {
   		 System.out.println(e);
	   }
     return outputParameters;
   }
   
   public static Hashtable<String,Object> moveToElement(Object[]inputParameters)
   {
   	 try
   	 {
   	 String xpath=(String)inputParameters[0];
   	
   	 Actions act=new Actions(driver);
	  
     WebElement a=driver.findElementByXPath(xpath);                                                       //moveToElement()
     act.moveToElement(a).build().perform();
     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
     
     outputParameters.put("STATUS", "PASS");
	   outputParameters.put("MESSAGE", "methodUsed:moveToElement, inputGiven : " + inputParameters[0].toString());
 	 
     
     
   	 }catch(Exception e)
	   {
   		 outputParameters.put("STATUS", "FAIL");
  	   outputParameters.put("MESSAGE", "methodUsed:moveToElement, inputGiven : " + inputParameters[0].toString());
   	 
	   }
     return outputParameters;
   }
   
   public static Hashtable<String,Object> clickOnElement(Object[]inputParameters)
   {
   	 try
   	 {
   	 String path=(String)inputParameters[0];
   	
     driver.findElementByXPath(path).click();  
     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
     
     outputParameters.put("STATUS", "PASS");
	   outputParameters.put("MESSAGE", "methodUsed:clickToElement, inputGiven : " + inputParameters[0].toString());
	 
     
     
   	 }catch(Exception e)
	   {
   		 outputParameters.put("STATUS", "FAIL");
  	   outputParameters.put("MESSAGE", "methodUsed:clickToElement, inputGiven : " + inputParameters[0].toString());
  	 
	   }
     return outputParameters;
   }
	
   
   public static Hashtable<String,Object> sendTextOnUi(Object[]inputParameters)
   {
   	 try
   	 {
   		 String path=(String)inputParameters[0];
    	 String  text=(String)inputParameters[1];	  
   	
   	 driver.findElementByXPath(path).sendKeys(text); 
   	 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
   	 
   	 outputParameters.put("STATUS", "PASS");
	   outputParameters.put("MESSAGE", "methodUsed:sendTextOnUi, inputGiven : " + inputParameters[1].toString());
	 
   	 
   	 }catch(Exception e)
	   {
   	  	 outputParameters.put("STATUS", "PASS");
  	   outputParameters.put("MESSAGE", "methodUsed:sendTextOnUi, inputGiven : " + inputParameters[1].toString());
  	 
	   }
     return outputParameters;
   }
   

   public static Hashtable<String,Object> validationByGetText(Object[]inputParameters)
	    {
	   
	   
	   try
	   {
	    	 String givenText=(String)inputParameters[0];
	    	 
	    	 String locator=(String)inputParameters[1];	  
	    	 
	    	       String capturedText=driver.findElement(By.xpath(locator)).getText();
	    	 
	    	 
	    	 if(givenText.equalsIgnoreCase(capturedText))
	    	 {
	    		 System.out.println("Test Case Pass");
	    		 
	    	 }else
	    	 {
	    		 System.out.println("Test Case Fail");
	    	 }
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
   
	   return outputParameters;
   
	    }
	
	
	

}
