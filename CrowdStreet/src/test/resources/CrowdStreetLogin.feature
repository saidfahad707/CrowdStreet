@Crowdstreet 
Feature: Validate login function in Crowd street 
Scenario Outline: User able to login with valid credential 
	Given user open web browser and navigate to CR CREATE AN ACCOUNT screen 
	Then user Navigate to Page and Click on CREATE AN ACCOUNT 
	And user enter a valid "<Email>" Address 
	And user enter a valid "<FirstName>" and "<LastName>" for name 
	And user enter a valid "<CreatePassword>" and "<ConfirmPassword>" for password 
	And user enter a valid "<PhoneNumber>" 
	And user click on the No button 
	Then user click on the Agree button and I understand button 
#	When user click on the robot button 
	Then user click on the Sign Up button
	And user navigate to next page then verify "Congrats" message
	
	
	Examples: 
		|Email                          |FirstName  |LastName  |CreatePassword  |ConfirmPassword  |PhoneNumber  |
		|crowdstreet@gamil.com|crowd		|street|@Crowdstreet1		|@Crowdstreet1     |7458996532   |