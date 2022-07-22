package utility;

import java.net.UnknownHostException;

import cucumber.api.Scenario;

public class Hookable
{
	
	
	
	public void before(Scenario scenario) throws UnknownHostException
	{
		System.out.println("--------------------Scenarion starts------------------------");
		
		HTMLReportGenerator.TestSuiteStart("G:\\April2022\\report.html", "Flipkart");
		
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		
	}
	
	
	
	
	

	public void after(Scenario scenario)
	{
		System.out.println("--------------------Scenarion ends------------------------");
		
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
		
		
	}
	
	
	
	
	
	
	
	

}
