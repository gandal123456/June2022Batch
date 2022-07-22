Feature: ManageAddress functionality

Background: User successfully logged in 
Given user open browser with "webdriver.chrome.driver"  and "G:\\Automation Support\\chromedriver.exe"
Given user enter url as "https://www.flipkart.com/"
When user click on initial Login page
When user navigate on Login button
When user click on My Profile
When user enter "9168313434" as username
When user enter "abcd@321" as password
When user click on Login button


@SmokeTest
Scenario: Manage address with valid data
When user navigate on Login button
When user click on My Profile
When user enter "9168313434" as username
When user enter "abcd@321" as password
When user click on Login button


