Feature: Login
@Regression
Scenario: Successful Login with Valid Credentials
	Given User Launch Chrome Browser
	When User opens URL "https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin"
	And User enters Email as "raghu@gmail.com" and Password as "Testing12"
	And Click on Login
	Then Page Title should be "Login in success"
	When User click on Logout link
	Then Page Title should be "Logout success"
	And close browser
