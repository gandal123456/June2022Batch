package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login 
{
	
	
	@Given ("^user open browser with \"(.*)\"  and \"(.*)\"$")
	  public void bLaunch(String key, String value)
	  {
		 Object [] input1=new Object[2];
         input1[0]=key;
         input1[1]=value;
         SeleniumOperations.browserLaunch(input1);
	  }
	  
	
	@Given ("^user enter url as \"(.*)\"$")
	public void bLaunch(String url)
	  {
		 Object [] input2=new Object[1];
         input2[0]=url;				              
     SeleniumOperations.openApplication(input2);
	  }
	  
	@When("^user click on initial Login page$")
	public void user_click_on_initial_Login_page() throws Throwable
	{
		 Object [] input3=new Object[1];
         input3[0]="//*[@class='_2KpZ6l _2doB4z']";					              
                Hashtable<String ,Object> output3=SeleniumOperations.clickOnElement(input3);

 HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "ALL steps" ,output3.get("MESSAGE").toString());
	}

	@When("^user navigate on Login button$")
	public void user_navigate_on_Login_button() throws Throwable 
	{
		 Object [] input4=new Object[1];
         input4[0]="//*[text()='Login']";					              
         Hashtable<String ,Object> output4= SeleniumOperations.moveToElement(input4);
         HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user navigate on Login button$", output4.get("MESSAGE").toString());  
	}

	@When("^user click on My Profile$")
	public void user_click_on_My_Profile() throws Throwable 
	{
		 Object [] input5=new Object[1];
         input5[0]="//*[text()='My Profile']";					              
         Hashtable<String ,Object> output5=SeleniumOperations.clickOnElement(input5);
         HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user click on My Profile$", output5.get("MESSAGE").toString());  
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String uname) throws Throwable 
	{
		Object [] input6=new Object[2];
        input6[0]="//*[@class='_2IX_2- VJZDxU']";
        input6[1]=uname;
        Hashtable<String ,Object> output6= SeleniumOperations.sendTextOnUi(input6);
        
        HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user enter \"([^\"]*)\" as username$", output6.get("MESSAGE").toString());  
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String pass) throws Throwable 
	{
		Object [] input7=new Object[2];
        input7[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
        input7[1]=pass;
        Hashtable<String ,Object> output7= SeleniumOperations.sendTextOnUi(input7);
        HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^user enter \"([^\"]*)\" as password$", output7.get("MESSAGE").toString());  
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable 
	{
		 Object [] input8=new Object[1];
         input8[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";					              
         Hashtable<String ,Object> output8= SeleniumOperations.clickOnElement(input8);
         HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^user click on Login button$", output8.get("MESSAGE").toString());  
	}

	@Then("^Application shows login successfully$")
	public void application_shows_login_successfully() throws Throwable 
	{
	
	}


	
	
	

}
