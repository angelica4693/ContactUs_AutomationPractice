Feature: ContactUs_Logarunner
@TC_001
Scenario: To check pop up message is displayed when details are not filled

Given Open Url in the browser and Login in to the application
When Click on contact us option
Then Click on send button

@TC_002
Scenario: To check Send button is enabling or not when Message details are not filled

Given Open the Url in the browser
When Click on the Contact us option
Then Enter all the details except message details
Then Click send button

@TC_003
Scenario: To check Send button is enabling or not when subject heading is not chosen

Given Open the URL in the browser
When Click on the Contact Us option
Then Enter all the details except subject heading
Then Click on the Send button

@TC_004
Scenario: To check pop up message is displayed when e-mail is not entered

Given Open URL in the browser
When Click the Contact Us Option
Then Enter all the details except e-mail
Then Click the Send button

@TC_005
Scenario: To check Send button is enabling or not when Order reference is not entered

Given Open the Url
When Click on Contact Us option
Then Enter all the details except order reference
Then Click Send button 